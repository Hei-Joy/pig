package com.github.pig.admin.model.entity;

import lombok.Data;

@Data
public class TelRecord {
    private String guid;

    private String toporgid;

    private String inputuserid;

    private String inputorgid;

    private String inputtime;//添加记录时间

    private String cid;

    private String teltime;//记录时间

    private String cname;

    private String telno;

    private String result;

    private String promisemoney;

    private String paytime;

    private String nexttime;

    private String content;

    private String attitude;

    private String paytype;

    private String cellphone;

    private String display;
}
