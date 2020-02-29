package com.aweikn.springseed.service;

import com.aweikn.springseed.entity.User;
import com.aweikn.springseed.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LoginService {
    @Autowired
    private  UserMapper userMapper;

    public User Sel(Integer userId) {
        System.out.println("进入服务类");
        return  userMapper.Sel(userId);
    }

    public String getInfo(){
        return userMapper.getInfo();
    }
}
