package com.github.pig.admin.model.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lengleng
 * @since 2019-03-28
 */
@TableName("case_info")
public class CaseInfo extends Model<CaseInfo> {

    private static final long serialVersionUID = 1L;

    @TableId("GUID")
    private String guid;
    @TableField("TOPORGID")
    private String toporgid;
    @TableField("INPUTTIME")
    private String inputtime;
    @TableField("BATCHNO")
    private String batchno;//批号
    @TableField("BATCHNOTYPE")
    private String batchnoType;//批号类型
    @TableField("BANKID")
    private String bankid;
    @TableField("BANKNAME")
    private String bankname;
    @TableField("BRANCH")
    private String branch;
    @TableField("SUB_BRANCH")
    private String subBranch;
    @TableField("OPERATORORG")
    private String operatororg;
    @TableField("OPERATTIME")
    private String operattime;
    @TableField("BATCHENDDATE")
    private String batchenddate;
    @TableField("NAME")
    private String name;
    @TableField("PINYIN")
    private String pinyin;
    @TableField("SEX")
    private String sex;
    @TableField("CERTNO")
    private String certno;//身份证
    @TableField("QQ")
    private String qq;
    @TableField("WEIXIN")
    private String weixin;
    @TableField("ADDR")
    private String addr;
    @TableField("ZIPCODE")
    private String zipcode;
    @TableField("TEL")
    private String tel;
    @TableField("MOBILE")
    private String mobile;
    @TableField("EMAIL")
    private String email;
    @TableField("BILLADDR")
    private String billaddr;
    @TableField("BILLZIPCODE")
    private String billzipcode;
    @TableField("REGADDR")
    private String regaddr;
    @TableField("REGZIPCODE")
    private String regzipcode;
    @TableField("DEPTNAME")
    private String deptname;
    @TableField("DEPTADDR")
    private String deptaddr;
    @TableField("DEPTZIPCODE")
    private String deptzipcode;
    @TableField("DEPTTEL")
    private String depttel;
    @TableField("JOBTITLE")
    private String jobtitle;
    @TableField("HOMEADDR")
    private String homeaddr;
    @TableField("HOMEZIPCODE")
    private String homezipcode;
    @TableField("HOMETEL")
    private String hometel;
    @TableField("HOLDERREMARK")
    private String holderremark;
    @TableField("CLOSEDATE")
    private String closedate;
    @TableField("CASEPROPERTY")
    private String caseproperty;
    @TableField("CASETYPE")
    private String casetype;
    @TableField("APPLYNO")
    private String applyno;
    @TableField("BUSSNO")
    private String bussno;
    @TableField("CARDNO")
    private String cardno;
    @TableField("OPEN_DATE")
    private String openDate;
    @TableField("CREDIT")
    private String credit;
    @TableField("BILLDATE")
    private String billdate;
    @TableField("EXPIRE")
    private String expire;
    @TableField("BALANCE")
    private String balance;
    @TableField("LASTPAYDATE")
    private String lastpaydate;
    @TableField("LASTPAYSUM")
    private String lastpaysum;
    @TableField("LEVEL")
    private String level;
    @TableField("PROD")
    private String prod;
    @TableField("LOANDATE")
    private String loandate;
    @TableField("LOANTERM")
    private String loanterm;
    @TableField("OVERDUEDATE")
    private String overduedate;
    @TableField("OVERDUEDAYS")
    private String overduedays;
    @TableField("OVERDUEPERIOD")
    private String overdueperiod;
    @TableField("OVERDUEBEGINPERIOD")
    private String overduebeginperiod;
    @TableField("PUTOUTSUM")
    private String putoutsum;
    @TableField("PERBACKSUM")
    private String perbacksum;
    @TableField("BUSSNESSSUM")
    private String bussnesssum;
    @TableField("OVERDUECORPUS")
    private String overduecorpus;
    @TableField("OVERINTEREST")
    private String overinterest;
    @TableField("WYJ")
    private String wyj;
    @TableField("FXINTEREST")
    private String fxinterest;

