package com.github.pig.admin.controller;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pig.admin.common.util.Tool;
import com.github.pig.admin.model.dto.CaseDTO;
import com.github.pig.common.util.Query;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.common.util.R;
import com.github.pig.admin.model.entity.CaseInfo;
import com.github.pig.admin.service.ICaseInfoService;
import com.github.pig.common.web.BaseController;

import java.util.Map;

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


//    @GetMapping("/{id}")
//    public R<CaseInfo> get(@PathVariable String id) {
//        CaseInfo caseInfo = caseInfoService.selectById(id);
//        return new R<>(caseInfo);
//    }
    /**
     * 通过ID查询
     *
     * @param id
     * @return CaseInfo
     */
    @GetMapping("/{id}")
    public R<CaseDTO> get(@PathVariable String id){
        CaseDTO caseDTO = caseInfoService.selectCaseDTO(id);
        return new R<>(caseDTO);
    }


//    /**
//    * 根据银行名字查询信息
//    *
//    * @param params 分页对象
//    * @return 分页对象
//    */
//    @RequestMapping("/pageByBankName")
//    public Page pageByBankName(@RequestParam Map<String, Object> params, String name) {
//        params.remove("name");
//        EntityWrapper<CaseInfo> wrapper = new EntityWrapper<>();
//        if(!StringUtils.isBlank(name)){
//            wrapper.like("bankname",name);
//        }
//        return caseInfoService.selectPage(new Query<>(params), wrapper);
//    }

    /**
     * 分页查询信息
     * @param page  页数
     * @param limit 最大记录数
     * @param key   关键词
     * @return
     */
    @RequestMapping("/page")
    public Page<CaseInfo> page(int page, int limit,String key,String bankname){
        if(StringUtils.isBlank(key)){
            return caseInfoService.selectPageNoKey(page,limit,this.getUserId(),bankname);
        }
        return  caseInfoService.selectPageByKey(page,limit,key,this.getUserId(),bankname);
    }

    /**
     * 根据名字字段分页查询信息
     * @param page
     * @param limit
     * @param name
     * @return
     */
    @RequestMapping("/pageByName")
    public Page<CaseInfo> pageByName(int page, int limit, String name){
        return caseInfoService.selectPageByName(page,limit,name,this.getUserId());
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
