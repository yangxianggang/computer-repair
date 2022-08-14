package com.example.controller;

import com.example.common.LoginUser;
import com.example.param.UserParam;
import com.example.pojo.UserInfo;
import com.example.service.UserInfoService;
import com.example.util.RdfaData;
import com.example.util.enums.ExceptionEnums;
import com.weicoder.common.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("user")
public class UserInfoController {

    @Autowired
    private UserInfoService userService;
    @RequestMapping("/login")

    public RdfaData getUser(@RequestBody UserParam user, HttpSession session){
        RdfaData rdfaData=new RdfaData();
        UserInfo byLogin = userService.getUserNameAndPasswordByLogin(user);
        if (null!=byLogin) {
            LoginUser sessionLoginUser = new LoginUser();
            sessionLoginUser.setUser_name(byLogin.getUserName());
            sessionLoginUser.setNick_name(byLogin.getNickName());
            session.setAttribute("type", "ffffffff");
            session.setAttribute("sessionConfig", sessionLoginUser);
            rdfaData.success(ExceptionEnums.成功.getKey(), ExceptionEnums.成功.getValue(),byLogin);
        }else {
            rdfaData.success(ExceptionEnums.失败.getKey(), ExceptionEnums.成功.getValue());
        }
        return  rdfaData;
    }
}
