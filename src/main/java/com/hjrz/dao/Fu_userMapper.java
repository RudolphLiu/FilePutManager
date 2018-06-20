package com.hjrz.dao;

import com.hjrz.entity.Fu_user;

public interface Fu_userMapper {
    int deleteByPrimaryKey(Long fu_user_id);

    int insert(Fu_user record);

    int insertSelective(Fu_user record);

    Fu_user selectByPrimaryKey(Long fu_user_id);

    Fu_user selectByUserName(String username);

    int updateByPrimaryKeySelective(Fu_user record);

    int updateByPrimaryKey(Fu_user record);
}