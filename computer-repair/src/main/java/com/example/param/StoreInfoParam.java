package com.example.param;

import java.io.Serializable;

public class StoreInfoParam implements Serializable {

    /**
     * 门店座机
     */
    private String storeLandline;

    /**
     * 门店详细地址
     */
    private String storeAddress;


    /**
     * 门店负责人
     */
    private String storeHead;


    /**
     * 门店负责人联系电话
     */
    private String storeHeadContact;

    /**
     * 门店归属省
     */
    private String attributionProvinces;

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
}
