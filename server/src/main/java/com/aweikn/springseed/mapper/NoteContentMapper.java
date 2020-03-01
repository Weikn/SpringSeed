package com.aweikn.springseed.mapper;

import com.aweikn.springseed.entity.NoteContent;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteContentMapper {

    NoteContent getNoteContentById(Integer fileId);
}
