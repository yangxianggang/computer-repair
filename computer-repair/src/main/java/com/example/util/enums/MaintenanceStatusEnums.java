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


    /**
     * 根据code查找
     * @param code 枚举code
     * @return 枚举对象
     */
    public static MaintenanceStatusEnums findEnumByCode(Integer code) {
        for (MaintenanceStatusEnums statusEnum : MaintenanceStatusEnums.values()) {
            if (statusEnum.getCode()==code) {
                //如果需要直接返回name则更改返回类型为String,return statusEnum.name;
                return statusEnum;
            }
        }
        throw new IllegalArgumentException("code is invalid");
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
