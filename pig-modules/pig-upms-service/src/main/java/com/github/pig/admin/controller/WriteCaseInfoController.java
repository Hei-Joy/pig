package com.github.pig.admin.controller;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.github.pig.admin.model.entity.WriteCaseInfo;
import com.github.pig.admin.service.WriteeCaseInfoService;
import com.github.pig.admin.test.WriteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/caseInfo")
public class WriteCaseInfoController {
    @Autowired
    private WriteeCaseInfoService writeeCaseInfoService;

    @PostMapping("/Write")
    public void writeExcel1() throws Exception {
        // 文件输出位置
        OutputStream out = new FileOutputStream("D:/test.xlsx");

        ExcelWriter writer = EasyExcelFactory.getWriter(out);

        // 写仅有一个 Sheet 的 Excel 文件, 此场景较为通用
        Sheet sheet1 = new Sheet(1, 0, WriteCaseInfo.class);

        // 第一个 sheet 名称
        sheet1.setSheetName("第一个sheet");

        // 写数据到 Writer 上下文中
        // 入参1: 创建要写入的模型数据
        // 入参2: 要写入的目标 sheet
        writer.write(createModelList(), sheet1);

        // 将上下文中的最终 outputStream 写入到指定文件中
        writer.finish();

        // 关闭流
        out.close();
    }

    private List<WriteCaseInfo> createModelList() {
        List<WriteCaseInfo> WriteCaseInfo = writeeCaseInfoService.WriteQuery();
        return WriteCaseInfo;
    }
}
