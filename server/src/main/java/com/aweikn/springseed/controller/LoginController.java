package com.aweikn.springseed.controller;

import com.aweikn.springseed.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
//@CrossOrigin("http://localhost:3000") // 只有指定域名可以访问该类下所有接口
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/")
    public String login(){
        System.out.println("///");
        return loginService.getInfo();
    }

    @RequestMapping("getUser/{userId}")
    public String getUser(@PathVariable(value = "userId")  Integer userId) {
        System.out.println(userId);
        return loginService.Sel(userId).toString();
    }
}