package com.github.pig.admin.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Company {
    private String id;

    private String fullname;

    private String oneLevelAddress;

    private String twoLevelAddress;

    private String threeLevelAddress;

    private String organizationcode;

    private Boolean troopsorsecrecy;

    private String bank;

    private Integer postalcode;

    private String oneLevelUnitproperty;

    private String twoLevelUnitproperty;

    private String unitattribute;

    private String competentdepartment;

    private Integer accountnumber;

    private String unitcharacteristics;

    private String affiliation;

    private Date createdate;

    private String operatorid;

    private Boolean isdelete;

    private Date updatedate;
}