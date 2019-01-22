package com.kang.common.util;

import java.io.Serializable;

/**
 * Restful Api数据返回格式
 */
public class ApiResult implements Serializable {
    // 状态码
    private Integer code;
    // 描述
    private String msg;
    // 返回的数据
    private Object data;

    public ApiResult() {}

    public ApiResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setResultCode(ResultCode code) {
        this.code = code.getCode();
        this.msg = code.getMessage();
    }
}
