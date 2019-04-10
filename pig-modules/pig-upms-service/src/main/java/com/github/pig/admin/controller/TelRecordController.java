package com.github.pig.admin.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.admin.common.util.Tool;
import com.github.pig.admin.model.entity.TelRecord;
import com.github.pig.admin.service.TelRecordService;
import com.github.pig.common.util.Query;
import com.github.pig.common.util.R;
import com.github.pig.common.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 通话记录
 */
@RestController
@RequestMapping("/telRecord")
public class TelRecordController extends BaseController {
    @Autowired private TelRecordService telRecordService;

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
     * @param params
     * @param cid
     * @return
     */
    @GetMapping("/page")
    public Page pageByCid(Map<String,Object> params,String cid){
        EntityWrapper<TelRecord> wrapper = new EntityWrapper<>();
        wrapper.eq("cid",cid);
        return telRecordService.selectPage(new Query<>(params),wrapper);
    }

    /**
     * 添加
     * @param telRecord
     * @return
     */
    @PostMapping("/insert")
    public R<Boolean> add(TelRecord telRecord){
        telRecord.setGuid(Tool.getUUid());//设置主键
        telRecord.setInputtime(Tool.getDate());//设置时间
        System.out.println("---------------------" + telRecordService.insert(telRecord));
        return new R<>(Boolean.TRUE);
    }

}
