package com.cnwisdom.Prometheus.exception;

import org.springframework.http.HttpStatus;

public class CustomException extends BaseException {

	private static final long serialVersionUID = 1L;

	public CustomException(HttpStatus status, ErrorCode errorCode, String message) {
		super(status, errorCode, message);
	}

	public CustomException(ErrorCode errorCode, String message) {
		super(HttpStatus.BAD_REQUEST,errorCode, message);
	}
	
	public CustomException(ErrorCode errorCode){
		super(HttpStatus.BAD_REQUEST,errorCode, errorCode.getMsg());
	}
	
	public CustomException(HttpStatus status,ErrorCode errorCode){
		super(status, errorCode, errorCode.getMsg());
	}

}
