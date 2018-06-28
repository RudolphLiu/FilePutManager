package com.hjrz.dao;

import com.hjrz.entity.Fu_user_role;

import java.util.List;

public interface Fu_user_roleMapper {
    int deleteByPrimaryKey(Long fu_user_role_id);

    int insert(Fu_user_role record);

    int insertSelective(Fu_user_role record);

    Fu_user_role selectByPrimaryKey(Long fu_user_role_id);

    List<Fu_user_role> selectByUserID(Long userid);

    int updateByPrimaryKeySelective(Fu_user_role record);

    int updateByPrimaryKey(Fu_user_role record);
}