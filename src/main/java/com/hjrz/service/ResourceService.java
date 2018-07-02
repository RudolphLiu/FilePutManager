package com.hjrz.service;

import com.hjrz.dao.Fu_resourceMapper;
import com.hjrz.dao.Fu_role_resourceMapper;
import com.hjrz.entity.Fu_resource;
import com.hjrz.entity.Fu_role_resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ResourceService {

    @Autowired
    private Fu_resourceMapper resourceMapper;

    @Autowired
    private Fu_role_resourceMapper role_resourceMapper;

}