package com.cnwisdom.Prometheus.api.requestObject.configmanager;

import com.cnwisdom.Prometheus.api.requestObject.util.BaseRequestObject;

import io.swagger.annotations.ApiModelProperty;

public class APConfigRO extends BaseRequestObject{

	@ApiModelProperty(example = "状态,1是在线,-1是断开,2是已下线,0是全部")
	private String upstate;

	public String getUpstate() {
		return upstate;
	}

	public void setUpstate(String upstate) {
		this.upstate = upstate;
	}

	public APConfigRO(String hname, String ohid, String hgid, String mkcode, String runType, String dmlflag,
			String rg_code, String prov_code, String city_code, String upstate) {
		super(hname, ohid, hgid, mkcode, runType, dmlflag, rg_code, prov_code, city_code);
		this.upstate = upstate;
	}
	
	
}
