package com.github.pig.admin.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class FinanceLeadingOfficial {
    private String id;

    private String companyId;

    private String name;

    private String post;

    private String officephone;

    private Integer mobilephone;

    private Date createdate;

    private String operatorid;

    private Boolean isdelete;

    private Date updatedate;

    }