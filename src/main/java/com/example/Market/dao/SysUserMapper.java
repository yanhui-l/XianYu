package com.example.Market.dao;

import com.example.Market.pojo.SysUser;

public interface SysUserMapper {

   //用户登录
   SysUser findLogin(SysUser user);

   //异步判断电话号码是否唯一
   int findUserInfoPhone(String Phone);

   //查询随机数
   String findRandom(String User_qqEmail);

   //异步验证QQ邮箱是否唯一
   int findUserInfoqq(String User_qqEmail);

   //注册用户
   int addUser(SysUser user);
}