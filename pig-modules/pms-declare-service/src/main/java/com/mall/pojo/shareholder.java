package com.mall.pojo;

import java.util.Date;

public class shareholder {
    private String id;

    private String companyId;

    private String name;

    private String nationality;

    private Integer proportion;

    private Date createdate;

    private String operatorid;

    private Boolean isdelete;

    private Date updatedate;

    public shareholder(String id, String companyId, String name, String nationality, Integer proportion, Date createdate, String operatorid, Boolean isdelete, Date updatedate) {
        this.id = id;
        this.companyId = companyId;
        this.name = name;
        this.nationality = nationality;
        this.proportion = proportion;
        this.createdate = createdate;
        this.operatorid = operatorid;
        this.isdelete = isdelete;
        this.updatedate = updatedate;
    }

    public shareholder() {
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public Integer getProportion() {
        return proportion;
    }

    public void setProportion(Integer proportion) {
        this.proportion = proportion;
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