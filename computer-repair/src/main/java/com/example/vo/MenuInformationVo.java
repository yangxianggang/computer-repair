package com.example.vo;

import java.io.Serializable;
import java.util.List;

public class MenuInformationVo implements Serializable {
    /**
     * 菜單id
     */
    private String menuId;

    /**
     * 菜單名稱
     */
    private String menuName;

    /**
     *菜單路徑
     */
    private String menuPath;

    /**
     * 菜單圖標
     */
    private String menuIcon;

    /**
     * 菜單狀態
     */
    private String enableStart;

    /**
     * 菜單編碼
     */
    private String menuCode;

    /**
     * 菜單名稱
     */
    private String component;


    private List<MenuInformationVo>menuBeans;

    public List<MenuInformationVo> getMenuBeans() {
        return menuBeans;
    }

    public void setMenuBeans(List<MenuInformationVo> menuBeans) {
        this.menuBeans = menuBeans;
    }

    /**
     */
    private static final long serialVersionUID = 1L;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuPath() {
        return menuPath;
    }

    public void setMenuPath(String menuPath) {
        this.menuPath = menuPath;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getEnableStart() {
        return enableStart;
    }

    public void setEnableStart(String enableStart) {
        this.enableStart = enableStart;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }
}
