package com.example.Market.service;

import com.example.Market.dao.SysUserMapper;
import com.example.Market.pojo.SysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserService {

    @Resource
    private SysUserMapper mapper;

    //用户登录
    public SysUser findLogin(SysUser sysUser){
        return mapper.findLogin(sysUser);
    }

    //异步判断用户注册的电话号码是否唯一
    public int findUserInfoPhone(String Phone){
        return mapper.findUserInfoPhone(Phone);
    }

    //异步判断用户注册的QQ邮箱是否唯一
    public int findUserInfoqq(String User_qqEmail){
        return mapper.findUserInfoqq(User_qqEmail);
    }

    //用户注册
    public int addUser(SysUser user){
        return mapper.addUser(user);
    }

    //查询随机数
    public String findRandom(String User_qqEmail){
        return mapper.findRandom(User_qqEmail);
    }
}
