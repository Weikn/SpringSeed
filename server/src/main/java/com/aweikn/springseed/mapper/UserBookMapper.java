package com.aweikn.springseed.mapper;

import com.aweikn.springseed.entity.UserBook;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBookMapper {

    UserBook getUserBookByUserId(Integer userId);
}
