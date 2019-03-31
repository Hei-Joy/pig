package com.github.pig.admin.model.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Additional {
    private String id;

    private String companyId;

    private String creditrating;

    private Date registrationtime;

    private Double registeredcapital;

    private Integer proportionofforeigncapital;

    private Integer workforce;

    private Integer juniorcollegenumber;

    private Integer developernumber;

    private Integer undergraduatenumber;

    private Integer middlemanagementnumber;

    private Integer seniortitlenumber;

    private Integer intermediatetitlenumber;

    private Double grossincome;

    private Double salesrevenue;

    private Double valueadded;

    private Double totalassets;

    private Double totalliabilities;

    private Double enterprisenetincome;

    private Double totaltaxpayment;

    private Double foreignexchangeearning;

    private Double developmentexpenditure;

    private Double assetliabilityratio;

    private Date createdate;

    private String operatorid;

    private Boolean isdelete;

    private Date updatedate;
}