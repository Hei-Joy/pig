package com.github.pig.admin.model.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WriteCaseInfo extends BaseRowModel {
    @ExcelProperty(value = "类别", index = 0)
    private String BATCHNOTYPE;

    @ExcelProperty(value = "姓名", index = 1)
    private String NAME;

    @ExcelProperty(value = "批次", index = 2)
    private String CLOSEDATE;

    @ExcelProperty(value = "银行", index = 3)
    private String BANKNAME;

    @ExcelProperty(value = "卡号", index = 4)
    private String CARDNO;

    @ExcelProperty(value = "身份证", index = 5)
    private String CERTNO;

    @ExcelProperty(value = "家庭地址", index = 6)
    private String HOMEADDR;

    @ExcelProperty(value = "欠款", index = 7)
    private String ATTRIBUTE14;

    @ExcelProperty(value = "移动电话", index = 8)
    private String MOBILE;

    @ExcelProperty(value = "催收员", index = 9)
    private String OWNERID;
}

