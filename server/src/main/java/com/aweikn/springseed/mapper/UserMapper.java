package com.aweikn.springseed.mapper;

import com.aweikn.springseed.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User Sel(Integer userId);

    List<User> getInfo();
}
