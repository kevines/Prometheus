package com.cnwisdom.Prometheus.api.requestObject.monitoring;

import com.cnwisdom.Prometheus.api.requestObject.util.BaseRequestObject;

import io.swagger.annotations.ApiModelProperty;

public class GetWayMonitoringRO extends BaseRequestObject{

	@ApiModelProperty(example="类型,1是CPU,2是内存,3是硬盘,全部为空")
	private String mdc;
	
	@ApiModelProperty(example="设备状态,1是连接,0是断开,-1是位置,全部为空")
	private String upstate;
	
	@ApiModelProperty(example="使用率,0.1至0.9对应百分比,全部为空")
	private String mdcState;
	
	@ApiModelProperty(example="门户状态,1是开启,0是关闭,全部为空")
	private String portalState;
	
	@ApiModelProperty(example="区块")
	private String selectThird;

	public String getMdc() {
		return mdc;
	}

	public void setMdc(String mdc) {
		this.mdc = mdc;
	}

	public String getUpstate() {
		return upstate;
	}

	public void setUpstate(String upstate) {
		this.upstate = upstate;
	}

	public String getMdcState() {
		return mdcState;
	}

	public void setMdcState(String mdcState) {
		this.mdcState = mdcState;
	}

	public String getSelectThird() {
		return selectThird;
	}

	public void setSelectThird(String selectThird) {
		this.selectThird = selectThird;
	}

	public String getPortalState() {
		return portalState;
	}

	public void setPortalState(String portalState) {
		this.portalState = portalState;
	}

	public GetWayMonitoringRO(String hname, String ohid, String hgid, String mkcode, String runType, String dmlflag,
			String rg_code, String prov_code, String city_code, String mdc, String upstate, String mdcState,
			String portalState, String selectThird) {
		super(hname, ohid, hgid, mkcode, runType, dmlflag, rg_code, prov_code, city_code);
		this.mdc = mdc;
		this.upstate = upstate;
		this.mdcState = mdcState;
		this.portalState = portalState;
		this.selectThird = selectThird;
	}

	
	
	
}
