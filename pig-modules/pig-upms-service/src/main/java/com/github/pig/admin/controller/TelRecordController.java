package com.github.pig.admin.controller;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.admin.common.util.Tool;
import com.github.pig.admin.model.entity.CaseInfo;
import com.github.pig.admin.model.entity.SysUser;
import com.github.pig.admin.model.entity.TelRecord;
import com.github.pig.admin.service.ICaseInfoService;
import com.github.pig.admin.service.TelRecordService;
import com.github.pig.common.util.R;
import com.github.pig.common.util.UserUtils;
import com.github.pig.common.web.BaseController;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
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
    public Page pageByCid(Integer page, Integer limit, String cid,String sort){
        return telRecordService.selectPageByCid(page.intValue(),limit.intValue(),cid,sort);
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

}
