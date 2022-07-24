package com.example.util.enums;

public enum MaintenanceStatusEnums {
//维修状态（1.排队中 2 维修中 3已维修 4 已报废）
    排队中(1,"排队中"),
    维修中(2,"维修中"),
    已维修(3,"已维修"),
    已报废(4,"已报废"),


    ;

    MaintenanceStatusEnums(Integer code, String value) {
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
