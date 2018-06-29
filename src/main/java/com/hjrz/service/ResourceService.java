package com.hjrz.service;

import com.hjrz.dao.Fu_resourceMapper;
import com.hjrz.dao.Fu_role_resourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ResourceService {

    @Autowired
    private Fu_resourceMapper resourceMapper;

    @Autowired
    private Fu_role_resourceMapper role_resourceMapper;


}
