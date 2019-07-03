package com.deepexi.user.service;

import com.deepexi.user.domain.eo.Component;
import com.deepexi.util.pageHelper.PageBean;

public interface ComponentService {

    /**
     * 模糊查询用户信息
     * @param page
     * @param size
     * @param componentName
     * @param category
     * @param state
     * @return
     */
    PageBean getComponentList(Integer page, Integer size, String componentName, String category, Byte state);

    Component getComponentById(String id);

    Object createComponent(Component component);

    Boolean deleteComponentById(String id);

    Boolean batchDeleteComponentByIds(String[] ids);


    Boolean updateComponentStateById(String id, Byte state);
    Boolean updateComponentById(Component component);

}
