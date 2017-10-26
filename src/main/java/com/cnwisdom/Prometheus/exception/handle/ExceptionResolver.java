package com.cnwisdom.Prometheus.exception.handle;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.cnwisdom.Prometheus.exception.BaseException;
import com.cnwisdom.Prometheus.utils.ObjectToJsonUtil;



public class ExceptionResolver implements HandlerExceptionResolver {
	private static Logger log = Logger.getLogger(ExceptionResolver.class);


	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o,
			Exception exception) {
		ModelAndView mv = new ModelAndView();
		/* 使用response返回 */
		response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()); // 设置状态码
		response.setContentType(MediaType.APPLICATION_JSON_VALUE); // 设置ContentType
		response.setCharacterEncoding("UTF-8"); // 避免乱码
		response.setHeader("Cache-Control", "no-cache, must-revalidate");
		if (exception instanceof BaseException) {
			BaseException baseException = (BaseException) exception;
			if (baseException.getStatus() != null) {
				log.info(MessageFormat.format("httpStatusCode:{0}", baseException.getStatus()));
				response.setStatus(baseException.getStatus().value()); // 设置状态码
			}
			try {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("message", baseException.getMessage());
				map.put("errorcode", baseException.getErrorCode().getCode());
				String json = ObjectToJsonUtil.ToJson(map);
				log.info(MessageFormat.format("返回前端参数:{0}", json));
				response.getWriter().write(json);
			} catch (IOException e) {
				log.error(MessageFormat.format("与客户端通讯异常:{0}", e.getMessage()), e);
			}
			log.debug(MessageFormat.format("异常:{0}" + baseException.getMessage(), baseException));
		} else {
			try {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("message", exception.getClass().toString());
				map.put("errorcode", "500");
				response.getWriter().write(ObjectToJsonUtil.ToJson(map));
				log.info(MessageFormat.format("返回前端参数:{0}", ObjectToJsonUtil.ToJson(map)));
			} catch (IOException e) {
				log.error(MessageFormat.format("与客户端通讯异常:{0}", e.getMessage()), e);
			}
			log.debug(MessageFormat.format("异常:{0}" + exception.getMessage(), exception));
		}
		return mv;
	}
}