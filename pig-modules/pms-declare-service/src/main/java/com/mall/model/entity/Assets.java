package com.mall.model.entity;

import lombok.Data;

@Data
public class Assets {
    private String id;

    private String name;

    private Integer tbValue;

    private String tbType;

    private Boolean tbStatic;

    private String rootid;
}