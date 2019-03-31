package com.github.pig.admin.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class GovernmentFunds {
    private String id;

    private String companyId;

    private String entryname;

    private String fundingdepartment;

    private Date fundingtime;

    private Double totalfunds;

    private Boolean checkandaccept;

    private Date createdate;

    private String operatorid;

    private Boolean isdelete;

    private Date updatedate;

    }