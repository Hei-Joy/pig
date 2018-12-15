package com.mall.pojo;

import java.util.Date;

public class corporation {
    private String id;

    private String companyId;

    private String name;

    private String sex;

    private Date birthday;

    private String officephone;

    private String fax;

    private Integer mobilephone;

    private String email;

    private Date createdate;

    private String operatorid;

    private Boolean isdelete;

    private Date updatedate;

    public corporation(String id, String companyId, String name, String sex, Date birthday, String officephone, String fax, Integer mobilephone, String email, Date createdate, String operatorid, Boolean isdelete, Date updatedate) {
        this.id = id;
        this.companyId = companyId;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.officephone = officephone;
        this.fax = fax;
        this.mobilephone = mobilephone;
        this.email = email;
        this.createdate = createdate;
        this.operatorid = operatorid;
        this.isdelete = isdelete;
        this.updatedate = updatedate;
    }

    public corporation() {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone == null ? null : officephone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public Integer getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(Integer mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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