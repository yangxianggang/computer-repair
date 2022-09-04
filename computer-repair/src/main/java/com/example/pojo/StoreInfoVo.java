package com.example.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class StoreInfoVo implements Serializable {

    @JsonSerialize(using = ToStringSerializer.class)
    private Long storeId;

    private String storeLandline;


    /**
     * 门店详细地址
     */
    private String storeAddress;


    private String storeHead;


    private String storeHeadContact;


    private String attributionProvinces;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;


    private Long createByUserId;


    private Date updateTime;

    private Long updateByUserId;


    private Integer deleteFlag;

    /**
     * 门店员工个数
     */
    private Integer storeEmployeesInfoCount;

    public Integer getStoreEmployeesInfoCount() {
        return storeEmployeesInfoCount;
    }

    public void setStoreEmployeesInfoCount(Integer storeEmployeesInfoCount) {
        this.storeEmployeesInfoCount = storeEmployeesInfoCount;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreLandline() {
        return storeLandline;
    }

    public void setStoreLandline(String storeLandline) {
        this.storeLandline = storeLandline;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreHead() {
        return storeHead;
    }

    public void setStoreHead(String storeHead) {
        this.storeHead = storeHead;
    }

    public String getStoreHeadContact() {
        return storeHeadContact;
    }

    public void setStoreHeadContact(String storeHeadContact) {
        this.storeHeadContact = storeHeadContact;
    }

    public String getAttributionProvinces() {
        return attributionProvinces;
    }

    public void setAttributionProvinces(String attributionProvinces) {
        this.attributionProvinces = attributionProvinces;
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
