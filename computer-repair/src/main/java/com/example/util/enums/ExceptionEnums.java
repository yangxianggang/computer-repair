package com.example.util.enums;

/**
 * 异常枚举类
 */
public enum ExceptionEnums {
    成功("0","处理成功"),
    失败("-1","处理失败"),
    ;

    private String key;
    private String value;

    ExceptionEnums(String key, String value) {
        this.key=key;
        this.value=value;

    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
