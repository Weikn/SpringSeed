package com.aweikn.springseed.service;

import com.aweikn.springseed.entity.User;
import com.aweikn.springseed.mapper.UserMapper;
import com.aweikn.springseed.service.dto.LoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {
    @Autowired
    private  UserMapper userMapper;

    public User Sel(Integer userId) { return  userMapper.Sel(userId); }

    public String getInfo(){
        return userMapper.getInfo().toString();
    }

    public Boolean isUserExist(String userCode) {
        return null == userMapper.isUserExist(userCode) ? false : true;
    }

    /**
     * 登录
     * @param userCode
     * @param userPWD
     * @return
     */
    public LoginDto login(String userCode, String userPWD){
        LoginDto loginRst = new LoginDto();
        if (this.isUserExist(userCode)) {
            loginRst.setUserInfo(userMapper.getUserByCode(userCode));
            loginRst.setStatus("success");
            loginRst.setMsg("login success");
        }
        else {
            loginRst.setStatus("error");
            loginRst.setMsg("this acct is exist!");
        }
        return loginRst;
    }
}
