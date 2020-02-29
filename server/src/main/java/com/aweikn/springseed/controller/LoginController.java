package com.aweikn.springseed.controller;

import com.aweikn.springseed.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@Api("用户操作api")
@RestController
//@CrossOrigin("http://localhost:3000") // 只有指定域名可以访问该类下所有接口
public class LoginController {

    @Autowired
    private LoginService loginService;

    @ApiOperation(value="商品查询(分页)")
    @RequestMapping("/")
    public String login(){
        System.out.println("///");
        return loginService.getInfo();
    }
    @ApiOperation(value = "获取用户", notes="通过手机号获取OTP验证码")
    @ApiImplicitParam(name = "getUser", value = "user", paramType = "query", required = true, dataType = "String")
    @RequestMapping("getUser/{userId}")
    public String getUser(@PathVariable(value = "userId")  Integer userId) {
        System.out.println(userId);
        return loginService.Sel(userId).toString();
    }
}
