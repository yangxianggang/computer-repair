package com.example.test;

import org.apache.catalina.LifecycleState;

import java.io.Serializable;
import java.util.List;

/**
 * ClassName: ScheduleMenuVo
 * Description:
 * Author: yangxianggang
 * Date: 2022/8/12 17:26
 * History:
 * <author>            <time>          <version>          <desc>
 * yangxianggang       修改时间            1.0               描述
 */
public class ScheduleMenuVo implements Serializable {
    /**
     * 进度菜单顺序
     */
    private Integer scheduleMenuIndex;
    /**
     * 进度菜单名称
     */
    private String scheduleMenuLabel;
    /**
     * 进度菜单状态
     */
    private String scheduleMenuStatus;

    /**
     * 进度子菜单数据
     */
    private List<ScheduleSubMenuVo>subMenuVos;

    public Integer getScheduleMenuIndex() {
        return scheduleMenuIndex;
    }

    public void setScheduleMenuIndex(Integer scheduleMenuIndex) {
        this.scheduleMenuIndex = scheduleMenuIndex;
    }

    public String getScheduleMenuLabel() {
        return scheduleMenuLabel;
    }

    public void setScheduleMenuLabel(String scheduleMenuLabel) {
        this.scheduleMenuLabel = scheduleMenuLabel;
    }

    public String getScheduleMenuStatus() {
        return scheduleMenuStatus;
    }

    public void setScheduleMenuStatus(String scheduleMenuStatus) {
        this.scheduleMenuStatus = scheduleMenuStatus;
    }

    public List<ScheduleSubMenuVo> getSubMenuVos() {
        return subMenuVos;
    }

    public void setSubMenuVos(List<ScheduleSubMenuVo> subMenuVos) {
        this.subMenuVos = subMenuVos;
    }
}