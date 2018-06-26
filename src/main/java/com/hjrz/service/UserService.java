package com.hjrz.service;

import com.hjrz.constants.Gender;
import com.hjrz.constants.UserStateEnum;
import com.hjrz.dao.Fu_userMapper;
import com.hjrz.entity.Fu_user;
import com.hjrz.exception.EnumNotFoundException;
import com.hjrz.pojo.Signin;
import com.hjrz.util.LoggerUtils;
import net.sf.json.JSONObject;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private Fu_userMapper userMapper;

    public void signUser(Fu_user user) throws Exception {
        if(userMapper.selectByUserName(user.getFu_username()) != null)
        {
            throw new Exception("账号已存在");
        }
        //转换密码为MD5并以用户名为盐加密
        SimpleHash result = new SimpleHash("MD5",user.getFu_password(),user.getFu_username(),1);
        Date date = new Date();
        user.setFu_password(result.toString());
        user.setFu_state(UserStateEnum.EFFECTIVE);
        user.setCreate_time(date);
        userMapper.insert(user);
        LoggerUtils.fmtDebug(getClass(), "注册插入完毕！", JSONObject.fromObject(user).toString());
    }

    public Fu_user userlogin(String username,String password)
    {
        Map<String,String> map = new HashMap<String, String>();
        map.put("fu_username",username);
        map.put("fu_password",password);
        Fu_user user = userMapper.userlogin(map);
        return user;
    }


    //根据用户名获取用户信息
    public Fu_user selectByUserName(String username)
    {
        Fu_user fuUser = userMapper.selectByUserName(username);
        return fuUser;
    }

}
