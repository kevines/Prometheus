package com.cnwisdom.Prometheus.api.requestObject.monitoring;

import com.cnwisdom.Prometheus.api.requestObject.util.BaseRequestObject;

import io.swagger.annotations.ApiModelProperty;

public class OutNetWorkMonitoringRO extends BaseRequestObject{

	@ApiModelProperty(example="流量类型,1是当前,2是峰值,全部为空")
	private String floowStyle;
	
	@ApiModelProperty(example="外网状态,1是连接,0是断开,全部为空")
	private String upstate;
	
	@ApiModelProperty(example="是否双线,1是双线,2是单线,全部为空")
	private String singleDouble;
	
	@ApiModelProperty(example="带宽使用率,0.1至0.9代表对应大于百分比,全部为空")
	private String bandwidthrate;
	
	@ApiModelProperty(example="区块")
	private String selectThird;

	public String getFloowStyle() {
		return floowStyle;
	}

	public void setFloowStyle(String floowStyle) {
		this.floowStyle = floowStyle;
	}

	public String getUpstate() {
		return upstate;
	}

	public void setUpstate(String upstate) {
		this.upstate = upstate;
	}

	public String getSingleDouble() {
		return singleDouble;
	}

	public void setSingleDouble(String singleDouble) {
		this.singleDouble = singleDouble;
	}

	public String getBandwidthrate() {
		return bandwidthrate;
	}

	public void setBandwidthrate(String bandwidthrate) {
		this.bandwidthrate = bandwidthrate;
	}

	public String getSelectThird() {
		return selectThird;
	}

	public void setSelectThird(String selectThird) {
		this.selectThird = selectThird;
	}

	public OutNetWorkMonitoringRO(String hname, String ohid, String hgid, String mkcode, String runType, String dmlflag,
			String rg_code, String prov_code, String city_code, String floowStyle, String upstate, String singleDouble,
			String bandwidthrate, String selectThird) {
		super(hname, ohid, hgid, mkcode, runType, dmlflag, rg_code, prov_code, city_code);
		this.floowStyle = floowStyle;
		this.upstate = upstate;
		this.singleDouble = singleDouble;
		this.bandwidthrate = bandwidthrate;
		this.selectThird = selectThird;
	}

	
	
	
}
