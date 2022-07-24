package com.example.param;

import java.io.Serializable;

public class StoreEmployeesInfoParam implements Serializable {

    /**
     * 员工姓名
     */
    private String storeEmployeesName;


    /**
     * 员工联系电话
     */
    private String storeEmployeesContact;

    /**
     * 员工住址
      */

    private String storeEmployeesAddress;

    /**
     * 员工职位（1.前台 2.工程师 3 学徒）
     */

    private Integer storeEmployeesPosition;

    /**
     * 门店id
     */

    private Long storeId;

    /**
     * 员工id
     */
    private Long storeEmployeesId;

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
}
