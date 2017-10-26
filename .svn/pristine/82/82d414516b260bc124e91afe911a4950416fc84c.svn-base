package com.cnwisdom.Prometheus.exception;

public enum ErrorCode {
    
    UNKNOWN(1000,"未知错误"),
    SYSTEM_ERROR(1001,"系统异常"),
    PARAM_ERROR(1002,"参数错误"),
    INSER_ERROR(1003,"插入错误"),
    UPDATE_ERROR(1004,"更新失败"),
    UNAUTHORIZED_ACCESS(1005,"无访问权限"),
    MD5_ENCRYPTION_ERROR(1010,"MD5加密出错"), 
    WORK_DEAL_ERROR(1006,"找不到该工单号"),
    REQUEST_TYPE_ERROR(1405,"请求类型错误"),
    BAD_REQUEST(1400,"错误请求"),
    NOT_FOUND(1404,"找不到接口"),
    
    USER_LOGIN_ERROR(4001,"登录失败"),
    USER_CODE_DISABLED(4002,"账号禁用"),
    AUTHENTICATION_NOT_EXISTED(4003,"账号不存在"),
    ACCOUNT_IDENTITY_MISSING(4004,"账户未登录"), 
    TOKEN_EXPIRED(4005,"登录过期"),
    TOKEN_MISS(4006,"token不存在"),
    TOKEN_CANCELED_BY_OTHERS(4007,"该账号在其他地方登录"),
    WRONG_PASSWORD(4008,"密码错误"),
    REQUEST_EXPIRED(4009,"请求过期"),
    SIGN_ERROR(4010,"签名错误")
    ;
	
    private final int code;
    private final String msg;

    ErrorCode(final int code,final String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }
    
    public String getMsg() {
        return msg;
    }
}
