package com.example.pojo;

import java.io.Serializable;
import java.util.Date;

public class StoreInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_info.store_id
     *
     * @mbggenerated
     */
    private Long storeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_info.store_landline
     *
     * @mbggenerated
     */
    private String storeLandline;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_info.store_address
     *
     * @mbggenerated
     */
    private String storeAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_info.store_head
     *
     * @mbggenerated
     */
    private String storeHead;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_info.store_head_contact
     *
     * @mbggenerated
     */
    private String storeHeadContact;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_info.attribution_provinces
     *
     * @mbggenerated
     */
    private String attributionProvinces;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_info.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_info.create_by_user_id
     *
     * @mbggenerated
     */
    private Long createByUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_info.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_info.update_by_user_id
     *
     * @mbggenerated
     */
    private Long updateByUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column store_info.delete_flag
     *
     * @mbggenerated
     */
    private Integer deleteFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table store_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_info.store_id
     *
     * @return the value of store_info.store_id
     *
     * @mbggenerated
     */
    public Long getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_info.store_id
     *
     * @param storeId the value for store_info.store_id
     *
     * @mbggenerated
     */
    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_info.store_landline
     *
     * @return the value of store_info.store_landline
     *
     * @mbggenerated
     */
    public String getStoreLandline() {
        return storeLandline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_info.store_landline
     *
     * @param storeLandline the value for store_info.store_landline
     *
     * @mbggenerated
     */
    public void setStoreLandline(String storeLandline) {
        this.storeLandline = storeLandline == null ? null : storeLandline.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_info.store_address
     *
     * @return the value of store_info.store_address
     *
     * @mbggenerated
     */
    public String getStoreAddress() {
        return storeAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_info.store_address
     *
     * @param storeAddress the value for store_info.store_address
     *
     * @mbggenerated
     */
    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress == null ? null : storeAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_info.store_head
     *
     * @return the value of store_info.store_head
     *
     * @mbggenerated
     */
    public String getStoreHead() {
        return storeHead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_info.store_head
     *
     * @param storeHead the value for store_info.store_head
     *
     * @mbggenerated
     */
    public void setStoreHead(String storeHead) {
        this.storeHead = storeHead == null ? null : storeHead.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_info.store_head_contact
     *
     * @return the value of store_info.store_head_contact
     *
     * @mbggenerated
     */
    public String getStoreHeadContact() {
        return storeHeadContact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_info.store_head_contact
     *
     * @param storeHeadContact the value for store_info.store_head_contact
     *
     * @mbggenerated
     */
    public void setStoreHeadContact(String storeHeadContact) {
        this.storeHeadContact = storeHeadContact == null ? null : storeHeadContact.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_info.attribution_provinces
     *
     * @return the value of store_info.attribution_provinces
     *
     * @mbggenerated
     */
    public String getAttributionProvinces() {
        return attributionProvinces;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_info.attribution_provinces
     *
     * @param attributionProvinces the value for store_info.attribution_provinces
     *
     * @mbggenerated
     */
    public void setAttributionProvinces(String attributionProvinces) {
        this.attributionProvinces = attributionProvinces == null ? null : attributionProvinces.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_info.create_time
     *
     * @return the value of store_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_info.create_time
     *
     * @param createTime the value for store_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_info.create_by_user_id
     *
     * @return the value of store_info.create_by_user_id
     *
     * @mbggenerated
     */
    public Long getCreateByUserId() {
        return createByUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_info.create_by_user_id
     *
     * @param createByUserId the value for store_info.create_by_user_id
     *
     * @mbggenerated
     */
    public void setCreateByUserId(Long createByUserId) {
        this.createByUserId = createByUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_info.update_time
     *
     * @return the value of store_info.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_info.update_time
     *
     * @param updateTime the value for store_info.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_info.update_by_user_id
     *
     * @return the value of store_info.update_by_user_id
     *
     * @mbggenerated
     */
    public Long getUpdateByUserId() {
        return updateByUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_info.update_by_user_id
     *
     * @param updateByUserId the value for store_info.update_by_user_id
     *
     * @mbggenerated
     */
    public void setUpdateByUserId(Long updateByUserId) {
        this.updateByUserId = updateByUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column store_info.delete_flag
     *
     * @return the value of store_info.delete_flag
     *
     * @mbggenerated
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column store_info.delete_flag
     *
     * @param deleteFlag the value for store_info.delete_flag
     *
     * @mbggenerated
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_info
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", storeId=").append(storeId);
        sb.append(", storeLandline=").append(storeLandline);
        sb.append(", storeAddress=").append(storeAddress);
        sb.append(", storeHead=").append(storeHead);
        sb.append(", storeHeadContact=").append(storeHeadContact);
        sb.append(", attributionProvinces=").append(attributionProvinces);
        sb.append(", createTime=").append(createTime);
        sb.append(", createByUserId=").append(createByUserId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateByUserId=").append(updateByUserId);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}