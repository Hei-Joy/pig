package com.github.pig.admin.model.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

@Data
public class CaseContacts {
    @TableId(value = "GUID",type = IdType.ID_WORKER_STR)
    private String guid;

    private String toporgid;

    private String inputuserid;

    private String inputorgid;

    private String inputtime;

    private String cid;

    private String idno;

    private String name;

    private String deptname;

    private String relation;

    private String tel;

    private String cellphone;

    private String address;

    private String postcode;

    private String email;

    private String remark;
}