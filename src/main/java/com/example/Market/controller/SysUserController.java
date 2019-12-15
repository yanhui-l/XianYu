package com.example.Market.controller;

import com.example.Market.pojo.SysUser;
import com.example.Market.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class SysUserController {

    @Resource
    private SysUserService service = new SysUserService();

    @RequestMapping(value = "/findLogin")
    public String findLogin(HttpServletRequest request,SysUser user, HttpSession session, String checkCode){
        // 获得验证码对象
        Object cko = session.getAttribute("simpleCaptcha");
        if (cko == null) {
            request.setAttribute("errorMsg", "请输入验证码！");
            return "Login";
        }
        String captcha = cko.toString();
        if (StringUtils.isEmpty(checkCode.toUpperCase()) || captcha == null || !(checkCode.equalsIgnoreCase(captcha))) {
            request.setAttribute("errorMsg", "验证码错误！");
            return "Login";
        }  else {
            SysUser sysUser = service.findLogin(user);
            if(sysUser!=null){
                session.setAttribute("sysUser",sysUser);
                return "index";
            }
            request.setAttribute("errorMsg", "用户名或者密码错误！");
            return "Login";
        }


    }
}
