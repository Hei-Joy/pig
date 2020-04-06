package com.github.pig.admin.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class ExcelData implements Serializable {

    private static final long serialVersionUID = 4454016249210520899L;

    /**
     * 表头
     */
    private List<String> titles;

    /**
     * 数据
     */
    private List<List<Object>> rows;

    /**
     * 页签名称
     */
    private String name;

}
