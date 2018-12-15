package com.mall.pojo;

public class assets {
    private String id;

    private String name;

    private Integer tbValue;

    private String tbType;

    private Boolean tbStatic;

    private String rootid;

    public assets(String id, String name, Integer tbValue, String tbType, Boolean tbStatic, String rootid) {
        this.id = id;
        this.name = name;
        this.tbValue = tbValue;
        this.tbType = tbType;
        this.tbStatic = tbStatic;
        this.rootid = rootid;
    }

    public assets() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTbValue() {
        return tbValue;
    }

    public void setTbValue(Integer tbValue) {
        this.tbValue = tbValue;
    }

    public String getTbType() {
        return tbType;
    }

    public void setTbType(String tbType) {
        this.tbType = tbType == null ? null : tbType.trim();
    }

    public Boolean getTbStatic() {
        return tbStatic;
    }

    public void setTbStatic(Boolean tbStatic) {
        this.tbStatic = tbStatic;
    }

    public String getRootid() {
        return rootid;
    }

    public void setRootid(String rootid) {
        this.rootid = rootid == null ? null : rootid.trim();
    }
}