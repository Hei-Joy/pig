package com.mall.pojo;

public class firstInstanceUnit {
    private String id;

    private String companyId;

    private String examinationtype;

    private String examinationname;

    public firstInstanceUnit(String id, String companyId, String examinationtype, String examinationname) {
        this.id = id;
        this.companyId = companyId;
        this.examinationtype = examinationtype;
        this.examinationname = examinationname;
    }

    public firstInstanceUnit() {
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

    public String getExaminationtype() {
        return examinationtype;
    }

    public void setExaminationtype(String examinationtype) {
        this.examinationtype = examinationtype == null ? null : examinationtype.trim();
    }

    public String getExaminationname() {
        return examinationname;
    }

    public void setExaminationname(String examinationname) {
        this.examinationname = examinationname == null ? null : examinationname.trim();
    }
}