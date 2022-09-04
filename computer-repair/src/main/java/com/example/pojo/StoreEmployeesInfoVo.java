package com.example.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class StoreEmployeesInfoVo  implements Serializable {

    @JsonSerialize(using = ToStringSerializer.class)
    private Long storeEmployeesId;


    /**
     * 员工姓名
     */
    private String storeEmployeesName;
    /**
     * 员工联系方式
     */

    private String storeEmployeesContact;

    /**
     * 员工住址
     */

    private String storeEmployeesAddress;

    /**
     * 员工职位
     */

    private Integer storeEmployeesPosition;
    /**
     * 员工职位名称
     */
    private String storeEmployeesPositionName;


    private Long storeId;


    /**
     * 入职时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;


    private Long createByUserId;


    private Date updateTime;


    private Long updateByUserId;


    private Integer deleteFlag;


    public String getStoreEmployeesPositionName() {
        return storeEmployeesPositionName;
    }

    public void setStoreEmployeesPositionName(String storeEmployeesPositionName) {
        this.storeEmployeesPositionName = storeEmployeesPositionName;
    }

    public Long getStoreEmployeesId() {
        return storeEmployeesId;
    }

    public void setStoreEmployeesId(Long storeEmployeesId) {
        this.storeEmployeesId = storeEmployeesId;
    }

    public String getStoreEmployeesName() {
        return storeEmployeesName;
    }

    public void setStoreEmployeesName(String storeEmployeesName) {
        this.storeEmployeesName = storeEmployeesName;
    }

    public String getStoreEmployeesContact() {
        return storeEmployeesContact;
    }

    public void setStoreEmployeesContact(String storeEmployeesContact) {
        this.storeEmployeesContact = storeEmployeesContact;
    }

    public String getStoreEmployeesAddress() {
        return storeEmployeesAddress;
    }

    public void setStoreEmployeesAddress(String storeEmployeesAddress) {
        this.storeEmployeesAddress = storeEmployeesAddress;
    }

    public Integer getStoreEmployeesPosition() {
        return storeEmployeesPosition;
    }

    public void setStoreEmployeesPosition(Integer storeEmployeesPosition) {
        this.storeEmployeesPosition = storeEmployeesPosition;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
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
