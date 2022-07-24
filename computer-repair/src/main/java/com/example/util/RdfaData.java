package com.example.util;

public class RdfaData {
    private String code;
    private String message;
    private Object Data;

    public RdfaData() {
    }


    public void success(String code, String message,  Object data) {
        this.code = code;
        this.message = message;
        this.Data = data;
    }

    public void success(String code, String message) {
        this.code = code;
        this.message = message;

    }

    public void failed(String code, String message) {
        this.code = code;
        this.message = message;

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

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }
}
