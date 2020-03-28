package com.github.pig.admin.controller;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.github.pig.admin.model.entity.WriteCaseInfo;
import com.github.pig.admin.service.WriteeCaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.net.URLEncoder;


@RestController
@RequestMapping("/caseInfo")
public class WriteCaseInfoController {
    @Autowired
    private WriteeCaseInfoService writeeCaseInfoService;


    @GetMapping("/write")
    public void writeExcel1(HttpServletResponse response,String bankname,String name,String batchno,String ownerid,String batchnotype,String certno) throws Exception {
        String path="借款人员信息表";

        OutputStream out = response.getOutputStream();
        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);


        // 写仅有一个 Sheet 的 Excel 文件, 此场景较为通用
        Sheet sheet1 = new Sheet(1, 0, WriteCaseInfo.class);

        // 第一个 sheet 名称
        sheet1.setSheetName(bankname);

        // 写数据到 Writer 上下文中
        // 入参1: 创建要写入的模型数据
        // 入参2: 要写入的目标 sheet
        writer.write(writeeCaseInfoService.WriteQuery(bankname,name,batchno,ownerid,batchnotype,certno), sheet1);

        // 将上下文中的最终 outputStream 写入到指定文件中
        writer.finish();

        response.setContentType("multipart/form-data");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename="+ URLEncoder.encode(path,"UTF-8")+".xlsx");
        out.flush();
    }

}
