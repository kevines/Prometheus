package com.cnwisdom.Prometheus.api.requestObject.monitoring;

import com.cnwisdom.Prometheus.api.requestObject.util.BaseRequestObject;

import io.swagger.annotations.ApiModelProperty;

public class InNetWorkMonitoringRO extends BaseRequestObject{

	@ApiModelProperty(example="线路状态,断开是0,建立是1,未建立是2,未知是3,全部为空")
	private String his_intranet_conn;
	
	@ApiModelProperty(example="内网类型")
	private String his_intranet_type;
	
	@ApiModelProperty(example="备份链路,1是有,0是无,全部为空")
	private String his_backup_conn;
	
	@ApiModelProperty(example="区块")
	private String selectThird;

	public String getHis_intranet_conn() {
		return his_intranet_conn;
	}

	public void setHis_intranet_conn(String his_intranet_conn) {
		this.his_intranet_conn = his_intranet_conn;
	}

	public String getHis_intranet_type() {
		return his_intranet_type;
	}

	public void setHis_intranet_type(String his_intranet_type) {
		this.his_intranet_type = his_intranet_type;
	}

	public String getHis_backup_conn() {
		return his_backup_conn;
	}

	public void setHis_backup_conn(String his_backup_conn) {
		this.his_backup_conn = his_backup_conn;
	}


	public String getSelectThird() {
		return selectThird;
	}

	public void setSelectThird(String selectThird) {
		this.selectThird = selectThird;
	}

	public InNetWorkMonitoringRO(String hname, String ohid, String hgid, String mkcode, String runType, String dmlflag,
			String rg_code, String prov_code, String city_code, String his_intranet_conn, String his_intranet_type,
			String his_backup_conn, String selectThird) {
		super(hname, ohid, hgid, mkcode, runType, dmlflag, rg_code, prov_code, city_code);
		this.his_intranet_conn = his_intranet_conn;
		this.his_intranet_type = his_intranet_type;
		this.his_backup_conn = his_backup_conn;
		this.selectThird = selectThird;
	}

	
	
	
}
