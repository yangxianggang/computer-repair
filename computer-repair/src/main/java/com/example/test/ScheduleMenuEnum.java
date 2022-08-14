package com.example.test;

/**
 * ClassName: ScheduleMenuEnum
 * Description:
 * Author: yangxianggang
 * Date: 2022/8/12 17:14
 * History:
 * <author>            <time>          <version>          <desc>
 * yangxianggang       修改时间            1.0               描述
 */
public enum ScheduleMenuEnum {
    需求完善(1,"需求完善"),
    询价发布(2,"询价发布"),
    比价决策(3,"比价决策"),
    合同签署(4,"合同签署"),
    协议商品(5,"协议商品"),
     ;

    private Integer serialNumber;//序号
    private String scheduleMenuName;//菜单名称


    ScheduleMenuEnum() {
    }

    ScheduleMenuEnum(Integer serialNumber, String scheduleMenuName) {
        this.serialNumber = serialNumber;
        this.scheduleMenuName = scheduleMenuName;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public String getScheduleMenuName() {
        return scheduleMenuName;
    }
}