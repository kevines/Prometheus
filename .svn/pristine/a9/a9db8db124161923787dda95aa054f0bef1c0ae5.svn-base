package com.cnwisdom.Prometheus.api.requestObject.monitoring;

import com.cnwisdom.Prometheus.api.requestObject.util.BaseRequestObject;

import io.swagger.annotations.ApiModelProperty;

public class HotelHardwareMonitoringRO extends BaseRequestObject{

	@ApiModelProperty(example = "酒店的IP地址")
	private String ipget;
	
	@ApiModelProperty(example = "区块")
	private String selectThird;

	public String getIpget() {
		return ipget;
	}

	public void setIpget(String ipget) {
		this.ipget = ipget;
	}

	public String getSelectThird() {
		return selectThird;
	}

	public void setSelectThird(String selectThird) {
		this.selectThird = selectThird;
	}

	public HotelHardwareMonitoringRO(String hname, String ohid, String hgid, String mkcode, String runType,
			String dmlflag, String rg_code, String prov_code, String city_code, String ipget, String selectThird) {
		super(hname, ohid, hgid, mkcode, runType, dmlflag, rg_code, prov_code, city_code);
		this.ipget = ipget;
		this.selectThird = selectThird;
	}
	
	
}
