package com.mall.pojo;

import java.util.Date;

public class governmentFunds {
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

    public governmentFunds(String id, String companyId, String entryname, String fundingdepartment, Date fundingtime, Double totalfunds, Boolean checkandaccept, Date createdate, String operatorid, Boolean isdelete, Date updatedate) {
        this.id = id;
        this.companyId = companyId;
        this.entryname = entryname;
        this.fundingdepartment = fundingdepartment;
        this.fundingtime = fundingtime;
        this.totalfunds = totalfunds;
        this.checkandaccept = checkandaccept;
        this.createdate = createdate;
        this.operatorid = operatorid;
        this.isdelete = isdelete;
        this.updatedate = updatedate;
    }

    public governmentFunds() {
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

    public String getEntryname() {
        return entryname;
    }

    public void setEntryname(String entryname) {
        this.entryname = entryname == null ? null : entryname.trim();
    }

    public String getFundingdepartment() {
        return fundingdepartment;
    }

    public void setFundingdepartment(String fundingdepartment) {
        this.fundingdepartment = fundingdepartment == null ? null : fundingdepartment.trim();
    }

    public Date getFundingtime() {
        return fundingtime;
    }

    public void setFundingtime(Date fundingtime) {
        this.fundingtime = fundingtime;
    }

    public Double getTotalfunds() {
        return totalfunds;
    }

    public void setTotalfunds(Double totalfunds) {
        this.totalfunds = totalfunds;
    }

    public Boolean getCheckandaccept() {
        return checkandaccept;
    }

    public void setCheckandaccept(Boolean checkandaccept) {
        this.checkandaccept = checkandaccept;
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