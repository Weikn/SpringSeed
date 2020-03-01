package com.aweikn.springseed.entity;

import java.util.Date;

public class Note {

    private Integer noteId;

    private String  noteTitle;

    private String  noteSummary;

    private String  noteContent;

    private Date    noteCreateDate;

    private Date    noteUpdate;

    private Integer noteUserId;

    private Integer noteBookId;

    private String  partyType;

    private String  partyCode;

    private Integer fileContentId;


    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteSummary() {
        return noteSummary;
    }

    public void setNoteSummary(String noteSummary) {
        this.noteSummary = noteSummary;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public Date getNoteCreateDate() {
        return noteCreateDate;
    }

    public void setNoteCreateDate(Date noteCreateDate) {
        this.noteCreateDate = noteCreateDate;
    }

    public Date getNoteUpdate() {
        return noteUpdate;
    }

    public void setNoteUpdate(Date noteUpdate) {
        this.noteUpdate = noteUpdate;
    }

    public Integer getNoteUserId() {
        return noteUserId;
    }

    public void setNoteUserId(Integer noteUserId) {
        this.noteUserId = noteUserId;
    }

    public Integer getNoteBookId() {
        return noteBookId;
    }

    public void setNoteBookId(Integer noteBookId) {
        this.noteBookId = noteBookId;
    }

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    public String getPartyCode() {
        return partyCode;
    }

    public void setPartyCode(String partyCode) {
        this.partyCode = partyCode;
    }

    public Integer getFileContentId() {
        return fileContentId;
    }

    public void setFileContentId(Integer fileContentId) {
        this.fileContentId = fileContentId;
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteId=" + noteId +
                ", noteTitle='" + noteTitle + '\'' +
                ", noteSummary='" + noteSummary + '\'' +
                ", noteContent='" + noteContent + '\'' +
                ", noteCreateDate=" + noteCreateDate +
                ", noteUpdate=" + noteUpdate +
                ", noteUserId=" + noteUserId +
                ", noteBookId=" + noteBookId +
                ", partyType='" + partyType + '\'' +
                ", partyCode='" + partyCode + '\'' +
                ", fileContentId=" + fileContentId +
                '}';
    }
}
