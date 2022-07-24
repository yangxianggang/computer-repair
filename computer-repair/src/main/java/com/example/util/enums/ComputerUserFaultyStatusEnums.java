package com.example.util.enums;

public enum ComputerUserFaultyStatusEnums {
    //用户电脑故障状态（1.已登记 2 维修中 3 已取走）
    已登记(1,"已登记"),
    维修中(2,"维修中"),
    已取走(3,"已取走"),


    ;

    ComputerUserFaultyStatusEnums(Integer code, String value) {
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
