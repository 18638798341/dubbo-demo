package com.deepexi.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.user.domain.eo.Component;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ComponentMapper extends BaseMapper<Component> {

    List<Component> selectPageVo(@Param("componentName") String componentName,
                                 @Param("category") String category,
                                 @Param("state") Byte state);
}
