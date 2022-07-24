package com.example.param;

import java.io.Serializable;

public class UpdateComputerFailureInfoParam implements Serializable {
    /**
     * 电脑故障id
     */
    private Long computerFailureId;

    /**
     * //维修状态（1.排队中 2 维修中 3已维修 4 已报废）
     */
    private Integer maintenanceStatus;

    /**
     * 删除状态
     */
    private Integer  deleteFlag;

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Long getComputerFailureId() {
        return computerFailureId;
    }

    public void setComputerFailureId(Long computerFailureId) {
        this.computerFailureId = computerFailureId;
    }

    public Integer getMaintenanceStatus() {
        return maintenanceStatus;
    }

    public void setMaintenanceStatus(Integer maintenanceStatus) {
        this.maintenanceStatus = maintenanceStatus;
    }
}
