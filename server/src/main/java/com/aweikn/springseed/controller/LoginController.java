package com.aweikn.springseed.controller;

import com.aweikn.springseed.entity.User;
import com.aweikn.springseed.service.UserService;
import com.aweikn.springseed.service.dto.LoginDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.lang.reflect.Method;

@Api("用户操作api")
@RestController
//@CrossOrigin("http://localhost:3000") // 只有指定域名可以访问该类下所有接口
public class LoginController {

    @Autowired
    private UserService loginService;

    @ApiOperation(value = "登录", notes="登陆系统")
    @ApiImplicitParams({
        @ApiImplicitParam(name="userCode", value ="账户",paramType = "form", required = true, dataType = "String"),
        @ApiImplicitParam(name="userPWD", value ="密码",paramType = "form", required = true, dataType = "String")
    })
    @PostMapping("login")
//    @RequestMapping(value="login",method = RequestMethod.POST,produces="application/x-www-form-urlencoded")
    public LoginDto login(@RequestParam String userCode, String userPWD){
//        System.out.println(userCode);
        return loginService.login(userCode, userPWD);
    }

    @ApiOperation(value = "获取用户", notes="根据用户ID获取用户所有信息")
    @ApiImplicitParam(name="userId", value ="用户ID",paramType = "path", required = true, dataType = "String")
    @GetMapping("getUser/{userId}")
    public User getUser(@PathVariable(value = "userId")  Integer userId) {
//        System.out.println(userId);
        return loginService.Sel(userId);
    }

    @ApiOperation(value = "检查用户是否存在", notes="通过账户查询该用户是否存在")
    @ApiImplicitParam(name = "userCode", value = "isUserExist", paramType = "path", required = true, dataType = "String")
    @GetMapping("isUserExist/{userCode}")
    public Boolean isUserExist(@PathVariable(value = "userCode")  String userCode) {
//        System.out.println(userId);
        return loginService.isUserExist(userCode);
    }


}
