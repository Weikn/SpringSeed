package com.aweikn.springseed.service;

import com.aweikn.springseed.entity.Note;
import com.aweikn.springseed.mapper.NoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    @Autowired
    private NoteMapper noteMapper;

    public Note getNoteByUserId(Integer userId) {
        return noteMapper.getNoteByUserId(userId);
    }
}
