package com.cnwisdom.Prometheus.api.requestObject.hardwarecheck;

import com.cnwisdom.Prometheus.api.requestObject.util.BaseRequestObject;

import io.swagger.annotations.ApiModelProperty;

public class CheckGateWayRO extends BaseRequestObject{

	@ApiModelProperty(example = "外网IP")
	private String rip;
	
	@ApiModelProperty(example = "安装者")
	private String mkcfguser;
	
	@ApiModelProperty(example = "设备状态,6是全部,0是已下线,1是已发现,2是未审核,3是已审核,4是上线中,是已上线")
	private String mkcheckedstate;

	public String getRip() {
		return rip;
	}

	public void setRip(String rip) {
		this.rip = rip;
	}

	public String getMkcfguser() {
		return mkcfguser;
	}

	public void setMkcfguser(String mkcfguser) {
		this.mkcfguser = mkcfguser;
	}

	public String getMkcheckedstate() {
		return mkcheckedstate;
	}

	public void setMkcheckedstate(String mkcheckedstate) {
		this.mkcheckedstate = mkcheckedstate;
	}

	public CheckGateWayRO(String hname, String ohid, String hgid, String mkcode, String runType, String dmlflag,
			String rg_code, String prov_code, String city_code, String rip, String mkcfguser, String mkcheckedstate) {
		super(hname, ohid, hgid, mkcode, runType, dmlflag, rg_code, prov_code, city_code);
		this.rip = rip;
		this.mkcfguser = mkcfguser;
		this.mkcheckedstate = mkcheckedstate;
	}
	
	
}
