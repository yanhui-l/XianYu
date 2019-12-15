package com.example.Market.service;

import com.example.Market.dao.SysUserMapper;
import com.example.Market.pojo.SysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserService {

    @Resource
    private SysUserMapper mapper;

    public SysUser findLogin(SysUser sysUser){
        return mapper.findLogin(sysUser);
    }
}
