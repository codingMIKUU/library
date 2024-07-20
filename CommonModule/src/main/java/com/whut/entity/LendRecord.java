package com.whut.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


public class LendRecord {
    private Integer readerId;
    private Integer bookId;
    private String isbn;
    private String bookname;
    @JsonFormat(locale="zh",timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date lendTime;
    @JsonFormat(locale="zh",timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date returnTime;
    private String status;
    private Integer borrownum;

}
