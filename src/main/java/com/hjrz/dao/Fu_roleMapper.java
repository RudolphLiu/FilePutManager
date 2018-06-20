package com.hjrz.dao;

import com.hjrz.entity.Fu_role;

public interface Fu_roleMapper {
    int deleteByPrimaryKey(Long fu_role_id);

    int insert(Fu_role record);

    int insertSelective(Fu_role record);

    Fu_role selectByPrimaryKey(Long fu_role_id);

    int updateByPrimaryKeySelective(Fu_role record);

    int updateByPrimaryKey(Fu_role record);
}