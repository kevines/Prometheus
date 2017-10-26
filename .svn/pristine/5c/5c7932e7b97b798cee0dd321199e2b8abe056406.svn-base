package com.cnwisdom.Prometheus.api.requestObject.monitoring;

import com.cnwisdom.Prometheus.api.requestObject.util.BaseRequestObject;

import io.swagger.annotations.ApiModelProperty;

public class HardwareMonitoringRO extends BaseRequestObject{

	@ApiModelProperty(example = "设备的IP地址")
	private String ipaddress;
	
	@ApiModelProperty(example = "操作系统")
	private String osname;
	
	@ApiModelProperty(example = "内存")
	private String capacity;
	
	@ApiModelProperty(example = "品牌")
	private String smanufacturer;
	
	@ApiModelProperty(example = "C盘使用率")
	private String used;
	
	@ApiModelProperty(example = "设备的状态")
	private String time;
	
	@ApiModelProperty(example = "区块")
	private String selectThird;

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public String getOsname() {
		return osname;
	}

	public void setOsname(String osname) {
		this.osname = osname;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getSmanufacturer() {
		return smanufacturer;
	}

	public void setSmanufacturer(String smanufacturer) {
		this.smanufacturer = smanufacturer;
	}

	public String getUsed() {
		return used;
	}

	public void setUsed(String used) {
		this.used = used;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSelectThird() {
		return selectThird;
	}

	public void setSelectThird(String selectThird) {
		this.selectThird = selectThird;
	}

	public HardwareMonitoringRO(String hname, String ohid, String hgid, String mkcode, String runType, String dmlflag,
			String rg_code, String prov_code, String city_code, String ipaddress, String osname, String capacity,
			String smanufacturer, String used, String time, String selectThird) {
		super(hname, ohid, hgid, mkcode, runType, dmlflag, rg_code, prov_code, city_code);
		this.ipaddress = ipaddress;
		this.osname = osname;
		this.capacity = capacity;
		this.smanufacturer = smanufacturer;
		this.used = used;
		this.time = time;
		this.selectThird = selectThird;
	}

	
	
	
}
