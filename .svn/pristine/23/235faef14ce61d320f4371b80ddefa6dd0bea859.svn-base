package com.cnwisdom.Prometheus.api.requestObject.monitoring;

import com.cnwisdom.Prometheus.api.requestObject.util.BaseRequestObject;

import io.swagger.annotations.ApiModelProperty;


/**
 * 
 * @Title: HotelMonitoringNetHistory.java
 * @Package: com.cnwisdom.Prometheus.api.requestObject.monitoring
 * @Description:(酒店监控线路历史数据页签的请求数据体)
 * 2017年10月20日 下午3:19:40
 * @author: liuzy
 *
 */
public class HotelMonitoringNetHistoryRO extends BaseRequestObject{

	@ApiModelProperty(example = "开始时间,例如2017-10-10")
	private String startTime;
	
	@ApiModelProperty(example = "结束时间,例如2017-10-19")
	private String endTime;

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public HotelMonitoringNetHistoryRO(String hname, String ohid, String hgid, String mkcode, String runType,
			String dmlflag, String rg_code, String prov_code, String city_code, String startTime, String endTime) {
		super(hname, ohid, hgid, mkcode, runType, dmlflag, rg_code, prov_code, city_code);
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	
}
