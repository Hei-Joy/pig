package com.github.pig.admin.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Corporation {
    private String id;

    private String companyId;

    private String name;

    private String sex;

    private Date birthday;

    private String officephone;

    private String fax;

    private Integer mobilephone;

    private String email;

    private Date createdate;

    private String operatorid;

    private Boolean isdelete;

    private Date updatedate;

   }