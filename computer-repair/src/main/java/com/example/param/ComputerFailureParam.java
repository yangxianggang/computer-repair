package com.example.param;

import java.io.Serializable;

public class ComputerFailureParam implements Serializable {
    /**
     * 电脑品牌型号
     */
    private String brandModels;
    /**
     * 快速服务代码
     */
    private String  quickServiceCode;

    /**
     * 客户姓名
     */
    private String computerUserName;

    /**
     * 是否在保修期内（0 否 1是）
     */
    private Integer warrantyFlag;

    /**
     * 故障状态 （1 一般 2 困难 3 严重 4 大修）
     */
    private Integer failureStatus;

    /**
     * 维修状态（1.排队中 2 维修中 3已维修 4 已报废）
     */
    private Integer maintenanceStatus;

    public String getBrandModels() {
        return brandModels;
    }

    public void setBrandModels(String brandModels) {
        this.brandModels = brandModels;
    }

    public String getQuickServiceCode() {
        return quickServiceCode;
    }

    public void setQuickServiceCode(String quickServiceCode) {
        this.quickServiceCode = quickServiceCode;
    }

    public String getComputerUserName() {
        return computerUserName;
    }

    public void setComputerUserName(String computerUserName) {
        this.computerUserName = computerUserName;
    }

    public Integer getWarrantyFlag() {
        return warrantyFlag;
    }

    public void setWarrantyFlag(Integer warrantyFlag) {
        this.warrantyFlag = warrantyFlag;
    }

    public Integer getFailureStatus() {
        return failureStatus;
    }

    public void setFailureStatus(Integer failureStatus) {
        this.failureStatus = failureStatus;
    }

    public Integer getMaintenanceStatus() {
        return maintenanceStatus;
    }

    public void setMaintenanceStatus(Integer maintenanceStatus) {
        this.maintenanceStatus = maintenanceStatus;
    }
}
