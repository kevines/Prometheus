package com.cnwisdom.Prometheus.api.requestObject.util;

import io.swagger.annotations.ApiModelProperty;

public class StatusRO {

	@ApiModelProperty(example="状态")
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
}
