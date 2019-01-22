package com.kang.common.util;

/**
 * API 统一返回状态码
 */
public enum ResultCode {
    SUCCESS(0,"成功"),
    FAILURE(1,"操作失败"),
    ;

    private Integer code;

    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
