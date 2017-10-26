package com.cnwisdom.Prometheus.api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cnwisdom.Prometheus.api.requestObject.configmanager.APConfigRO;
import com.cnwisdom.Prometheus.api.requestObject.hardwarecheck.CheckACRO;
import com.cnwisdom.Prometheus.api.requestObject.history.LogRO;
import com.cnwisdom.Prometheus.api.requestObject.monitoring.WifiEquipmentMontoringRO;
import com.cnwisdom.Prometheus.api.requestObject.util.StatusRO;
import com.cnwisdom.Prometheus.api.viewObject.PageObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(description = "无线设备,AP和AP管理")
@RequestMapping(value = "/wifiequipment", produces = "application/json; charset=UTF-8")
public class WifiEquipmentApi {

	private static final Logger log = LoggerFactory.getLogger(WifiEquipmentApi.class);

	/**
	 * 
	 * @date 2017年10月20日 上午9:55:21
	 * @author: liuzy
	 * @param id
	 * @param wifiEquipmentMontoringRO
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @Description: (无线设备监控)
	 */
	@PostMapping(value = "/wifiequipmentmonitoring")
	@ApiOperation(value = "无线设备监控")
	public PageObject<String> getWifiEquipmentMonitoring(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) WifiEquipmentMontoringRO wifiEquipmentMontoringRO,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize) {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月20日 下午1:49:10
	 * @author: liuzy
	 * @param id
	 * @param checkACRO
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @Description: (AC管理页面AC展现)
	 */
	@PostMapping(value = "/checkac")
	@ApiOperation(value = "设备审核中的AC管理页面AC展现")
	public PageObject<String> getACList(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) CheckACRO checkACRO,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize) {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月20日 下午1:52:50
	 * @author: liuzy
	 * @param id
	 * @param mkcode
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @Description: ()
	 */
	@PostMapping(value = "/hotelmonitoring/ac")
	@ApiOperation(value = "酒店综合监控页面展现AC")
	public PageObject<String> getHotelmonitoringACList(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("mkcode") @RequestParam(required = true) String mkcode,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize) {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月20日 下午2:27:10
	 * @author: liuzy
	 * @param id
	 * @param apConfigRO
	 * @return
	 * @Description: (配置管理中的AP管理页面AP展现)
	 */
	@PostMapping(value = "/apconfig")
	@ApiOperation(value = "配置管理中的AP管理页面AP展现")
	public PageObject<String> getAPConfigList(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) APConfigRO apConfigRO,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize) {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月20日 下午2:59:55
	 * @author: liuzy
	 * @param id
	 * @param apConfigRO
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @Description: (酒店监控页面无线设备信息页签中AP展现)
	 */
	@PostMapping(value = "/hotelmonitoring/aplist")
	@ApiOperation(value = "酒店监控页面无线设备信息页签中AP展现")
	public PageObject<String> getHotelMonitoringAPList(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) APConfigRO apConfigRO,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize) {
		return null;
	}

	
	/**
	 * 
	 * @date 2017年10月23日 下午2:56:46
	 * @author: liuzy
	 * @param id
	 * @param apLogRO
	 * @return
	 * @Description: (找到离线72小时的AP)
	 */
	@PostMapping(value = "/aplog/apoff72")
	@ApiOperation(value = "离线72小时的AP")
	public PageObject<String> getAPOff72List(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) LogRO apLogRO,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize){
		return null;
	}
	
	/**
	 * 
	 * @date 2017年10月23日 下午3:11:59
	 * @author: liuzy
	 * @param id
	 * @param apLogRO
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @Description: (有着离线72小时的AP的门店)
	 */
	@PostMapping(value = "/aplog/appoff72/store")
	@ApiOperation(value = "有着离线72小时的AP的门店")
	public PageObject<String> getAPOff72StroeList(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) LogRO apLogRO,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize){
		return null;
	}
	
	
	/**
	 * 
	 * @date 2017年10月23日 下午2:23:53
	 * @author: liuzy
	 * @param id
	 * @param apLogRO
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @Description: (历史数据查询中的AP历史查询中AP信息展现)
	 */
	@PostMapping(value = "/aplog/list")
	@ApiOperation(value = "AP历史展现")
	public PageObject<String> getApLogList(@ApiParam("使用者的ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) LogRO apLogRO,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize) {
		return null;
	}
	
	
	/**
	 * 
	 * @date 2017年10月23日 下午2:20:30
	 * @author: liuzy
	 * @param id
	 * @param mkcode
	 * @return
	 * @Description: (酒店监控页面无线设备信息页签中AP信息导出)
	 */
	@PostMapping(value = "/hotelmonitoring/apexport")
	@ApiOperation(value = "酒店监控页面无线设备信息页签中AP信息导出")
	public String exportHotelMonitoringAP(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("mkcode") @RequestParam(required = true) String mkcode){
		return null;
	}
	

	/**
	 * 
	 * @date 2017年10月20日 上午9:58:19
	 * @author: liuzy
	 * @param id
	 * @param wifiEquipmentMontoringRO
	 * @return
	 * @Description: (无线设备监控导出)
	 */
	@PostMapping(value = "/wifiequipmentmonitoring/export")
	@ApiOperation(value = "无线设备监控导出")
	public String export(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) WifiEquipmentMontoringRO wifiEquipmentMontoringRO) {
		return null;
	}

	
	/**
	 * 
	 * @date 2017年10月23日 下午2:33:40
	 * @author: liuzy
	 * @param id
	 * @param apLogRO
	 * @return
	 * @Description: (历史数据查询中的AP历史查询中AP信息导出)
	 */
	@PostMapping(value = "/aplog/export")
	@ApiOperation(value = "AP历史导出")
	public String exportAPLog(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) LogRO apLogRO){
		return null;
	}
	
	
	/**
	 * 
	 * @date 2017年10月20日 上午11:02:34
	 * @author: liuzy
	 * @param id
	 * @param acid
	 * @param mkcode
	 * @return
	 * @Description: TODO(拿到单个的AC)
	 */
	@GetMapping(value = "/getAC")
	@ApiOperation(value = "获得单个AC")
	public String getAc(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("ACID") @RequestParam(required = true) String acid,
			@ApiParam("mkcode") @RequestParam(required = false) String mkcode) {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月20日 上午11:09:49
	 * @author: liuzy
	 * @param id
	 * @param mkcode
	 * @param flag
	 * @return
	 * @Description: (修改这个AC)
	 */
	@PostMapping(value = "/updateAC")
	@ApiOperation(value = "修改这个AC")
	public StatusRO updateAC(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("mkcode") @RequestParam(required = true) String mkcode,
			@ApiParam("flag") @RequestParam(required = true) String flag) {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月20日 上午11:19:16
	 * @author: liuzy
	 * @param id
	 * @param acid
	 * @return
	 * @Description: (删除这个AC)
	 */
	@PostMapping(value = "/delAC")
	@ApiOperation(value = "删除这个AC")
	public StatusRO deltetAC(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("ACID") @RequestParam(required = true) String acid) {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月20日 下午2:02:21
	 * @author: liuzy
	 * @param id
	 * @param apid
	 * @return
	 * @Description: (拿到单个AP)
	 */
	@GetMapping(value = "/getAP")
	@ApiOperation(value = "拿到单个AP")
	public String getAP(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("APID") @RequestParam(required = true) String apid) {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月20日 下午2:09:07
	 * @author: liuzy
	 * @param id
	 * @param ap
	 * @return
	 * @Description: (修改单个AP)
	 */
	@PostMapping(value = "/updateAP")
	@ApiOperation(value = "修改单个AP")
	public StatusRO updateAP(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) String ap) {
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
