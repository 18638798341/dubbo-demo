package com.deepexi.user.domain.eo;

import java.io.Serializable;

/**
 *
 */
public class Component implements Serializable {



    public static final Byte STATE_UP = 1;
    public static final Byte STATE_DOWN = 0;


    /**
     * ID
     */
    private String id;


    /**
     * 组件名称
     */
    private String componentName;


    /**
     * 分类
     */
    private String category;

    /**
     * 版本
     */
    private String version;

    /**
     * 状态
     * 1: 上架
     * 0: 下架
     */
    private Byte state;

    public Component() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}
