package com.cnwisdom.Prometheus.api.requestObject.history;

import com.cnwisdom.Prometheus.api.requestObject.util.BaseRequestObject;

import io.swagger.annotations.ApiModelProperty;

public class LogRO extends BaseRequestObject{

	@ApiModelProperty(example="开始时间")
	private String startTime;
	
	@ApiModelProperty(example="结束时间")
	private String endTime;
	
	@ApiModelProperty(example="选择区块")
	private String selectThird;

	@ApiModelProperty(example="绩效月份,例如2017-10")
	private String countData;
	
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

	public String getSelectThird() {
		return selectThird;
	}

	public void setSelectThird(String selectThird) {
		this.selectThird = selectThird;
	}

	public String getCountData() {
		return countData;
	}

	public void setCountData(String countData) {
		this.countData = countData;
	}

	public LogRO(String hname, String ohid, String hgid, String mkcode, String runType, String dmlflag,
			String rg_code, String prov_code, String city_code, String startTime, String endTime, String selectThird,
			String countData) {
		super(hname, ohid, hgid, mkcode, runType, dmlflag, rg_code, prov_code, city_code);
		this.startTime = startTime;
		this.endTime = endTime;
		this.selectThird = selectThird;
		this.countData = countData;
	}

	
	
	
	

}
