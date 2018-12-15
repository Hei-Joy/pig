package com.mall.pojo;

import java.util.Date;

public class additional {
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

    public additional(String id, String companyId, String creditrating, Date registrationtime, Double registeredcapital, Integer proportionofforeigncapital, Integer workforce, Integer juniorcollegenumber, Integer developernumber, Integer undergraduatenumber, Integer middlemanagementnumber, Integer seniortitlenumber, Integer intermediatetitlenumber, Double grossincome, Double salesrevenue, Double valueadded, Double totalassets, Double totalliabilities, Double enterprisenetincome, Double totaltaxpayment, Double foreignexchangeearning, Double developmentexpenditure, Double assetliabilityratio, Date createdate, String operatorid, Boolean isdelete, Date updatedate) {
        this.id = id;
        this.companyId = companyId;
        this.creditrating = creditrating;
        this.registrationtime = registrationtime;
        this.registeredcapital = registeredcapital;
        this.proportionofforeigncapital = proportionofforeigncapital;
        this.workforce = workforce;
        this.juniorcollegenumber = juniorcollegenumber;
        this.developernumber = developernumber;
        this.undergraduatenumber = undergraduatenumber;
        this.middlemanagementnumber = middlemanagementnumber;
        this.seniortitlenumber = seniortitlenumber;
        this.intermediatetitlenumber = intermediatetitlenumber;
        this.grossincome = grossincome;
        this.salesrevenue = salesrevenue;
        this.valueadded = valueadded;
        this.totalassets = totalassets;
        this.totalliabilities = totalliabilities;
        this.enterprisenetincome = enterprisenetincome;
        this.totaltaxpayment = totaltaxpayment;
        this.foreignexchangeearning = foreignexchangeearning;
        this.developmentexpenditure = developmentexpenditure;
        this.assetliabilityratio = assetliabilityratio;
        this.createdate = createdate;
        this.operatorid = operatorid;
        this.isdelete = isdelete;
        this.updatedate = updatedate;
    }

    public additional() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getCreditrating() {
        return creditrating;
    }

    public void setCreditrating(String creditrating) {
        this.creditrating = creditrating == null ? null : creditrating.trim();
    }

    public Date getRegistrationtime() {
        return registrationtime;
    }

    public void setRegistrationtime(Date registrationtime) {
        this.registrationtime = registrationtime;
    }

    public Double getRegisteredcapital() {
        return registeredcapital;
    }

    public void setRegisteredcapital(Double registeredcapital) {
        this.registeredcapital = registeredcapital;
    }

    public Integer getProportionofforeigncapital() {
        return proportionofforeigncapital;
    }

    public void setProportionofforeigncapital(Integer proportionofforeigncapital) {
        this.proportionofforeigncapital = proportionofforeigncapital;
    }

    public Integer getWorkforce() {
        return workforce;
    }

    public void setWorkforce(Integer workforce) {
        this.workforce = workforce;
    }

    public Integer getJuniorcollegenumber() {
        return juniorcollegenumber;
    }

    public void setJuniorcollegenumber(Integer juniorcollegenumber) {
        this.juniorcollegenumber = juniorcollegenumber;
    }

    public Integer getDevelopernumber() {
        return developernumber;
    }

    public void setDevelopernumber(Integer developernumber) {
        this.developernumber = developernumber;
    }

    public Integer getUndergraduatenumber() {
        return undergraduatenumber;
    }

    public void setUndergraduatenumber(Integer undergraduatenumber) {
        this.undergraduatenumber = undergraduatenumber;
    }

    public Integer getMiddlemanagementnumber() {
        return middlemanagementnumber;
    }

    public void setMiddlemanagementnumber(Integer middlemanagementnumber) {
        this.middlemanagementnumber = middlemanagementnumber;
    }

    public Integer getSeniortitlenumber() {
        return seniortitlenumber;
    }

    public void setSeniortitlenumber(Integer seniortitlenumber) {
        this.seniortitlenumber = seniortitlenumber;
    }

    public Integer getIntermediatetitlenumber() {
        return intermediatetitlenumber;
    }

    public void setIntermediatetitlenumber(Integer intermediatetitlenumber) {
        this.intermediatetitlenumber = intermediatetitlenumber;
    }

    public Double getGrossincome() {
        return grossincome;
    }

    public void setGrossincome(Double grossincome) {
        this.grossincome = grossincome;
    }

    public Double getSalesrevenue() {
        return salesrevenue;
    }

    public void setSalesrevenue(Double salesrevenue) {
        this.salesrevenue = salesrevenue;
    }

    public Double getValueadded() {
        return valueadded;
    }

    public void setValueadded(Double valueadded) {
        this.valueadded = valueadded;
    }

    public Double getTotalassets() {
        return totalassets;
    }

    public void setTotalassets(Double totalassets) {
        this.totalassets = totalassets;
    }

    public Double getTotalliabilities() {
        return totalliabilities;
    }

    public void setTotalliabilities(Double totalliabilities) {
        this.totalliabilities = totalliabilities;
    }

    public Double getEnterprisenetincome() {
        return enterprisenetincome;
    }

    public void setEnterprisenetincome(Double enterprisenetincome) {
        this.enterprisenetincome = enterprisenetincome;
    }

    public Double getTotaltaxpayment() {
        return totaltaxpayment;
    }

    public void setTotaltaxpayment(Double totaltaxpayment) {
        this.totaltaxpayment = totaltaxpayment;
    }

    public Double getForeignexchangeearning() {
        return foreignexchangeearning;
    }

    public void setForeignexchangeearning(Double foreignexchangeearning) {
        this.foreignexchangeearning = foreignexchangeearning;
    }

    public Double getDevelopmentexpenditure() {
        return developmentexpenditure;
    }

    public void setDevelopmentexpenditure(Double developmentexpenditure) {
        this.developmentexpenditure = developmentexpenditure;
    }

    public Double getAssetliabilityratio() {
        return assetliabilityratio;
    }

    public void setAssetliabilityratio(Double assetliabilityratio) {
        this.assetliabilityratio = assetliabilityratio;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid == null ? null : operatorid.trim();
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
}