package com.example.util.enums;

public enum StoreEmployeesPositionEnums {
    //员工职位（1.前台 2.工程师 3 学徒）
    前台(1,"前台"),
    工程师(2,"工程师"),
    学徒(3,"学徒"),


    ;

    StoreEmployeesPositionEnums(Integer code, String value) {
        this.code = code;
        this.value = value;
    }



    /**
     * 根据code查找
     * @param code 枚举code
     * @return 枚举对象
     */
    public static StoreEmployeesPositionEnums findEnumByCode(Integer code) {
        for (StoreEmployeesPositionEnums statusEnum : StoreEmployeesPositionEnums.values()) {
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
