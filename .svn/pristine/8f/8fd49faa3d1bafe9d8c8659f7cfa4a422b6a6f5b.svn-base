package com.cnwisdom.Prometheus.api.requestObject.hardwarecheck;

import com.cnwisdom.Prometheus.api.requestObject.util.BaseRequestObject;

import io.swagger.annotations.ApiModelProperty;

public class CheckACRO extends BaseRequestObject{

	@ApiModelProperty(example="AC状态,0是未录入,1是未发现,2是已发现,全部为空")
	private String acid;
	
	@ApiModelProperty(example="AC展示状态,0是全部,2是已展示,1是未展示")
	private String dmlflag_ac;
	
	@ApiModelProperty(example="AC品牌,RuiJie,Autelan,ZkCom,ZyXEL,全部为空")
	private String actype;
	
	@ApiModelProperty(example="区块")
	private String selectThird;

	public String getAcid() {
		return acid;
	}

	public void setAcid(String acid) {
		this.acid = acid;
	}

	public String getDmlflag_ac() {
		return dmlflag_ac;
	}

	public void setDmlflag_ac(String dmlflag_ac) {
		this.dmlflag_ac = dmlflag_ac;
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

	public CheckACRO(String hname, String ohid, String hgid, String mkcode, String runType, String dmlflag,
			String rg_code, String prov_code, String city_code, String acid, String dmlflag_ac, String actype,
			String selectThird) {
		super(hname, ohid, hgid, mkcode, runType, dmlflag, rg_code, prov_code, city_code);
		this.acid = acid;
		this.dmlflag_ac = dmlflag_ac;
		this.actype = actype;
		this.selectThird = selectThird;
	}
	
	
}
