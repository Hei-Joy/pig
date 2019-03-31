package com.github.pig.admin.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ScienceLeadingOfficial {
    private String id;

    private String companyId;

    private String name;

    private String officephone;

    private Integer mobilephone;

    private String post;

    private Date createdate;

    private String operatorid;

    private Boolean isdelete;

    private Date updatedate;

   }