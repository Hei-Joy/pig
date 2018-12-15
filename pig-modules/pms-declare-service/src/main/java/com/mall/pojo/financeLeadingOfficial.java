package com.mall.pojo;

import java.util.Date;

public class financeLeadingOfficial {
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

    public financeLeadingOfficial(String id, String companyId, String name, String post, String officephone, Integer mobilephone, Date createdate, String operatorid, Boolean isdelete, Date updatedate) {
        this.id = id;
        this.companyId = companyId;
        this.name = name;
        this.post = post;
        this.officephone = officephone;
        this.mobilephone = mobilephone;
        this.createdate = createdate;
        this.operatorid = operatorid;
        this.isdelete = isdelete;
        this.updatedate = updatedate;
    }

    public financeLeadingOfficial() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone == null ? null : officephone.trim();
    }

    public Integer getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(Integer mobilephone) {
        this.mobilephone = mobilephone;
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