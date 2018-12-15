package com.mall.pojo;

import java.util.Date;

public class company {
    private String id;

    private String fullname;

    private String address;

    private String organizationcode;

    private Boolean troopsorsecrecy;

    private String bank;

    private Integer postalcode;

    private String unitproperty;

    private String unitattribute;

    private String competentdepartment;

    private Integer accountnumber;

    private String unitcharacteristics;

    private String affiliation;

    private Date createdate;

    private String operatorid;

    private Boolean isdelete;

    private Date updatedate;

    public company(String id, String fullname, String address, String organizationcode, Boolean troopsorsecrecy, String bank, Integer postalcode, String unitproperty, String unitattribute, String competentdepartment, Integer accountnumber, String unitcharacteristics, String affiliation, Date createdate, String operatorid, Boolean isdelete, Date updatedate) {
        this.id = id;
        this.fullname = fullname;
        this.address = address;
        this.organizationcode = organizationcode;
        this.troopsorsecrecy = troopsorsecrecy;
        this.bank = bank;
        this.postalcode = postalcode;
        this.unitproperty = unitproperty;
        this.unitattribute = unitattribute;
        this.competentdepartment = competentdepartment;
        this.accountnumber = accountnumber;
        this.unitcharacteristics = unitcharacteristics;
        this.affiliation = affiliation;
        this.createdate = createdate;
        this.operatorid = operatorid;
        this.isdelete = isdelete;
        this.updatedate = updatedate;
    }

    public company() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getOrganizationcode() {
        return organizationcode;
    }

    public void setOrganizationcode(String organizationcode) {
        this.organizationcode = organizationcode == null ? null : organizationcode.trim();
    }

    public Boolean getTroopsorsecrecy() {
        return troopsorsecrecy;
    }

    public void setTroopsorsecrecy(Boolean troopsorsecrecy) {
        this.troopsorsecrecy = troopsorsecrecy;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public Integer getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Integer postalcode) {
        this.postalcode = postalcode;
    }

    public String getUnitproperty() {
        return unitproperty;
    }

    public void setUnitproperty(String unitproperty) {
        this.unitproperty = unitproperty == null ? null : unitproperty.trim();
    }

    public String getUnitattribute() {
        return unitattribute;
    }

    public void setUnitattribute(String unitattribute) {
        this.unitattribute = unitattribute == null ? null : unitattribute.trim();
    }

    public String getCompetentdepartment() {
        return competentdepartment;
    }

    public void setCompetentdepartment(String competentdepartment) {
        this.competentdepartment = competentdepartment == null ? null : competentdepartment.trim();
    }

    public Integer getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(Integer accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getUnitcharacteristics() {
        return unitcharacteristics;
    }

    public void setUnitcharacteristics(String unitcharacteristics) {
        this.unitcharacteristics = unitcharacteristics == null ? null : unitcharacteristics.trim();
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation == null ? null : affiliation.trim();
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