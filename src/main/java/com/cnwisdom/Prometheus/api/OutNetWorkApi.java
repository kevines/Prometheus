package com.cnwisdom.Prometheus.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cnwisdom.Prometheus.api.requestObject.history.LogRO;
import com.cnwisdom.Prometheus.api.requestObject.monitoring.HotelMonitoringNetHistoryRO;
import com.cnwisdom.Prometheus.api.requestObject.monitoring.OutNetWorkMonitoringRO;
import com.cnwisdom.Prometheus.api.requestObject.util.StatusRO;
import com.cnwisdom.Prometheus.api.viewObject.PageObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(description = "外网")
@RequestMapping(value = "/network", produces = "application/json; charset=UTF-8")
public class OutNetWorkApi {

	private static final Logger log = LoggerFactory.getLogger(OutNetWorkApi.class);

	/**
	 * 
	 * @date 2017年10月19日 下午5:02:52
	 * @author: liuzy
	 * @return
	 * @Description: (获取实时的外网监控)
	 */
	@PostMapping(value = "/networkmonitoring")
	@ApiOperation(value = "获取实时的外网监控")
	public PageObject<String> getNetWorkMonitoring(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) OutNetWorkMonitoringRO netWorkMonitoring,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize) {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月23日 下午3:15:56
	 * @author: liuzy
	 * @param id
	 * @param hotelMonitoringNetHistoryRO
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @Description: (酒店监控页面线路历史数据页签中,外网的历史数据)
	 */
	@PostMapping(value = "/hotelmonitoring/outnetworklog")
	@ApiOperation(value = "酒店监控页面线路历史数据页签中,外网的历史数据")
	public PageObject<String> getHotelMonitoringOutNetWorkLogList(
			@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) HotelMonitoringNetHistoryRO hotelMonitoringNetHistoryRO,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize) {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月23日 下午3:54:59
	 * @author: liuzy
	 * @param id
	 * @param logRO
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @Description: (外网历史查询中历史记录展现)
	 */
	@PostMapping(value = "/outnetworklog")
	@ApiOperation(value = "外网历史查询中历史记录展现")
	public PageObject<String> getOutNetWorkLoglist(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) LogRO logRO,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize) {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月24日 上午9:16:01
	 * @author: liuzy
	 * @param id
	 * @param logRO
	 * @return
	 * @Description: (外网历史查询中历史记录导出)
	 */
	@PostMapping(value = "/outnetworklog/export")
	@ApiOperation(value = "外网历史查询中历史记录导出")
	public String exportOutNetWorkLog(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) LogRO logRO){
		return null;
	}
	
	
	
	/**
	 * 
	 * @date 2017年10月19日 下午5:25:49
	 * @author: liuzy
	 * @return
	 * @Description: (导出外网监控)
	 */
	@PostMapping(value = "/networkmonitoring/export")
	@ApiOperation(value = "导出外网监控")
	public String exportNetWorkMonitoring(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) OutNetWorkMonitoringRO netWorkMonitoringRO) {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月19日 下午5:21:51
	 * @author: liuzy
	 * @return
	 * @Description: TODO(新增一个外网监控)
	 */
	@PostMapping(value = "/networkmonitoring/addnetwork")
	@ApiOperation(value = "新增一个外网监控")
	public StatusRO addNetWork() {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月19日 下午5:23:39
	 * @author: liuzy
	 * @return
	 * @Description: TODO(修改一个外网监控)
	 */
	@PostMapping(value = "/networkmonitoring/updatenetwork")
	@ApiOperation(value = "修改一个外网监控")
	public StatusRO updateNetWork() {
		return null;
	}

}
