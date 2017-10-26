package com.cnwisdom.Prometheus.api.requestObject.monitoring;

import com.cnwisdom.Prometheus.api.requestObject.util.BaseRequestObject;

import io.swagger.annotations.ApiModelProperty;

public class WifiEquipmentMontoringRO extends BaseRequestObject{

	@ApiModelProperty(example="设备状态,0是异常,1是正常,2是离线,3是位置,全部为空")
	private String state;
	
	@ApiModelProperty(example="AC品牌,RuiJie,Autelan,ZkCom,ZyXEL")
	private String actype;
	
	@ApiModelProperty(example="大区")
	private String selectThird;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getActype() {
		return actype;
	}

	public void setActype(String actype) {
		this.actype = actype;
	}

	public String getSelectThird() {
		return selectThird;
	}

	public void setSelectThird(String selectThird) {
		this.selectThird = selectThird;
	}

	public WifiEquipmentMontoringRO(String hname, String ohid, String hgid, String mkcode, String runType,
			String dmlflag, String rg_code, String prov_code, String city_code, String state, String actype,
			String selectThird) {
		super(hname, ohid, hgid, mkcode, runType, dmlflag, rg_code, prov_code, city_code);
		this.state = state;
		this.actype = actype;
		this.selectThird = selectThird;
	}
	
	
}
