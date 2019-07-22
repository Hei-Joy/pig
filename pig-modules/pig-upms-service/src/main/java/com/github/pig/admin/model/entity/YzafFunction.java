package com.github.pig.admin.model.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author sudan
 * @since 2019-05-23
 */
@Data
@TableName("yzaf_function")
public class YzafFunction extends Model<YzafFunction> {

    private static final long serialVersionUID = 1L;

    private String id;
    private String functionName;
    private String ipaId;
    private String parentId;
    private String remak;
    @TableField("del_flag")
    private String delFlag;
    @TableField("update_time")
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getIpaId() {
        return ipaId;
    }

    public void setIpaId(String ipaId) {
        this.ipaId = ipaId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getRemak() {
        return remak;
    }

    public void setRemak(String remak) {
        this.remak = remak;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "YzafFunction{" +
        ", id=" + id +
        ", functionName=" + functionName +
        ", ipaId=" + ipaId +
        ", parentId=" + parentId +
        ", remak=" + remak +
        "}";
    }
}