    public String getBatchnoType() {
        return batchnoType;
    }

    public void setBatchnoType(String batchnoType) {
        this.batchnoType = batchnoType;
    }

    @TableField("FULI")

    private String fuli;
    @TableField("LOANPERIOD")
    private String loanperiod;
    @TableField("PAIEDPERIOD")
    private String paiedperiod;
    @TableField("PAIEDTOTAL")
    private String paiedtotal;
    @TableField("YONGJINBILI")
    private String yongjinbili;
    @TableField("YONGJIN")
    private String yongjin;
    @TableField("MANAGEMENT")
    private String management;
    @TableField("POUNDAGE")
    private String poundage;
    @TableField("ASSURETYPE")
    private String assuretype;
    @TableField("ASSUREPROD")
    private String assureprod;
    @TableField("CASEREMARK")
    private String caseremark;
    @TableField("LASTCONTACTNAME")
    private String lastcontactname;
    @TableField("LASTCONTACTTIME")
    private String lastcontacttime;
    @TableField("LASTCONTACTRESULT")
    private String lastcontactresult;
    @TableField("LASTCONTACTCONTENT")
    private String lastcontactcontent;
    @TableField("LASTATTITUDE")
    private String lastattitude;
    @TableField("LASTPAYTYPE")
    private String lastpaytype;
    @TableField("LASTPROMISEMONEY")
    private String lastpromisemoney;
    @TableField("LASTPAYTIME")
    private String lastpaytime;
    @TableField("STATUS")
    private String status;
    @TableField("OWNERID")
    private String ownerid;
    @TableField("NOTE")
    private String note;
    @TableField("INPUTORGID")
    private String inputorgid;
    @TableField("INPUTUSERID")
    private String inputuserid;
    @TableField("UNTELDAYS")
    private String unteldays;
    @TableField("EXITDAYS")
    private String exitdays;
    @TableField("CASEHOLDID")
    private String caseholdid;
    @TableField("CSUSERID")
    private String csuserid;
    @TableField("ORGID")
    private String orgid;
    @TableField("ATTRIBUTE1")
    private String attribute1;
    @TableField("ATTRIBUTE2")
    private String attribute2;
    @TableField("ATTRIBUTE3")
    private String attribute3;
    @TableField("ATTRIBUTE4")
    private String attribute4;
    @TableField("ATTRIBUTE5")
    private String attribute5;
    @TableField("ATTRIBUTE6")
    private String attribute6;
    @TableField("ATTRIBUTE7")
    private String attribute7;
    @TableField("ATTRIBUTE8")
    private String attribute8;
    @TableField("ATTRIBUTE9")
    private String attribute9;
    @TableField("ATTRIBUTE10")
    private String attribute10;
    @TableField("ATTRIBUTE11")
    private String attribute11;
    @TableField("ATTRIBUTE12")
    private String attribute12;
    @TableField("ATTRIBUTE13")
    private String attribute13;
    @TableField("ATTRIBUTE14")
    private String attribute14;
    @TableField("ATTRIBUTE15")
    private String attribute15;
    @TableField("ATTRIBUTE16")
    private String attribute16;
    @TableField("ATTRIBUTE17")
    private String attribute17;
    @TableField("ATTRIBUTE18")
    private String attribute18;
    @TableField("ATTRIBUTE19")
    private String attribute19;
    @TableField("ATTRIBUTE20")
    private String attribute20;
    @TableField("CASESTATUS")
    private String casestatus;
    @TableField("BACKBALANCE")
    private String backbalance;
    @TableField("OVERDUE")
    private String overdue;


    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getToporgid() {
        return toporgid;
    }

    public void setToporgid(String toporgid) {
        this.toporgid = toporgid;
    }

    public String getInputtime() {
        return inputtime;
    }

