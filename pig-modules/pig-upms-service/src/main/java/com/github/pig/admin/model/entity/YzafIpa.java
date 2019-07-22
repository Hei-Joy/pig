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
@TableName("yzaf_ipa")
@Data
public class YzafIpa extends Model<YzafIpa> {

    private static final long serialVersionUID = 1L;

    private String id;
    private String ipaName;
    private String ipaContent;
    private String functionId;
    private String url;
    @TableField("del_flag")
    private String delFlag;
    @TableField("update_time")
    private Date updateTime;
    @TableField("status")
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIpaName() {
        return ipaName;
    }

    public void setIpaName(String ipaName) {
        this.ipaName = ipaName;
    }

    public String getIpaContent() {
        return ipaContent;
    }

    public void setIpaContent(String ipaContent) {
        this.ipaContent = ipaContent;
    }

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "YzafIpa{" +
        ", id=" + id +
        ", ipaName=" + ipaName +
        ", ipaContent=" + ipaContent +
        ", functionId=" + functionId +
        ", url=" + url +
        "}";
    }


}
