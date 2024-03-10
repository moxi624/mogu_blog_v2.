package com.moxi.mougblog.base.response;

import com.moxi.mougblog.base.result.ResultCode;
import lombok.Getter;
import lombok.Setter;

/**
 * 返回前端统一响应
 *
 * @author geshanzsq
 * @date 2022/3/19
 */
@Getter
@Setter
public class ResponseResult<T> {

    /**
     * 状态码
     */
    private int code;

    /**
     * 提示消息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    public static ResponseResult success() {
        return success(null);
    }

    public static <T> ResponseResult success(T data) {
        ResultCode successCode = ResultCode.SUCCESS;
        return success(successCode.getCode(), successCode.getMsg(), data);
    }

    public static <T> ResponseResult success(String message, T data) {
        ResultCode successCode = ResultCode.SUCCESS;
        return success(successCode.getCode(), message, data);
    }

    public static <T> ResponseResult success(int code, String message, T data) {
        return new ResponseResult(code, message, data);
    }

    public static ResponseResult fail(String message) {
        return fail(ResultCode.FAILED.getCode(), message);
    }

    public static ResponseResult fail(int code) {
        return fail(code, ResultCode.FAILED.getMsg());
    }

    public static ResponseResult fail(int code, String message) {
        return fail(code, message, null);
    }

    public static <T> ResponseResult fail(int code, String message, T data) {
        return new ResponseResult(code, message, data);
    }

    public ResponseResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
