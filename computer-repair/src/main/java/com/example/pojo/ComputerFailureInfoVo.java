package com.example.pojo;

import java.io.Serializable;
import java.util.Date;

public class ComputerFailureInfoVo implements Serializable {


    private Long computerFailureId;


    private Long computerUserId;

    private String computerUserName;


    private Long storeId;


    private String brandModels;


    private String serveSerial;


    private String quickServiceCode;


    private String failureInformation;


    private String failureInformationDetailed;


    private Integer warrantyFlag;
    private String warrantyFlagName;


    private Integer failureStatus;
    private String failureStatusName;


    private Integer maintenanceStatus;


    private Long maintenanceEngineerId;


    private String maintenanceEngineerName;

    private String maintenanceEngineerContact;


    private Date createTime;


    private Long createByUserId;


    private Date updateTime;


    private Long updateByUserId;


    private Integer deleteFlag;

    public Long getComputerFailureId() {
        return computerFailureId;
    }

    public void setComputerFailureId(Long computerFailureId) {
        this.computerFailureId = computerFailureId;
    }

    public Long getComputerUserId() {
        return computerUserId;
    }

    public void setComputerUserId(Long computerUserId) {
        this.computerUserId = computerUserId;
    }

    public String getComputerUserName() {
        return computerUserName;
    }

    public void setComputerUserName(String computerUserName) {
        this.computerUserName = computerUserName;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
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

    public String getWarrantyFlagName() {
        return warrantyFlagName;
    }

    public void setWarrantyFlagName(String warrantyFlagName) {
        this.warrantyFlagName = warrantyFlagName;
    }

    public Integer getFailureStatus() {
        return failureStatus;
    }

    public void setFailureStatus(Integer failureStatus) {
        this.failureStatus = failureStatus;
    }

    public String getFailureStatusName() {
        return failureStatusName;
    }

    public void setFailureStatusName(String failureStatusName) {
        this.failureStatusName = failureStatusName;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateByUserId() {
        return createByUserId;
    }

    public void setCreateByUserId(Long createByUserId) {
        this.createByUserId = createByUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateByUserId() {
        return updateByUserId;
    }

    public void setUpdateByUserId(Long updateByUserId) {
        this.updateByUserId = updateByUserId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
