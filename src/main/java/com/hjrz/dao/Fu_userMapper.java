package com.hjrz.dao;

import com.hjrz.entity.Fu_user;

import java.util.List;
import java.util.Map;

public interface Fu_userMapper {
    int deleteByPrimaryKey(Long fu_user_id);

    int insert(Fu_user record);

    int insertSelective(Fu_user record);

    Fu_user selectByPrimaryKey(Long fu_user_id);

    Fu_user selectByUserName(String username);

    Fu_user userlogin(Map<String,String> map);

    List<Fu_user> selectAlluser();

    int updateByPrimaryKeySelective(Fu_user record);

    int updateByPrimaryKey(Fu_user record);
}