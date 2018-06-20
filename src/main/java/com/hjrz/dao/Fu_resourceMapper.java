package com.hjrz.dao;

import com.hjrz.entity.Fu_resource;

public interface Fu_resourceMapper {
    int deleteByPrimaryKey(Long fu_resource_id);

    int insert(Fu_resource record);

    int insertSelective(Fu_resource record);

    Fu_resource selectByPrimaryKey(Long fu_resource_id);

    int updateByPrimaryKeySelective(Fu_resource record);

    int updateByPrimaryKey(Fu_resource record);
}