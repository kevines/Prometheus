package com.cnwisdom.Prometheus.utils;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

import javax.servlet.DispatcherType;

import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.filter.RequestContextFilter;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import io.swagger.jersey.config.JerseyJaxrsConfig;

public abstract class JettyServerLauncher {
  private static final String CONTEXT_PATH = "/Permetheus";
  private static Logger log = Logger.getLogger(JettyServerLauncher.class);
  private final Server jettyServer;

  public JettyServerLauncher() {
    jettyServer = createJettyServer();
  }

  public static void launch(final JettyServerLauncher serverLauncher) {
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        serverLauncher.shutdown();
      }
    });

    new Thread(() -> {
      try {
        serverLauncher.runForever();
      } catch (Exception e) {
        log.error("Failed to launch jetty server due to: ", e);
      }
    }).start();
  }

  private void shutdown() {
    try {
      jettyServer.stop();
    } catch (Exception e) {
      log.warn("Failed to stop server normally.", e);
    }
  }

  private void runForever() throws Exception {
    jettyServer.start();
    jettyServer.join();
  }

  private Server createJettyServer() {

    ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);

    // spring context loader
    ContextLoaderListener contextLoaderListener = new ContextLoaderListener();
    handler.addEventListener(contextLoaderListener);
    handler.setInitParameter("contextConfigLocation", getSpringContextLocation());

    handler.setContextPath(CONTEXT_PATH);
    // 添加过滤器
    handler.addFilter(RequestContextFilter.class, "/*", EnumSet.of(DispatcherType.REQUEST));

    handler.addServlet(createJerseyServletHolder(), "/rest/*");
    handler.addServlet(createSwaggerServletHolder(), "/api/*");

    configServletContextHandler(handler);

    Server server = new Server(getServerPort());
    server.setHandler(handler);
    return server;
  }

  private ServletHolder createSwaggerServletHolder() {
    ServletHolder swaggerServeletHolder = new ServletHolder(new JerseyJaxrsConfig());
    swaggerServeletHolder.setInitParameters(ImmutableMap.of("api.version", "1.5.0",
        "swagger.api.basepath", "http://192.168.6.171:8081/gaia/rest"));
    swaggerServeletHolder.setInitOrder(2);

    return swaggerServeletHolder;
  }

  private ServletHolder createJerseyServletHolder() {
    ServletHolder jerseyServletHolder = new ServletHolder(new ServletContainer());
    jerseyServletHolder.setInitParameter("com.sun.jersey.api.json.POJOMappingFeature", "true");

    List<String> providerPackages = Lists.newArrayList("io.swagger.jaxrs.listing",
        "com.thoughtworks.gaia.filter", "com.thoughtworks.gaia.exception.handler");
    providerPackages.addAll(Arrays.asList(getJerseyProviderPackages()));

    jerseyServletHolder.setInitParameter("jersey.config.server.provider.packages",
        Joiner.on(",").join(providerPackages));
    List<String> features = Arrays.asList(
        // "org.glassfish.jersey.message.filtering.EntityFilteringFeature",
        "org.glassfish.jersey.jackson.JacksonFeature");
    jerseyServletHolder.setInitParameter("jersey.config.server.provider.classnames",
        Joiner.on(",").join(features));
    jerseyServletHolder.setInitParameter("jersey.config.server.provider.scanning.recursive",
        "true");
    jerseyServletHolder.setInitOrder(1);
    return jerseyServletHolder;
  }

  protected void configServletContextHandler(final ServletContextHandler handler) {}

  protected abstract String[] getJerseyProviderPackages();

  protected abstract String getSpringContextLocation();

  protected abstract int getServerPort();
}
