package com.example.util.enums;

public enum FailureStatusEnums {
    //故障状态 （1 一般 2 困难 3 严重 4 大修）
    一般(1,"一般"),
    困难(2,"困难"),
    严重(3,"严重"),
    大修(4,"大修"),;


    FailureStatusEnums(Integer code, String value) {
        this.code = code;
        this.value = value;
    }


    /**
     * 根据code查找
     * @param code 枚举code
     * @return 枚举对象
     */
    public static FailureStatusEnums findEnumByCode(Integer code) {
        for (FailureStatusEnums statusEnum : FailureStatusEnums.values()) {
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
