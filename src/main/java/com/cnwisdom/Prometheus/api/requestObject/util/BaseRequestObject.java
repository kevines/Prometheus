package com.cnwisdom.Prometheus.api.requestObject.util;

import io.swagger.annotations.ApiModelProperty;

public class BaseRequestObject {

	@ApiModelProperty(example = "酒店名称")
	private String hname;

	@ApiModelProperty(example = "门店编码")
	private String ohid;

	@ApiModelProperty(example = "酒店品牌编码")
	private String hgid;

	@ApiModelProperty(example = "设备编码")
	private String mkcode;

	@ApiModelProperty(example = "经营模式,0是未知,1是直营,2是特许,全部是为空")
	private String runType;

	@ApiModelProperty(example = "展示状态,0是未展示,1是已展示,全部是为空")
	private String dmlflag;

	@ApiModelProperty(example = "大区")
	private String rg_code;

	@ApiModelProperty(example = "省份")
	private String prov_code;

	@ApiModelProperty(example = "城市")
	private String city_code;

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getOhid() {
		return ohid;
	}

	public void setOhid(String ohid) {
		this.ohid = ohid;
	}

	public String getHgid() {
		return hgid;
	}

	public void setHgid(String hgid) {
		this.hgid = hgid;
	}

	public String getMkcode() {
		return mkcode;
	}

	public void setMkcode(String mkcode) {
		this.mkcode = mkcode;
	}

	public String getRunType() {
		return runType;
	}

	public void setRunType(String runType) {
		this.runType = runType;
	}

	public String getDmlflag() {
		return dmlflag;
	}

	public void setDmlflag(String dmlflag) {
		this.dmlflag = dmlflag;
	}

	public String getRg_code() {
		return rg_code;
	}

	public void setRg_code(String rg_code) {
		this.rg_code = rg_code;
	}

	public String getProv_code() {
		return prov_code;
	}

	public void setProv_code(String prov_code) {
		this.prov_code = prov_code;
	}

	public String getCity_code() {
		return city_code;
	}

	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}

	public BaseRequestObject(String hname, String ohid, String hgid, String mkcode, String runType, String dmlflag,
			String rg_code, String prov_code, String city_code) {
		super();
		this.hname = hname;
		this.ohid = ohid;
		this.hgid = hgid;
		this.mkcode = mkcode;
		this.runType = runType;
		this.dmlflag = dmlflag;
		this.rg_code = rg_code;
		this.prov_code = prov_code;
		this.city_code = city_code;
	}

}
