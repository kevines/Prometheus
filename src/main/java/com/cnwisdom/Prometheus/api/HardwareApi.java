package com.cnwisdom.Prometheus.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cnwisdom.Prometheus.api.requestObject.monitoring.HardwareMonitoringRO;
import com.cnwisdom.Prometheus.api.requestObject.monitoring.HotelHardwareMonitoringRO;
import com.cnwisdom.Prometheus.api.requestObject.util.StatusRO;
import com.cnwisdom.Prometheus.api.viewObject.PageObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(description = "酒店前台设备")
@RequestMapping(value="/hardware", produces = "application/json; charset=UTF-8")
public class HardwareApi {

	private static final Logger log = LoggerFactory.getLogger(HardwareApi.class);
	
	/**
	 * 
	 * @date 2017年10月26日 下午3:28:29
	 * @author: liuzy
	 * @param id
	 * @param hardwareMonitoringRO
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @Description: TODO(网络监控中前台设备监控列表)
	 */
	@PostMapping("/hardwaremonitoring")
	@ApiOperation("酒店前台设备展现")
	public PageObject<String> getHardwareList(@ApiParam("使用者") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) HardwareMonitoringRO hardwareMonitoringRO,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize){
		return null;
	}
	
	/**
	 * 
	 * @date 2017年10月26日 下午4:33:34
	 * @author: liuzy
	 * @param id
	 * @param hotelHardwareMonitoringRO
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @Description: TODO(网络监控中门店前台设备统计列表)
	 */
	@PostMapping("/hotelhardwaremonitoring")
	@ApiOperation("酒店前台设备统计")
	public PageObject<String> getHotelHardwareList(@ApiParam("使用者") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) HotelHardwareMonitoringRO hotelHardwareMonitoringRO,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize){
		return null;
	}
	
	
	/**
	 * 
	 * @date 2017年10月26日 下午4:47:07
	 * @author: liuzy
	 * @param id
	 * @param hardwareMonitoringRO
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @Description: TODO(网络监控中前台设备导出)
	 */
	@PostMapping("/hardwaremonitoring/export")
	@ApiOperation("前台设备导出")
	public String exportHardware(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) HardwareMonitoringRO hardwareMonitoringRO){
		return null;
	}
	
	/**
	 * 
	 * @date 2017年10月26日 下午4:54:35
	 * @author: liuzy
	 * @param id
	 * @param hotelHardwareMonitoringRO
	 * @return
	 * @Description: TODO(网络监控中酒店前台设备导出)
	 */
	@PostMapping("/hotelhardwaremonitoring/export")
	@ApiOperation("酒店前台设备统计导出")
	public String exportHotelHardware(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) HotelHardwareMonitoringRO hotelHardwareMonitoringRO){
		return null;
	}
	
	/**
	 * 
	 * @date 2017年10月26日 下午5:09:42
	 * @author: liuzy
	 * @param id
	 * @param hardwareID
	 * @return
	 * @Description: TODO(网络监控中前台设备永久下线)
	 */
	@PostMapping("/hardwaremonitoring/equipdown")
	@ApiOperation("前台设备永久下线")
	public StatusRO equipDown(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("设备ID") @RequestParam(required = true) String hardwareID){
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
