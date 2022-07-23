package com.example.util;

import com.example.util.enums.ExceptionEnums;
import org.apache.poi.ss.formula.functions.T;

public class RdfaData<T> {
    private String code;
    private String message;
    private T Data;

    public RdfaData() {
    }

    public RdfaData(T data) {
        Data = data;
    }

    public void success(String code, String message, T data) {
        this.code = code;
        this.message = message;
        Data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }
}
