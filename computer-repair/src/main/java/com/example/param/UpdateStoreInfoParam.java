package com.example.param;

import java.io.Serializable;

public class UpdateStoreInfoParam  implements Serializable {
    /**
     *  门店id
     */
    private Long storeId;

    /**
     * 删除状态
     *
     */
    private Integer deleteFlag;

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
