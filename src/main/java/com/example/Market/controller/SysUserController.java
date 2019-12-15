package com.example.Market.controller;

import com.example.Market.helper.CreatMD5;
import com.example.Market.helper.RandomNum;
import com.example.Market.pojo.SysUser;
import com.example.Market.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Random;

@Controller
public class SysUserController {

    @Resource
    private SysUserService service = new SysUserService();

    /**
     * 用户登录
     * */
    @RequestMapping(value = "/findLogin")
    public String findLogin(HttpServletRequest request,SysUser user, HttpSession session, String checkCode,@RequestParam("User_Password")String User_Password){
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
            String md5 = CreatMD5.getMd5(User_Password);
            String numr = service.findRandom(user.getUser_qqEmail());
            user.setUser_Password(md5+numr);
            SysUser sysUser = service.findLogin(user);
            if(sysUser!=null){
                session.setAttribute("sysUser",sysUser);
                return "index";
            }
            request.setAttribute("errorMsg", "用户名或者密码错误！");
            return "Login";
        }
    }

    /**
     * 异步判断QQ邮箱是否唯一
     * */
    @ResponseBody
    @RequestMapping(value="/findUserInfoqq")
    public int findUserInfoqq(String qq){
        int i = service.findUserInfoqq(qq);
        return i;
    }

    /**
     * 异步判断QQ邮箱是否唯一
     * */
    @ResponseBody
    @RequestMapping(value="/findUserInfoPhone")
    public int findUserInfoPhone(String phone){
        int i = service.findUserInfoPhone(phone);
        return i;
    }

    /**
     * 用户注册
     * */
    @ResponseBody
    @RequestMapping(value="/addUser")
    public int addUser(SysUser user, Model model, @RequestParam("User_Password")String User_Password){

        //进行md5加密
        String md5 = CreatMD5.getMd5(User_Password);
        //生成16位随机数
        String random = RandomNum.getCharAndNumr();
        user.setUser_Password(md5+random);
        user.setRanDom(random);
        //学生违规次数
        user.setUser_ViolationCount(0);
        //截取QQ号
        String QQ = random.substring(0,11);
        user.setUser_qq(QQ);
        //当前时间
        Date date = new Date();
        user.setUser_Createtime(date);
        //随机头像
        String[] s = {"/images/photo.jpg", "photo1.jpg", "photo2.jpg", "photo3.jpg", "photo4.jpg", "photo5.jpg", "1.jpg"
                , "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg", "7.jpg", "8.jpg", "9.jpg", "10.jpg", "11.jpg", "12.jpg", "13.jpg", "14.jpg", "15.jpg", "16.jpg", "17.jpg"
                , "18.jpg", "19.jpg", "20.jpg", "21.jpg", "22.jpg", "23.jpg", "24.jpg", "25.jpg", "26.jpg", "27.jpg", "28.jpg", "29.jpg", "30.jpg"
        };
        Random rand = new Random();
        int num = rand.nextInt(35);
        user.setUser_Avatar(s[num]);//用户头像默认随机给一个
        int i = service.addUser(user);
        return i;
    }

}
