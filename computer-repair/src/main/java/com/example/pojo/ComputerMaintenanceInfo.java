package com.example.pojo;

import java.io.Serializable;
import java.util.Date;

public class ComputerMaintenanceInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column computer_maintenance_info.computer_maintenance_id
     *
     * @mbggenerated
     */
    private Long computerMaintenanceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column computer_maintenance_info.computer_failure_id
     *
     * @mbggenerated
     */
    private Long computerFailureId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column computer_maintenance_info.store_employees_id
     *
     * @mbggenerated
     */
    private Long storeEmployeesId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column computer_maintenance_info.computer_maintenance_describe
     *
     * @mbggenerated
     */
    private String computerMaintenanceDescribe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column computer_maintenance_info.computer_maintenance_handling
     *
     * @mbggenerated
     */
    private String computerMaintenanceHandling;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column computer_maintenance_info.computer_maintenance_consumption
     *
     * @mbggenerated
     */
    private String computerMaintenanceConsumption;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column computer_maintenance_info.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column computer_maintenance_info.create_by_user_id
     *
     * @mbggenerated
     */
    private Long createByUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column computer_maintenance_info.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column computer_maintenance_info.update_by_user_id
     *
     * @mbggenerated
     */
    private Long updateByUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column computer_maintenance_info.delete_flag
     *
     * @mbggenerated
     */
    private Integer deleteFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table computer_maintenance_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column computer_maintenance_info.computer_maintenance_id
     *
     * @return the value of computer_maintenance_info.computer_maintenance_id
     *
     * @mbggenerated
     */
    public Long getComputerMaintenanceId() {
        return computerMaintenanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column computer_maintenance_info.computer_maintenance_id
     *
     * @param computerMaintenanceId the value for computer_maintenance_info.computer_maintenance_id
     *
     * @mbggenerated
     */
    public void setComputerMaintenanceId(Long computerMaintenanceId) {
        this.computerMaintenanceId = computerMaintenanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column computer_maintenance_info.computer_failure_id
     *
     * @return the value of computer_maintenance_info.computer_failure_id
     *
     * @mbggenerated
     */
    public Long getComputerFailureId() {
        return computerFailureId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column computer_maintenance_info.computer_failure_id
     *
     * @param computerFailureId the value for computer_maintenance_info.computer_failure_id
     *
     * @mbggenerated
     */
    public void setComputerFailureId(Long computerFailureId) {
        this.computerFailureId = computerFailureId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column computer_maintenance_info.store_employees_id
     *
     * @return the value of computer_maintenance_info.store_employees_id
     *
     * @mbggenerated
     */
    public Long getStoreEmployeesId() {
        return storeEmployeesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column computer_maintenance_info.store_employees_id
     *
     * @param storeEmployeesId the value for computer_maintenance_info.store_employees_id
     *
     * @mbggenerated
     */
    public void setStoreEmployeesId(Long storeEmployeesId) {
        this.storeEmployeesId = storeEmployeesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column computer_maintenance_info.computer_maintenance_describe
     *
     * @return the value of computer_maintenance_info.computer_maintenance_describe
     *
     * @mbggenerated
     */
    public String getComputerMaintenanceDescribe() {
        return computerMaintenanceDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column computer_maintenance_info.computer_maintenance_describe
     *
     * @param computerMaintenanceDescribe the value for computer_maintenance_info.computer_maintenance_describe
     *
     * @mbggenerated
     */
    public void setComputerMaintenanceDescribe(String computerMaintenanceDescribe) {
        this.computerMaintenanceDescribe = computerMaintenanceDescribe == null ? null : computerMaintenanceDescribe.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column computer_maintenance_info.computer_maintenance_handling
     *
     * @return the value of computer_maintenance_info.computer_maintenance_handling
     *
     * @mbggenerated
     */
    public String getComputerMaintenanceHandling() {
        return computerMaintenanceHandling;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column computer_maintenance_info.computer_maintenance_handling
     *
     * @param computerMaintenanceHandling the value for computer_maintenance_info.computer_maintenance_handling
     *
     * @mbggenerated
     */
    public void setComputerMaintenanceHandling(String computerMaintenanceHandling) {
        this.computerMaintenanceHandling = computerMaintenanceHandling == null ? null : computerMaintenanceHandling.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column computer_maintenance_info.computer_maintenance_consumption
     *
     * @return the value of computer_maintenance_info.computer_maintenance_consumption
     *
     * @mbggenerated
     */
    public String getComputerMaintenanceConsumption() {
        return computerMaintenanceConsumption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column computer_maintenance_info.computer_maintenance_consumption
     *
     * @param computerMaintenanceConsumption the value for computer_maintenance_info.computer_maintenance_consumption
     *
     * @mbggenerated
     */
    public void setComputerMaintenanceConsumption(String computerMaintenanceConsumption) {
        this.computerMaintenanceConsumption = computerMaintenanceConsumption == null ? null : computerMaintenanceConsumption.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column computer_maintenance_info.create_time
     *
     * @return the value of computer_maintenance_info.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column computer_maintenance_info.create_time
     *
     * @param createTime the value for computer_maintenance_info.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column computer_maintenance_info.create_by_user_id
     *
     * @return the value of computer_maintenance_info.create_by_user_id
     *
     * @mbggenerated
     */
    public Long getCreateByUserId() {
        return createByUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column computer_maintenance_info.create_by_user_id
     *
     * @param createByUserId the value for computer_maintenance_info.create_by_user_id
     *
     * @mbggenerated
     */
    public void setCreateByUserId(Long createByUserId) {
        this.createByUserId = createByUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column computer_maintenance_info.update_time
     *
     * @return the value of computer_maintenance_info.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column computer_maintenance_info.update_time
     *
     * @param updateTime the value for computer_maintenance_info.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column computer_maintenance_info.update_by_user_id
     *
     * @return the value of computer_maintenance_info.update_by_user_id
     *
     * @mbggenerated
     */
    public Long getUpdateByUserId() {
        return updateByUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column computer_maintenance_info.update_by_user_id
     *
     * @param updateByUserId the value for computer_maintenance_info.update_by_user_id
     *
     * @mbggenerated
     */
    public void setUpdateByUserId(Long updateByUserId) {
        this.updateByUserId = updateByUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column computer_maintenance_info.delete_flag
     *
     * @return the value of computer_maintenance_info.delete_flag
     *
     * @mbggenerated
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column computer_maintenance_info.delete_flag
     *
     * @param deleteFlag the value for computer_maintenance_info.delete_flag
     *
     * @mbggenerated
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_maintenance_info
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", computerMaintenanceId=").append(computerMaintenanceId);
        sb.append(", computerFailureId=").append(computerFailureId);
        sb.append(", storeEmployeesId=").append(storeEmployeesId);
        sb.append(", computerMaintenanceDescribe=").append(computerMaintenanceDescribe);
        sb.append(", computerMaintenanceHandling=").append(computerMaintenanceHandling);
        sb.append(", computerMaintenanceConsumption=").append(computerMaintenanceConsumption);
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