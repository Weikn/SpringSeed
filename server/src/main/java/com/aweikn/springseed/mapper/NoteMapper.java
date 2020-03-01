package com.aweikn.springseed.mapper;

import com.aweikn.springseed.entity.Note;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteMapper {

    Note getNoteByUserId(Integer UserId);
}
