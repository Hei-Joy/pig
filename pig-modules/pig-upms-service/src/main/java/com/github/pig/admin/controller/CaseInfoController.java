package com.github.pig.admin.controller;
import java.util.Map;

import com.baomidou.mybatisplus.enums.SqlLike;
import com.github.pig.admin.common.util.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.github.pig.common.constant.CommonConstant;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.common.util.Query;
import com.github.pig.common.util.R;
import com.github.pig.admin.model.entity.CaseInfo;
import com.github.pig.admin.service.ICaseInfoService;
import com.github.pig.common.web.BaseController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lengleng
 * @since 2019-03-28
 */
@RestController
@RequestMapping("/caseInfo")
public class CaseInfoController extends BaseController {
    @Autowired private ICaseInfoService caseInfoService;

    /**
    * 通过ID查询
    *
    * @param id
    * @return CaseInfo
    */
    @GetMapping("/{id}")
    public R<CaseInfo> get(@PathVariable String id) {
        return new R<>(caseInfoService.selectById(id));
    }


    /**
    * 分页查询信息
    *
    * @param params 分页对象
    * @return 分页对象
    */
    @RequestMapping("/page")
    public Page page(@RequestParam Map<String, Object> params,String name) {
        params.remove("name");
        EntityWrapper<CaseInfo> wrapper = new EntityWrapper<>();
        if(null != name){
            wrapper.like("name",name);
        }
        return caseInfoService.selectPage(new Query<>(params), wrapper);
    }

    /**
     * 添加
     * @param  caseInfo  实体
     * @return success/false
     */
    @PostMapping("/add")
    public R<Boolean> add(@RequestBody CaseInfo caseInfo) {
        caseInfo.setGuid(Tool.getUUid());//设置主键id
        caseInfo.setInputtime(Tool.getDate());//设置存入日期
        return new R<>(caseInfoService.inserCaseInfo(caseInfo));
    }

    /**
     * 删除
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    public R<Boolean> delete(@PathVariable String id) {
        CaseInfo caseInfo = new CaseInfo();

        caseInfo.setGuid(id);
       // caseInfo.setUpdateTime(new Date());
        //caseInfo.setDelFlag(CommonConstant.STATUS_DEL);
        return new R<>(caseInfoService.updateById(caseInfo));
    }

    /**
     * 编辑
     * @param  caseInfo  实体
     * @return success/false
     */
    @PutMapping
    public R<Boolean> edit(@RequestBody CaseInfo caseInfo) {
       // caseInfo.setUpdateTime(new Date());
        return new R<>(caseInfoService.updateById(caseInfo));
    }
}
