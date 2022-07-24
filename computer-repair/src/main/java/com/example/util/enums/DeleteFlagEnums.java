package com.example.util.enums;

public enum DeleteFlagEnums {
    未删除(0,"未删除"),
    已删除(1,"已删除"),;

    DeleteFlagEnums(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    private Integer code;
    private String  value;

    public Integer getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
