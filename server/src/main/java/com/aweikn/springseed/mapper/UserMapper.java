package com.aweikn.springseed.mapper;

import com.aweikn.springseed.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User Sel(Integer userId);

    String getInfo();
}
