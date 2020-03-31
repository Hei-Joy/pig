package com.github.pig.admin.controller;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.admin.common.util.Tool;
import com.github.pig.admin.model.entity.CaseInfo;
import com.github.pig.admin.model.entity.SysUser;
import com.github.pig.admin.model.entity.TelRecord;
import com.github.pig.admin.model.entity.WriteTelRecord;
import com.github.pig.admin.service.ICaseInfoService;
import com.github.pig.admin.service.TelRecordService;
import com.github.pig.common.util.R;
import com.github.pig.common.util.UserUtils;
import com.github.pig.common.web.BaseController;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

/**
 * 通话记录
 */
@RestController
@RequestMapping("/telRecord")
public class TelRecordController extends BaseController {
    @Autowired private TelRecordService telRecordService;
    @Autowired private ICaseInfoService caseInfoService;
    /**
     * 通过案件id查询通话记录
     * @param cid
     * @return
     */
    @GetMapping("/{cid}")
    public List<TelRecord> get(@PathVariable String cid){
        return telRecordService.selectByCid(cid);
    }

    /**
     * 分页条件查询 查询条件为cid 案件主键
     * @param
     * @param cid
     * @return
     */
    @GetMapping("/page")
    public Page pageByCid(Integer page, Integer limit, String cid,String sort,String Key,String frontTime,String rearTime){
        return telRecordService.selectPageByCid(page.intValue(),limit.intValue(),cid,sort,Key,frontTime,rearTime);
    }


    /**
     * 添加
     * @param telRecord
     * @return
     */
    @PostMapping("/insert")
    public R<Boolean> add(@RequestBody TelRecord telRecord){
       //保存备注

        String cid = telRecord.getCid();
        CaseInfo caseInfo = caseInfoService.selectById(cid);

        caseInfo.setAttribute1(telRecord.getAttitude());
        caseInfo.setOverdue("0");
        System.out.println(caseInfo);
        caseInfoService.updateById(caseInfo);
        telRecord.setGuid(Tool.getUUid());//设置主键

        //设置时间
		telRecord.setInputtime(Tool.getDate());
        telRecord.setInputuserid(UserUtils.getUser());
        return new R<>(telRecordService.insert(telRecord));
    }

    /**
     * 删除用户信息
     *
     * @param id ID
     * @return R
     */
    @PostMapping("/{id}")
    public R<Boolean> userDel(@PathVariable Serializable id) {
        return new R<>(telRecordService.deleteById(id));
    }

    /**
     * 导出EXCEL
     * @param response
     * @param frontTime
     * @param rearTime
     * @throws Exception
     */
    @GetMapping("/write")
    public void writeExcel1(HttpServletResponse response, String cid, String key,String frontTime,String rearTime) throws Exception {
        String path="催收信息表";

        OutputStream out = response.getOutputStream();
        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);


        // 写仅有一个 Sheet 的 Excel 文件, 此场景较为通用
        Sheet sheet1 = new Sheet(1, 0, WriteTelRecord.class);

        // 第一个 sheet 名称
        sheet1.setSheetName(cid);

        // 写数据到 Writer 上下文中
        // 入参1: 创建要写入的模型数据
        // 入参2: 要写入的目标 sheet
        writer.write(telRecordService.writeQuery(cid,key,frontTime,rearTime), sheet1);

        // 将上下文中的最终 outputStream 写入到指定文件中
        writer.finish();

        response.setContentType("multipart/form-data");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename="+ URLEncoder.encode(path,"UTF-8")+".xlsx");
        out.flush();
    }
}
