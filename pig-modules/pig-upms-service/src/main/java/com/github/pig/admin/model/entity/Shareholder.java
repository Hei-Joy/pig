package com.github.pig.admin.model.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Shareholder {
    private String id;

    private String companyId;

    private String name;

    private String nationality;

    private Integer proportion;

    private Date createdate;

    private String operatorid;

    private Boolean isdelete;

    private Date updatedate;

    private String shareholderNature;

    private String investmentType;

   }