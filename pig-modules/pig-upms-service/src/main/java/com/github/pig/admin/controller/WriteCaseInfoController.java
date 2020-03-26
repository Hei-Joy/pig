package com.github.pig.admin.controller;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.github.pig.admin.model.entity.WriteCaseInfo;
import com.github.pig.admin.service.WriteeCaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

@RestController
@RequestMapping("/caseInfo")
public class WriteCaseInfoController {
    @Autowired
    private WriteeCaseInfoService writeeCaseInfoService;

    @PostMapping("/write")
    public void writeExcel1(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String path="借款人员信息表.xlsx";

        /*response.setContentType("application/vnd.ms-excel; charset=utf-8");//自定义路径
        response.setHeader("Content-disposition", "attachment;filename="+new String((path).getBytes(), "iso-8859-1"));
        OutputStream out=null;
        out = response.getOutputStream();*/

        ExcelWriter writer=null;

        FileOutputStream sout = null;//导出到桌面
        FileSystemView fsv = FileSystemView.getFileSystemView();
        File com=fsv.getHomeDirectory(); //这便是读取桌面路径的方法了

        sout=new FileOutputStream(com.getPath()+"\\"+ path);
        OutputStream out = sout;
        writer = EasyExcelFactory.getWriter(out);

        // 文件输出位置
        //OutputStream out = new FileOutputStream("D:/借款信息表.xlsx");

        //ExcelWriter writer = EasyExcelFactory.getWriter(out);

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
