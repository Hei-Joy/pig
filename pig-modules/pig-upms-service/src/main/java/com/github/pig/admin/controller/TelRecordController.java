package com.github.pig.admin.controller;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.admin.common.util.Tool;
import com.github.pig.admin.model.entity.TelRecord;
import com.github.pig.admin.service.TelRecordService;
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
     * @param
     * @param cid
     * @return
     */
    @GetMapping("/page")
    public Page pageByCid(Integer page, Integer limit, String cid){
        return telRecordService.selectPageByCid(page.intValue(),limit.intValue(),cid);
    }

    /**
     * 添加
     * @param telRecord
     * @return
     */
    @PostMapping("/insert")
    public R<Boolean> add(@RequestBody TelRecord telRecord){
        telRecord.setGuid(Tool.getUUid());//设置主键
        telRecord.setInputtime(Tool.getDate());//设置时间
        return new R<>(telRecordService.insert(telRecord));
    }

}
