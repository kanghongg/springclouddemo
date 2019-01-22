package com.kang.common.util;

/**
 * Restful Api工具类
 */
public class ResultUtils {
    public static ApiResult success() {
        ApiResult result = new ApiResult();
        result.setResultCode(ResultCode.SUCCESS);
        return result;
    }

    public static ApiResult success(Object data) {
        ApiResult result = new ApiResult();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    public static ApiResult failure() {
        ApiResult result = new ApiResult();
        result.setResultCode(ResultCode.FAILURE);
        return result;
    }

    public static ApiResult failure(ResultCode code) {
        ApiResult result = new ApiResult();
        result.setResultCode(code);
        return result;
    }

    public static ApiResult failure(Integer code, String message) {
        ApiResult result = new ApiResult();
        result.setCode(code);
        result.setMsg(message);
        return result;
    }

    public static ApiResult failure(ResultCode code, Object data) {
        ApiResult result = new ApiResult();
        result.setResultCode(code);
        result.setData(data);
        return result;
    }
}
