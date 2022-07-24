package com.example.param;

import java.io.Serializable;

public class UpdateStoreEmployeesInfoParam  implements Serializable {
    /**
     * 员工id
     */
    private Long storeEmployeesId;
    /**
     * 删除状态
     */
    private Integer deleteFlag;

    public Long getStoreEmployeesId() {
        return storeEmployeesId;
    }

    public void setStoreEmployeesId(Long storeEmployeesId) {
        this.storeEmployeesId = storeEmployeesId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
