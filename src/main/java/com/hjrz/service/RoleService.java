package com.hjrz.service;

import com.hjrz.dao.Fu_roleMapper;
import com.hjrz.dao.Fu_user_roleMapper;
import com.hjrz.entity.Fu_role;
import com.hjrz.entity.Fu_user_role;
import com.hjrz.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleService {

    @Autowired
    private Fu_roleMapper roleMapper;

    @Autowired
    private Fu_user_roleMapper fuUserRoleMapper;

    public Set<String> SelectRolesByUserID(Long userid)
    {
        Set<String> RoleSet = new HashSet<String>();
        List<Fu_user_role> user_roleList = fuUserRoleMapper.selectByUserID(userid);
        for(Fu_user_role user_role :user_roleList)
        {
            Fu_role role = roleMapper.selectByPrimaryKey(user_role.getFu_role_id());
            String rolename = role.getFu_role_name();
            RoleSet.add(rolename);
        }
        return RoleSet;
    }

}
