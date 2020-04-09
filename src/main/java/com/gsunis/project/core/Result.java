package com.gsunis.project.core;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * 统一API响应结果封装
 *
 * @author tbicf
 */
@Data
public class Result<T> {

    private int code;

    private String message;

    private T data;

    public Result<T> setCode(ResultCode resultCode) {
        code = resultCode.code();
        return this;
    }

    public Result<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public Result<T> setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
