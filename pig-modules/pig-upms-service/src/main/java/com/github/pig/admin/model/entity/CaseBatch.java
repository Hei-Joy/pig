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
 * @author sudan
 * @since 2019-05-23
 */
@TableName("case_batch")
public class CaseBatch extends Model<CaseBatch> {

    private static final long serialVersionUID = 1L;

    @TableId("GUID")
    private String guid;
    @TableField("TOPORGID")
    private String toporgid;
    @TableField("INPUTUSERID")
    private String inputuserid;
    @TableField("INPUTTIME")
    private String inputtime;
    @TableField("BATCHNO")
    private String batchno;
    @TableField("REMARK")
    private String remark;
    @TableField("BANKID")
    private String bankid;
    @TableField("BANKNAME")
    private String bankname;
    @TableField("SUM")
    private String sum;
    @TableField("COUNT")
    private String count;
    @TableField("PERCENT")
    private String percent;
    @TableField("CLOSETIME")
    private String closetime;
    @TableField("INPUTORGID")
    private String inputorgid;
    @TableField("CLOSEUSERID")
    private String closeuserid;
    @TableField("FINISHDATE")
    private String finishdate;
    @TableField("CASETYPE")
    private String casetype;
    @TableField("STATUS")
    private String status;
    /**
     * 生成错误日志时记录错误Excel路径
     */
    @TableField("FILEPATH")
    private String filepath;


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

    public String getInputuserid() {
        return inputuserid;
    }

    public void setInputuserid(String inputuserid) {
        this.inputuserid = inputuserid;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getClosetime() {
        return closetime;
    }

    public void setClosetime(String closetime) {
        this.closetime = closetime;
    }

    public String getInputorgid() {
        return inputorgid;
    }

    public void setInputorgid(String inputorgid) {
        this.inputorgid = inputorgid;
    }

    public String getCloseuserid() {
        return closeuserid;
    }

    public void setCloseuserid(String closeuserid) {
        this.closeuserid = closeuserid;
    }

    public String getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(String finishdate) {
        this.finishdate = finishdate;
    }

    public String getCasetype() {
        return casetype;
    }

    public void setCasetype(String casetype) {
        this.casetype = casetype;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    @Override
    protected Serializable pkVal() {
        return this.guid;
    }

    @Override
    public String toString() {
        return "CaseBatch{" +
        ", guid=" + guid +
        ", toporgid=" + toporgid +
        ", inputuserid=" + inputuserid +
        ", inputtime=" + inputtime +
        ", batchno=" + batchno +
        ", remark=" + remark +
        ", bankid=" + bankid +
        ", bankname=" + bankname +
        ", sum=" + sum +
        ", count=" + count +
        ", percent=" + percent +
        ", closetime=" + closetime +
        ", inputorgid=" + inputorgid +
        ", closeuserid=" + closeuserid +
        ", finishdate=" + finishdate +
        ", casetype=" + casetype +
        ", status=" + status +
        ", filepath=" + filepath +
        "}";
    }
}
