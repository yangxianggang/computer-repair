package com.example.param;

import java.io.Serializable;

public class UpdateComputerFailureInfoParam implements Serializable {
    /**
     * 电脑故障id
     */
    private Long computerFailureId;

    /**
     * //维修状态（1.排队中 2 维修中 3已维修 4 已报废）
     */
    private Integer maintenanceStatus;

    /**
     * 删除状态
     */
    private Integer  deleteFlag;


    /**
     * 电脑客户姓名
     */
    private String computerUserName;

    /**
     * 电脑品牌型号
     */
    private String brandModels;

    /**
     * 是否在保修期内（0 否 1是）
     */
    private Integer warrantyFlag;

    /**
     * 故障状态 （1 一般 2 困难 3 严重 4 大修）
     */
    private Integer failureStatus;

    public String getComputerUserName() {
        return computerUserName;
    }

    public void setComputerUserName(String computerUserName) {
        this.computerUserName = computerUserName;
    }

    public String getBrandModels() {
        return brandModels;
    }

    public void setBrandModels(String brandModels) {
        this.brandModels = brandModels;
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

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Long getComputerFailureId() {
        return computerFailureId;
    }

    public void setComputerFailureId(Long computerFailureId) {
        this.computerFailureId = computerFailureId;
    }

    public Integer getMaintenanceStatus() {
        return maintenanceStatus;
    }

    public void setMaintenanceStatus(Integer maintenanceStatus) {
        this.maintenanceStatus = maintenanceStatus;
    }
}
