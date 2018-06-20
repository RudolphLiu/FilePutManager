package com.hjrz.dao;

import com.hjrz.entity.Fu_role_resource;

public interface Fu_role_resourceMapper {
    int deleteByPrimaryKey(Long fu_role_resource_id);

    int insert(Fu_role_resource record);

    int insertSelective(Fu_role_resource record);

    Fu_role_resource selectByPrimaryKey(Long fu_role_resource_id);

    int updateByPrimaryKeySelective(Fu_role_resource record);

    int updateByPrimaryKey(Fu_role_resource record);
}