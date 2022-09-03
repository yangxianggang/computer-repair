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



    /**
     * 根据code查找
     * @param code 枚举code
     * @return 枚举对象
     */
    public static ComputerUserFaultyStatusEnums findEnumByCode(Integer code) {
        for (ComputerUserFaultyStatusEnums statusEnum : ComputerUserFaultyStatusEnums.values()) {
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
