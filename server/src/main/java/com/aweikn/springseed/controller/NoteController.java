package com.aweikn.springseed.controller;

import com.aweikn.springseed.entity.Note;
import com.aweikn.springseed.service.NoteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api("日志操作Api")
@RestController
public class NoteController {

    @Autowired
    private NoteService noteService;

    @ApiOperation(value = "获取日记", notes="根据用户ID获取用户所有日记信息")
    @ApiImplicitParam(name="userId", value ="用户ID",paramType = "path", required = true, dataType = "String")
    @GetMapping("getNoteByUserId/{userId}")
    public Note getNoteByUserId(@PathVariable(value = "userId")  Integer userId) {
//        System.out.println(userId);
        return noteService.getNoteByUserId(userId);
    }


}
