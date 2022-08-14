package com.example.test;

import java.io.Serializable;

/**
 * ClassName: ScheduleSubMenuVo
 * Description:
 * Author: yangxianggang
 * Date: 2022/8/12 18:05
 * History:
 * <author>            <time>          <version>          <desc>
 * yangxianggang       修改时间            1.0               描述
 */
public class ScheduleSubMenuVo implements Serializable {
    /**
     * 进度菜单顺序
     */
    private Integer scheduleSubMenuIndex;
    /**
     * 进度菜单名称
     */
    private String scheduleSubMenuLabel;
    /**
     * 进度菜单状态
     */
    private String scheduleSubMenuStatus;

    /**
     * 时间
     */
    private String scheduleSubMenuDate;

    public Integer getScheduleSubMenuIndex() {
        return scheduleSubMenuIndex;
    }

    public void setScheduleSubMenuIndex(Integer scheduleSubMenuIndex) {
        this.scheduleSubMenuIndex = scheduleSubMenuIndex;
    }

    public String getScheduleSubMenuLabel() {
        return scheduleSubMenuLabel;
    }

    public void setScheduleSubMenuLabel(String scheduleSubMenuLabel) {
        this.scheduleSubMenuLabel = scheduleSubMenuLabel;
    }

    public String getScheduleSubMenuStatus() {
        return scheduleSubMenuStatus;
    }

    public void setScheduleSubMenuStatus(String scheduleSubMenuStatus) {
        this.scheduleSubMenuStatus = scheduleSubMenuStatus;
    }

    public String getScheduleSubMenuDate() {
        return scheduleSubMenuDate;
    }

    public void setScheduleSubMenuDate(String scheduleSubMenuDate) {
        this.scheduleSubMenuDate = scheduleSubMenuDate;
    }
}