    public void setInputtime(String inputtime) {
        this.inputtime = inputtime;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSubBranch() {
        return subBranch;
    }

    public void setSubBranch(String subBranch) {
        this.subBranch = subBranch;
    }

    public String getOperatororg() {
        return operatororg;
    }

    public void setOperatororg(String operatororg) {
        this.operatororg = operatororg;
    }

    public String getOperattime() {
        return operattime;
    }

    public void setOperattime(String operattime) {
        this.operattime = operattime;
    }

    public String getBatchenddate() {
        return batchenddate;
    }

    public void setBatchenddate(String batchenddate) {
        this.batchenddate = batchenddate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCertno() {
        return certno;
    }

    public void setCertno(String certno) {
        this.certno = certno;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBilladdr() {
        return billaddr;
    }

    public void setBilladdr(String billaddr) {
        this.billaddr = billaddr;
    }

    public String getBillzipcode() {
        return billzipcode;
    }

    public void setBillzipcode(String billzipcode) {
        this.billzipcode = billzipcode;
    }

    public String getRegaddr() {
        return regaddr;
    }

    public void setRegaddr(String regaddr) {
        this.regaddr = regaddr;
    }

    public String getRegzipcode() {
        return regzipcode;
    }

    public void setRegzipcode(String regzipcode) {
        this.regzipcode = regzipcode;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDeptaddr() {
        return deptaddr;
    }

    public void setDeptaddr(String deptaddr) {
        this.deptaddr = deptaddr;
    }

    public String getDeptzipcode() {
        return deptzipcode;
    }

    public void setDeptzipcode(String deptzipcode) {
        this.deptzipcode = deptzipcode;
    }

    public String getDepttel() {
        return depttel;
    }

    public void setDepttel(String depttel) {
        this.depttel = depttel;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getHomeaddr() {
        return homeaddr;
    }

    public void setHomeaddr(String homeaddr) {
        this.homeaddr = homeaddr;
    }

    public String getHomezipcode() {
        return homezipcode;
    }

    public void setHomezipcode(String homezipcode) {
        this.homezipcode = homezipcode;
    }

    public String getHometel() {
        return hometel;
    }

    public void setHometel(String hometel) {
        this.hometel = hometel;
    }

    public String getHolderremark() {
        return holderremark;
    }

    public void setHolderremark(String holderremark) {
        this.holderremark = holderremark;
    }

    public String getClosedate() {
        return closedate;
    }

    public void setClosedate(String closedate) {
        this.closedate = closedate;
    }

    public String getCaseproperty() {
        return caseproperty;
    }

    public void setCaseproperty(String caseproperty) {
        this.caseproperty = caseproperty;
    }

    public String getCasetype() {
        return casetype;
    }

    public void setCasetype(String casetype) {
        this.casetype = casetype;
    }

    public String getApplyno() {
        return applyno;
    }

    public void setApplyno(String applyno) {
        this.applyno = applyno;
    }

    public String getBussno() {
        return bussno;
    }

    public void setBussno(String bussno) {
        this.bussno = bussno;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getBilldate() {
        return billdate;
    }

    public void setBilldate(String billdate) {
        this.billdate = billdate;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getLastpaydate() {
        return lastpaydate;
    }

    public void setLastpaydate(String lastpaydate) {
        this.lastpaydate = lastpaydate;
    }

    public String getLastpaysum() {
        return lastpaysum;
    }

    public void setLastpaysum(String lastpaysum) {
        this.lastpaysum = lastpaysum;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getLoandate() {
        return loandate;
    }

    public void setLoandate(String loandate) {
        this.loandate = loandate;
    }

    public String getLoanterm() {
        return loanterm;
    }

    public void setLoanterm(String loanterm) {
        this.loanterm = loanterm;
    }

    public String getOverduedate() {
        return overduedate;
    }

    public void setOverduedate(String overduedate) {
        this.overduedate = overduedate;
    }

    public String getOverduedays() {
        return overduedays;
    }

    public void setOverduedays(String overduedays) {
        this.overduedays = overduedays;
    }

    public String getOverdueperiod() {
        return overdueperiod;
    }

    public void setOverdueperiod(String overdueperiod) {
        this.overdueperiod = overdueperiod;
    }

    public String getOverduebeginperiod() {
        return overduebeginperiod;
    }

    public void setOverduebeginperiod(String overduebeginperiod) {
        this.overduebeginperiod = overduebeginperiod;
    }

    public String getPutoutsum() {
        return putoutsum;
    }

    public void setPutoutsum(String putoutsum) {
        this.putoutsum = putoutsum;
    }

    public String getPerbacksum() {
        return perbacksum;
    }

    public void setPerbacksum(String perbacksum) {
        this.perbacksum = perbacksum;
    }

    public String getBussnesssum() {
        return bussnesssum;
    }

    public void setBussnesssum(String bussnesssum) {
        this.bussnesssum = bussnesssum;
    }

    public String getOverduecorpus() {
        return overduecorpus;
    }

    public void setOverduecorpus(String overduecorpus) {
        this.overduecorpus = overduecorpus;
    }

    public String getOverinterest() {
        return overinterest;
    }

    public void setOverinterest(String overinterest) {
        this.overinterest = overinterest;
    }

    public String getWyj() {
        return wyj;
    }

    public void setWyj(String wyj) {
        this.wyj = wyj;
    }

    public String getFxinterest() {
        return fxinterest;
    }

    public void setFxinterest(String fxinterest) {
        this.fxinterest = fxinterest;
    }

    public String getFuli() {
        return fuli;
    }

    public void setFuli(String fuli) {
        this.fuli = fuli;
    }

    public String getLoanperiod() {
        return loanperiod;
    }

    public void setLoanperiod(String loanperiod) {
        this.loanperiod = loanperiod;
    }

    public String getPaiedperiod() {
        return paiedperiod;
    }

    public void setPaiedperiod(String paiedperiod) {
        this.paiedperiod = paiedperiod;
    }

    public String getPaiedtotal() {
        return paiedtotal;
    }

    public void setPaiedtotal(String paiedtotal) {
        this.paiedtotal = paiedtotal;
    }

    public String getYongjinbili() {
        return yongjinbili;
    }

    public void setYongjinbili(String yongjinbili) {
        this.yongjinbili = yongjinbili;
    }

    public String getYongjin() {
        return yongjin;
    }

    public void setYongjin(String yongjin) {
        this.yongjin = yongjin;
    }

    public String getManagement() {
        return management;
    }

    public void setManagement(String management) {
        this.management = management;
    }

    public String getPoundage() {
        return poundage;
    }

    public void setPoundage(String poundage) {
        this.poundage = poundage;
    }

    public String getAssuretype() {
        return assuretype;
    }

    public void setAssuretype(String assuretype) {
        this.assuretype = assuretype;
    }

    public String getAssureprod() {
        return assureprod;
    }

    public void setAssureprod(String assureprod) {
        this.assureprod = assureprod;
    }

    public String getCaseremark() {
        return caseremark;
    }

    public void setCaseremark(String caseremark) {
        this.caseremark = caseremark;
    }

    public String getLastcontactname() {
        return lastcontactname;
    }

    public void setLastcontactname(String lastcontactname) {
        this.lastcontactname = lastcontactname;
    }

    public String getLastcontacttime() {
        return lastcontacttime;
    }

    public void setLastcontacttime(String lastcontacttime) {
        this.lastcontacttime = lastcontacttime;
    }

    public String getLastcontactresult() {
        return lastcontactresult;
    }

    public void setLastcontactresult(String lastcontactresult) {
        this.lastcontactresult = lastcontactresult;
    }

    public String getLastcontactcontent() {
        return lastcontactcontent;
    }

    public void setLastcontactcontent(String lastcontactcontent) {
        this.lastcontactcontent = lastcontactcontent;
    }

    public String getLastattitude() {
        return lastattitude;
    }

    public void setLastattitude(String lastattitude) {
        this.lastattitude = lastattitude;
    }

    public String getLastpaytype() {
        return lastpaytype;
    }

    public void setLastpaytype(String lastpaytype) {
        this.lastpaytype = lastpaytype;
    }

    public String getLastpromisemoney() {
        return lastpromisemoney;
    }

    public void setLastpromisemoney(String lastpromisemoney) {
        this.lastpromisemoney = lastpromisemoney;
    }

    public String getLastpaytime() {
        return lastpaytime;
    }

    public void setLastpaytime(String lastpaytime) {
        this.lastpaytime = lastpaytime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(String ownerid) {
        this.ownerid = ownerid;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getInputorgid() {
        return inputorgid;
    }

    public void setInputorgid(String inputorgid) {
        this.inputorgid = inputorgid;
    }

    public String getInputuserid() {
        return inputuserid;
    }

    public void setInputuserid(String inputuserid) {
        this.inputuserid = inputuserid;
    }

    public String getUnteldays() {
        return unteldays;
    }

    public void setUnteldays(String unteldays) {
        this.unteldays = unteldays;
    }

    public String getExitdays() {
        return exitdays;
    }

    public void setExitdays(String exitdays) {
        this.exitdays = exitdays;
    }

    public String getCaseholdid() {
        return caseholdid;
    }

    public void setCaseholdid(String caseholdid) {
        this.caseholdid = caseholdid;
    }

    public String getCsuserid() {
        return csuserid;
    }

    public void setCsuserid(String csuserid) {
        this.csuserid = csuserid;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    public String getAttribute11() {
        return attribute11;
    }

    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11;
    }

    public String getAttribute12() {
        return attribute12;
    }

    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12;
    }

    public String getAttribute13() {
        return attribute13;
    }

    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13;
    }

    public String getAttribute14() {
        return attribute14;
    }

    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14;
    }

    public String getAttribute15() {
        return attribute15;
    }

    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15;
    }

    public String getAttribute16() {
        return attribute16;
    }

    public void setAttribute16(String attribute16) {
        this.attribute16 = attribute16;
    }

    public String getAttribute17() {
        return attribute17;
    }

    public void setAttribute17(String attribute17) {
        this.attribute17 = attribute17;
    }

    public String getAttribute18() {
        return attribute18;
    }

    public void setAttribute18(String attribute18) {
        this.attribute18 = attribute18;
    }

    public String getAttribute19() {
        return attribute19;
    }

    public void setAttribute19(String attribute19) {
        this.attribute19 = attribute19;
    }

    public String getAttribute20() {
        return attribute20;
    }

    public void setAttribute20(String attribute20) {
        this.attribute20 = attribute20;
    }

    public String getCasestatus() {
        return casestatus;
    }

    public void setCasestatus(String casestatus) {
        this.casestatus = casestatus;
    }

    public String getBackbalance() {
        return backbalance;
    }

    public void setBackbalance(String backbalance) {
        this.backbalance = backbalance;
    }

    public String getOverdue() {
        return overdue;
    }

    public void setOverdue(String overdue) {
        this.overdue = overdue;
    }

    @Override
    protected Serializable pkVal() {
        return this.guid;
    }

    @Override
    public String toString() {
        return "CaseInfo{" +
        ", guid=" + guid +
        ", toporgid=" + toporgid +
        ", inputtime=" + inputtime +
        ", batchno=" + batchno +
        ", bankid=" + bankid +
        ", bankname=" + bankname +
        ", branch=" + branch +
        ", subBranch=" + subBranch +
        ", operatororg=" + operatororg +
        ", operattime=" + operattime +
        ", batchenddate=" + batchenddate +
        ", name=" + name +
        ", pinyin=" + pinyin +
        ", sex=" + sex +
        ", certno=" + certno +
        ", qq=" + qq +
        ", weixin=" + weixin +
        ", addr=" + addr +
        ", zipcode=" + zipcode +
        ", tel=" + tel +
        ", mobile=" + mobile +
        ", email=" + email +
        ", billaddr=" + billaddr +
        ", billzipcode=" + billzipcode +
        ", regaddr=" + regaddr +
        ", regzipcode=" + regzipcode +
        ", deptname=" + deptname +
        ", deptaddr=" + deptaddr +
        ", deptzipcode=" + deptzipcode +
        ", depttel=" + depttel +
        ", jobtitle=" + jobtitle +
        ", homeaddr=" + homeaddr +
        ", homezipcode=" + homezipcode +
        ", hometel=" + hometel +
        ", holderremark=" + holderremark +
        ", closedate=" + closedate +
        ", caseproperty=" + caseproperty +
        ", casetype=" + casetype +
        ", applyno=" + applyno +
        ", bussno=" + bussno +
        ", cardno=" + cardno +
        ", openDate=" + openDate +
        ", credit=" + credit +
        ", billdate=" + billdate +
        ", expire=" + expire +
        ", balance=" + balance +
        ", lastpaydate=" + lastpaydate +
        ", lastpaysum=" + lastpaysum +
        ", level=" + level +
        ", prod=" + prod +
        ", loandate=" + loandate +
        ", loanterm=" + loanterm +
        ", overduedate=" + overduedate +
        ", overduedays=" + overduedays +
        ", overdueperiod=" + overdueperiod +
        ", overduebeginperiod=" + overduebeginperiod +
        ", putoutsum=" + putoutsum +
        ", perbacksum=" + perbacksum +
        ", bussnesssum=" + bussnesssum +
        ", overduecorpus=" + overduecorpus +
        ", overinterest=" + overinterest +
        ", wyj=" + wyj +
        ", fxinterest=" + fxinterest +
        ", fuli=" + fuli +
        ", loanperiod=" + loanperiod +
        ", paiedperiod=" + paiedperiod +
        ", paiedtotal=" + paiedtotal +
        ", yongjinbili=" + yongjinbili +
        ", yongjin=" + yongjin +
        ", management=" + management +
        ", poundage=" + poundage +
        ", assuretype=" + assuretype +
        ", assureprod=" + assureprod +
        ", caseremark=" + caseremark +
        ", lastcontactname=" + lastcontactname +
        ", lastcontacttime=" + lastcontacttime +
        ", lastcontactresult=" + lastcontactresult +
        ", lastcontactcontent=" + lastcontactcontent +
        ", lastattitude=" + lastattitude +
        ", lastpaytype=" + lastpaytype +
        ", lastpromisemoney=" + lastpromisemoney +
        ", lastpaytime=" + lastpaytime +
        ", status=" + status +
        ", ownerid=" + ownerid +
        ", note=" + note +
        ", inputorgid=" + inputorgid +
        ", inputuserid=" + inputuserid +
        ", unteldays=" + unteldays +
        ", exitdays=" + exitdays +
        ", caseholdid=" + caseholdid +
        ", csuserid=" + csuserid +
        ", orgid=" + orgid +
        ", attribute1=" + attribute1 +
        ", attribute2=" + attribute2 +
        ", attribute3=" + attribute3 +
        ", attribute4=" + attribute4 +
        ", attribute5=" + attribute5 +
        ", attribute6=" + attribute6 +
        ", attribute7=" + attribute7 +
        ", attribute8=" + attribute8 +
        ", attribute9=" + attribute9 +
        ", attribute10=" + attribute10 +
        ", attribute11=" + attribute11 +
        ", attribute12=" + attribute12 +
        ", attribute13=" + attribute13 +
        ", attribute14=" + attribute14 +
        ", attribute15=" + attribute15 +
        ", attribute16=" + attribute16 +
        ", attribute17=" + attribute17 +
        ", attribute18=" + attribute18 +
        ", attribute19=" + attribute19 +
        ", attribute20=" + attribute20 +
        ", casestatus=" + casestatus +
        ", backbalance=" + backbalance +
        ", overdue=" + overdue +
        "}";
    }
}
