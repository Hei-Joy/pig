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
public class WriteTelRecord extends BaseRowModel {
    @ExcelProperty(value = "姓名", index = 0)
    private String CNAME;

    @ExcelProperty(value = "通话号码", index = 1)
    private String CELLPHONE;

    @ExcelProperty(value = "记录时间", index = 2)
    private String INPUTTIME;

    @ExcelProperty(value = "通话记录", index = 3)
    private String CONTENT;

    @ExcelProperty(value = "操作员", index = 4)
    private String INPUTUSERID;
}
