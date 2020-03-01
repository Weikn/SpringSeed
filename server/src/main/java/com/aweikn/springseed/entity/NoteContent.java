package com.aweikn.springseed.entity;

import java.util.Date;

public class NoteContent {

    private Integer fileId;

    private String  fileName;

    private String  fileSize;

    private String  filePath;

    private Date    uploadDate;

    private String  fileCode;

    private String  pratyType;

    private String  pratyCode;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }

    public String getPratyType() {
        return pratyType;
    }

    public void setPratyType(String pratyType) {
        this.pratyType = pratyType;
    }

    public String getPratyCode() {
        return pratyCode;
    }

    public void setPratyCode(String pratyCode) {
        this.pratyCode = pratyCode;
    }

    @Override
    public String toString() {
        return "UserBook{" +
                "fileId=" + fileId +
                ", fileName='" + fileName + '\'' +
                ", fileSize='" + fileSize + '\'' +
                ", filePath='" + filePath + '\'' +
                ", uploadDate=" + uploadDate +
                ", fileCode='" + fileCode + '\'' +
                ", pratyType='" + pratyType + '\'' +
                ", pratyCode='" + pratyCode + '\'' +
                '}';
    }
}
