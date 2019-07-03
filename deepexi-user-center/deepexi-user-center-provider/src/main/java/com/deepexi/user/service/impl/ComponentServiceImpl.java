package com.deepexi.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepexi.user.domain.eo.Component;
import com.deepexi.user.mapper.ComponentMapper;
import com.deepexi.user.service.ComponentService;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Component
@Service(version = "${demo.service.version}")
public class ComponentServiceImpl implements ComponentService {

    @Autowired
    private ComponentMapper componentMapper;

    @Override
    public PageBean getComponentList(Integer page, Integer size, String componentName, String category, Byte state) {
        PageHelper.startPage(page, size);
        List<Component> components = componentMapper.selectPageVo(componentName, category, state);
        return new PageBean(components);
    }

    @Override
    public Component getComponentById(String id) {
        return componentMapper.selectById(id);
    }

    @Override
    public Object createComponent(Component component) {
        return componentMapper.insert(component);
    }

    @Override
    public Boolean deleteComponentById(String id) {
        return componentMapper.deleteById(id) > 0;
    }

    @Override
    public Boolean batchDeleteComponentByIds(String[] ids) {
        return componentMapper.deleteBatchIds(Arrays.asList(ids)) > 0;
    }

    @Override
    public Boolean updateComponentStateById(String id, Byte state) {
        Component user = new Component();
        user.setId(id);
        user.setState(state);
        return componentMapper.updateById(user) > 0;
    }

    @Override
    public Boolean updateComponentById(Component component) {
        return componentMapper.updateById(component) > 0;
    }
}
