package com.cnwisdom.Prometheus.api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cnwisdom.Prometheus.api.requestObject.hardwarecheck.CheckGateWayRO;
import com.cnwisdom.Prometheus.api.requestObject.monitoring.GetWayMonitoringRO;
import com.cnwisdom.Prometheus.api.requestObject.util.StatusRO;
import com.cnwisdom.Prometheus.api.viewObject.PageObject;
import com.cnwisdom.Prometheus.api.viewObject.extra.HotelMonitoring;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(description = "网关")
@RequestMapping(value = "/gateway", produces = "application/json; charset=UTF-8")
public class GateWayApi {

	private static final Logger log = LoggerFactory.getLogger(GateWayApi.class);

	/**
	 * 
	 * @date 2017年10月20日 上午9:32:22
	 * @author: liuzy
	 * @param id
	 * @param getWayMonitoringRO
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @Description: (网络监控里面的网关监控页面展现)
	 */
	@PostMapping(value = "/gatewaymonitoring")
	@ApiOperation(value = "获取网关监控")
	public PageObject<String> getGateWayMonitoring(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) GetWayMonitoringRO getWayMonitoringRO,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize) {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月20日 上午10:48:03
	 * @author: liuzy
	 * @param id
	 * @param mkcode
	 * @param flag
	 * @return
	 * @Description: (整合酒店监控数据的统一页面)
	 */
	@PostMapping(value = "/hotelmonitoring")
	@ApiOperation(value = "酒店监控")
	public HotelMonitoring getHotelMonitoring(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("mkcode") @RequestParam(required = true) String mkcode,
			@ApiParam("flag") @RequestParam(required = true) String flag) {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月26日 下午2:55:20
	 * @author: liuzy
	 * @param id
	 * @param checkGateWayRO
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @Description: TODO(设备审核中网关审核的页面展现)
	 */
	@PostMapping(value = "/checkgateway")
	@ApiOperation(value = "网关审核")
	public PageObject<String> getGateWaylist(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) CheckGateWayRO checkGateWayRO,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize){
		return null;
	}
	
	
	/**
	 * 
	 * @date 2017年10月26日 下午3:03:58
	 * @author: liuzy
	 * @param id
	 * @param hname
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * @Description: TODO(设备审核中网关审核的酒店绑定列表)
	 */
	@PostMapping(value = "/checkgateway/hotel")
	@ApiOperation(value = "绑定酒店列表")
	public PageObject<String> getGateWayHotel(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("酒店名称") @RequestParam(required = true) String hname,
			@ApiParam("pageIndex") @RequestParam(required = true) String pageIndex,
			@ApiParam("pageSize") @RequestParam(required = true) String pageSize){
		return null;
	}
	
	
	
	
	
	/**
	 * 
	 * @date 2017年10月20日 上午9:32:55
	 * @author: liuzy
	 * @param id
	 * @param getWayMonitoringRO
	 * @return
	 * @Description: (导出网关监控)
	 */
	@PostMapping(value = "/networkmonitoring/export")
	@ApiOperation(value = "导出网关监控")
	public String exportGateWayMonitoring(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("请求数据") @RequestParam(required = true) GetWayMonitoringRO getWayMonitoringRO) {
		return null;
	}

	
	
	
	
	
	
	
	/**
	 * 
	 * @date 2017年10月20日 上午9:32:40
	 * @author: liuzy
	 * @return
	 * @Description: TODO(新增一个网关)
	 */
	@PostMapping(value = "/gatewaymonitoring/addgetway")
	@ApiOperation(value = "新增一个网关")
	public StatusRO addGateWay() {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月24日 上午9:39:43
	 * @author: liuzy
	 * @param id
	 * @param hid
	 * @param hname
	 * @param mkcode
	 * @return
	 * @Description: (更改网关信息)
	 */
	@PostMapping(value = "/checkgateway/updategetway")
	@ApiOperation(value = "更改网关信息")
	public StatusRO updateGateWay(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("酒店内部ID") @RequestParam(required = true) String hid,
			@ApiParam("酒店名称") @RequestParam(required = true) String hname,
			@ApiParam("网关编号") @RequestParam(required = true) String mkcode) {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月24日 上午9:37:40
	 * @author: liuzy
	 * @param id
	 * @param hid
	 * @param hname
	 * @param mkcode
	 * @return
	 * @Description: (设备审核中的网关审核里面,获得单个网关)
	 */
	@PostMapping(value = "/checkgateway/getgateway")
	@ApiOperation(value = "获得单个网关")
	public PageObject<String> getGateway(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("网关的ID") @RequestParam(required = true) String rosId) {
		return null;
	}

	/**
	 * 
	 * @date 2017年10月24日 上午9:52:44
	 * @author: liuzy
	 * @param id
	 * @param rosId
	 * @param dmlflag
	 * @return
	 * @Description: (设备审核中的网关审核里面决定是否展现设备)
	 */
	@PostMapping(value="/checkgateaway/lock")
	@ApiOperation(value = "选择是否展现设备")
	public StatusRO lockGateway(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("网关的ID") @RequestParam(required = true) String rosId,
			@ApiParam("判断该网关是否不可见,展示是2,未展示是3") @RequestParam(required = true) String dmlflag){
		return null;
	}
	
	
	/**
	 * 
	 * @date 2017年10月24日 上午9:57:52
	 * @author: liuzy
	 * @param id
	 * @param rosId
	 * @param mkcode
	 * @param flag
	 * @return
	 * @Description: (设备审核中的网关审核里面下线设备)
	 */
	@PostMapping(value = "/checkgateway/equipdown")
	@ApiOperation(value = "设备下线")
	public StatusRO gatewayDown(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("网关ID") @RequestParam(required = true) String rosId,
			@ApiParam("网关编码") @RequestParam(required = true) String mkcode,
			@ApiParam("下线标识符") @RequestParam(required = true) String flag){
		return null;
	}
	
	/**
	 * 
	 * @date 2017年10月24日 上午10:35:39
	 * @author: liuzy
	 * @param id
	 * @param mkcode
	 * @param hname
	 * @param hid
	 * @param rosId
	 * @return
	 * @Description: (设备审核中的网关审核里面设备和酒店相互绑定)
	 */
	@PostMapping(value = "/checkgateway/bindhotel")
	@ApiOperation(value = "设备和酒店绑定")
	public StatusRO gatewayBindHotel(@ApiParam("使用者ID") @RequestParam(required = true) String id,
			@ApiParam("网关编码") @RequestParam(required = true) String mkcode,
			@ApiParam("酒店名称") @RequestParam(required = true) String hname,
			@ApiParam("酒店编码") @RequestParam(required = true) String hid,
			@ApiParam("网关ID") @RequestParam(required = true) String rosId){
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
