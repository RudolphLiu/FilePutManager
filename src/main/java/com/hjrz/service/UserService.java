package com.hjrz.service;

import com.hjrz.constants.Gender;
import com.hjrz.dao.Fu_userMapper;
import com.hjrz.entity.Fu_user;
import com.hjrz.exception.EnumNotFoundException;
import com.hjrz.pojo.Signin;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {

    @Autowired
    private Fu_userMapper userMapper;

    public void signUser(Signin signin) throws EnumNotFoundException {
        SimpleHash result = new SimpleHash("MD5",signin.getPassword(),null,1);
        Fu_user fu_user = new Fu_user();
        fu_user.setFu_username(signin.getUsername());
        fu_user.setFu_password(result.toString());
        fu_user.setFu_realname(signin.getRealname());
        fu_user.setFu_gender(Gender.convertCode2Enum(signin.getGender()));
        fu_user.setFu_phonenum(signin.getPhonenum());
        fu_user.setFu_state("1");
        fu_user.setCreate_time(new Date());
        userMapper.insertSelective(fu_user);
    }

    //根据用户名获取用户信息
    public Fu_user selectByUserName(String username)
    {
        Fu_user fuUser = userMapper.selectByUserName(username);
        return fuUser;
    }

}
