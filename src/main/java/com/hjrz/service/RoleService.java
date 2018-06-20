package com.hjrz.service;

import com.hjrz.dao.Fu_roleMapper;
import com.hjrz.entity.Fu_role;
import com.hjrz.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RoleService {

    @Autowired
    private Fu_roleMapper roleMapper;

    public void addRole(Role role)
    {
        Fu_role fu_role = this.toEntity(role);
        fu_role.setCreate_time(new Date());
        roleMapper.insertSelective(fu_role);
    }

    public Fu_role toEntity(Role role)
    {
        Fu_role fu_role = new Fu_role();
        fu_role.setFu_parent_id(role.getParentid());
        fu_role.setFu_role_name(role.getName());
        fu_role.setFu_role_desc(role.getDesc());
        return fu_role;
    }
}
