package com.github.pig.admin.model.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author sudan
 * @since 2019-05-23
 */
@TableName("user_info")
public class UserInfo extends Model<UserInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    @TableId("USERID")
    private String userid;
    /**
     * 登陆编号
     */
    @TableField("LOGINID")
    private String loginid;
    /**
     * 用户名称
     */
    @TableField("USERNAME")
    private String username;
    /**
     * 密码
     */
    @TableField("PASSWORD")
    private String password;
    /**
     * 所属机构
     */
    @TableField("ORGID")
    private String orgid;
    /**
     * 顶层机构
     */
    @TableField("TOPORGID")
    private String toporgid;
    /**
     * 用户类型
     */
    @TableField("USERTYPE")
    private String usertype;
    /**
     * 用户角色
     */
    @TableField("ROLES")
    private String roles;
    /**
     * 身份证
     */
    @TableField("IDENTITY")
    private String identity;
    /**
     * 性别
     */
    @TableField("SEX")
    private String sex;
    /**
     * 生日
     */
    @TableField("BIRTH")
    private String birth;
    /**
     * 住址
     */
    @TableField("ADDRESS")
    private String address;
    /**
     * 邮箱
     */
    @TableField("EMAIL")
    private String email;
    /**
     * 电话
     */
    @TableField("CELLPHONE")
    private String cellphone;
    /**
     * 可用状态
     */
    @TableField("STATUS")
    private String status;
    /**
     * 绑定微信号
     */
    @TableField("WXNO")
    private String wxno;
    /**
     * 可登陆IP
     */
    @TableField("IP")
    private String ip;
    /**
     * 上次登陆时间
     */
    @TableField("LASTLOGIN")
    private String lastlogin;
    /**
     * 皮肤
     */
    @TableField("SKIN")
    private String skin;
    /**
     * 备注说明
     */
    @TableField("REMARK")
    private String remark;
    /**
     * 录入人
     */
    @TableField("INPUTUSERID")
    private String inputuserid;
    /**
     * 录入机构
     */
    @TableField("INPUTORGID")
    private String inputorgid;
    /**
     * 录入时间
     */
    @TableField("INPUTTIME")
    private String inputtime;
    @TableField("CHANNELNO")
    private String channelno;
    @TableField("MUSTCALL")
    private String mustcall;
    @TableField("MUSTTEL")
    private String musttel;
    @TableField("MUSTBACK")
    private String mustback;
    @TableField("ISEMP")
    private String isemp;


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getToporgid() {
        return toporgid;
    }

    public void setToporgid(String toporgid) {
        this.toporgid = toporgid;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWxno() {
        return wxno;
    }

    public void setWxno(String wxno) {
        this.wxno = wxno;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(String lastlogin) {
        this.lastlogin = lastlogin;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getInputuserid() {
        return inputuserid;
    }

    public void setInputuserid(String inputuserid) {
        this.inputuserid = inputuserid;
    }

    public String getInputorgid() {
        return inputorgid;
    }

    public void setInputorgid(String inputorgid) {
        this.inputorgid = inputorgid;
    }

    public String getInputtime() {
        return inputtime;
    }

    public void setInputtime(String inputtime) {
        this.inputtime = inputtime;
    }

    public String getChannelno() {
        return channelno;
    }

    public void setChannelno(String channelno) {
        this.channelno = channelno;
    }

    public String getMustcall() {
        return mustcall;
    }

    public void setMustcall(String mustcall) {
        this.mustcall = mustcall;
    }

    public String getMusttel() {
        return musttel;
    }

    public void setMusttel(String musttel) {
        this.musttel = musttel;
    }

    public String getMustback() {
        return mustback;
    }

    public void setMustback(String mustback) {
        this.mustback = mustback;
    }

    public String getIsemp() {
        return isemp;
    }

    public void setIsemp(String isemp) {
        this.isemp = isemp;
    }

    @Override
    protected Serializable pkVal() {
        return this.userid;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
        ", userid=" + userid +
        ", loginid=" + loginid +
        ", username=" + username +
        ", password=" + password +
        ", orgid=" + orgid +
        ", toporgid=" + toporgid +
        ", usertype=" + usertype +
        ", roles=" + roles +
        ", identity=" + identity +
        ", sex=" + sex +
        ", birth=" + birth +
        ", address=" + address +
        ", email=" + email +
        ", cellphone=" + cellphone +
        ", status=" + status +
        ", wxno=" + wxno +
        ", ip=" + ip +
        ", lastlogin=" + lastlogin +
        ", skin=" + skin +
        ", remark=" + remark +
        ", inputuserid=" + inputuserid +
        ", inputorgid=" + inputorgid +
        ", inputtime=" + inputtime +
        ", channelno=" + channelno +
        ", mustcall=" + mustcall +
        ", musttel=" + musttel +
        ", mustback=" + mustback +
        ", isemp=" + isemp +
        "}";
    }
}
