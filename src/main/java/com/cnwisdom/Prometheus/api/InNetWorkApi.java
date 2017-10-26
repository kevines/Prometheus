package com.cnwisdom.Prometheus.api;

import java.awt.List;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cnwisdom.Prometheus.api.requestObject.monitoring.HotelMonitoringNetHistoryRO;
import com.cnwisdom.Prometheus.api.requestObject.monitoring.InNetWorkMonitoringRO;
import com.cnwisdom.Prometheus.api.requestObject.util.StatusRO;
import com.cnwisdom.Prometheus.api.viewObject.PageObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(description="内网")
@RequestMapping(value="/innetwork",produces = "application/json; charset=UTF-8")
public class InNetWorkApi {

	private Logger log = Logger.getLogger(this.getClass());
	
	
	/**
	 * 
	 * @date 2017年10月19日 下午5:43:13
	 * @author: liuzy
	 * @return
	 * @Description: (获取实时的内网监控)
	 */
	@PostMapping(value="/innetworkmonitoring")
	@ApiOperation(value="获取实时的内网监控")
	public PageObject<String> getInNetWorkMonitoring(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) InNetWorkMonitoringRO inNetWorkMonitoringRO,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize){
		return null;
	}
	
	
	/**
	 * 
	 * @date 2017年10月19日 下午5:51:04
	 * @author: liuzy
	 * @return
	 * @Description: TODO(新增内网监控)
	 */
	@PostMapping(value="/addinnetwork")
	@ApiOperation(value="新增内网监控")
	public StatusRO addInNetWorkMonitoring(){
		return null;
	}
	
	
	
	/**
	 * 
	 * @date 2017年10月19日 下午5:52:08
	 * @author: liuzy
	 * @return
	 * @Description: TODO(更新内网监控)
	 */
	@PostMapping(value="/updateinnetwork")
	@ApiOperation(value="更新内网监控")
	public StatusRO upadteInNetWorkMonitoring(){
		return null;
	}
	
	
	/**
	 * 
	 * @date 2017年10月19日 下午5:54:18
	 * @author: liuzy
	 * @return
	 * @Description: (导出内网监控)
	 */
	@PostMapping(value="/networkmonitoring/export")
	@ApiOperation(value="导出内网监控")
	public String exportInNetWorkMonitoring(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) InNetWorkMonitoringRO inNetWorkMonitoringRO){
		return null;
	}
	
	/**
	 * 
	 * @date 2017年10月20日 下午3:24:55
	 * @author: liuzy
	 * @param id
	 * @param hotelMonitoringNetHistory
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @Description: (酒店监控页面线路历史数据页签中,内网的历史数据)
	 */
	@PostMapping(value="/hotelmonitoring/innetworklog")
	@ApiOperation(value="酒店监控页面线路历史数据页签中,内网的历史数据")
	public PageObject<String> getHotelMonitoringInNetWorkLogList(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) HotelMonitoringNetHistoryRO hotelMonitoringNetHistory,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize){
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
