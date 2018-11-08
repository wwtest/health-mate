package com.healthmate.pushdata.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.util.Date;

public class BaseEntity {
    @Id
    private String id;

    @CreatedDate
    private Date createdDate;

    @Version
    private Long version;

    private Boolean delete = Boolean.FALSE;}
