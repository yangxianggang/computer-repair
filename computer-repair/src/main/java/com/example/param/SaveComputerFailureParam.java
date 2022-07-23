package com.example.param;

import java.io.Serializable;

public class SaveComputerFailureParam implements Serializable {

    /**
     * 电脑客户姓名
     */
    private String computerUserName;

    /**
     * 电脑客户联系方式
     */
    private String computerUserContact;

    /**
     * 电脑客户住址
     */
    private String computerUserAddress;

    /**
     * 电脑客户故障状态
     */
    private Integer computerUserFaultyStatus;

    //================================================故障信息



    /**
     * 电脑品牌型号
     */
    private String brandModels;

    /**
     * 服务编号
     */
    private String serveSerial;

    /**
     * 快速服务代码
     */
    private String quickServiceCode;

    /**
     * 故障信息
     */
    private String failureInformation;

    /**
     * 故障信息详细描述
     */
    private String failureInformationDetailed;

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

    /**
     * 维修工程师员工id
     */
    private Long maintenanceEngineerId;

    /**
     * 维修工程师员工姓名
     */
    private String maintenanceEngineerName;

    /**
     * 维修工程师联系电话
     */
    private String maintenanceEngineerContact;

    public String getComputerUserName() {
        return computerUserName;
    }

    public void setComputerUserName(String computerUserName) {
        this.computerUserName = computerUserName;
    }

    public String getComputerUserContact() {
        return computerUserContact;
    }

    public void setComputerUserContact(String computerUserContact) {
        this.computerUserContact = computerUserContact;
    }

    public String getComputerUserAddress() {
        return computerUserAddress;
    }

    public void setComputerUserAddress(String computerUserAddress) {
        this.computerUserAddress = computerUserAddress;
    }

    public Integer getComputerUserFaultyStatus() {
        return computerUserFaultyStatus;
    }

    public void setComputerUserFaultyStatus(Integer computerUserFaultyStatus) {
        this.computerUserFaultyStatus = computerUserFaultyStatus;
    }

    public String getBrandModels() {
        return brandModels;
    }

    public void setBrandModels(String brandModels) {
        this.brandModels = brandModels;
    }

    public String getServeSerial() {
        return serveSerial;
    }

    public void setServeSerial(String serveSerial) {
        this.serveSerial = serveSerial;
    }

    public String getQuickServiceCode() {
        return quickServiceCode;
    }

    public void setQuickServiceCode(String quickServiceCode) {
        this.quickServiceCode = quickServiceCode;
    }

    public String getFailureInformation() {
        return failureInformation;
    }

    public void setFailureInformation(String failureInformation) {
        this.failureInformation = failureInformation;
    }

    public String getFailureInformationDetailed() {
        return failureInformationDetailed;
    }

    public void setFailureInformationDetailed(String failureInformationDetailed) {
        this.failureInformationDetailed = failureInformationDetailed;
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

    public Long getMaintenanceEngineerId() {
        return maintenanceEngineerId;
    }

    public void setMaintenanceEngineerId(Long maintenanceEngineerId) {
        this.maintenanceEngineerId = maintenanceEngineerId;
    }

    public String getMaintenanceEngineerName() {
        return maintenanceEngineerName;
    }

    public void setMaintenanceEngineerName(String maintenanceEngineerName) {
        this.maintenanceEngineerName = maintenanceEngineerName;
    }

    public String getMaintenanceEngineerContact() {
        return maintenanceEngineerContact;
    }

    public void setMaintenanceEngineerContact(String maintenanceEngineerContact) {
        this.maintenanceEngineerContact = maintenanceEngineerContact;
    }

    @Override
    public String toString() {
        return "SaveComputerFailureParam{" +
                "computerUserName='" + computerUserName + '\'' +
                ", computerUserContact='" + computerUserContact + '\'' +
                ", computerUserAddress='" + computerUserAddress + '\'' +
                ", computerUserFaultyStatus=" + computerUserFaultyStatus +
                ", brandModels='" + brandModels + '\'' +
                ", serveSerial='" + serveSerial + '\'' +
                ", quickServiceCode='" + quickServiceCode + '\'' +
                ", failureInformation='" + failureInformation + '\'' +
                ", failureInformationDetailed='" + failureInformationDetailed + '\'' +
                ", warrantyFlag=" + warrantyFlag +
                ", failureStatus=" + failureStatus +
                ", maintenanceStatus=" + maintenanceStatus +
                ", maintenanceEngineerId=" + maintenanceEngineerId +
                ", maintenanceEngineerName='" + maintenanceEngineerName + '\'' +
                ", maintenanceEngineerContact='" + maintenanceEngineerContact + '\'' +
                '}';
    }
}
