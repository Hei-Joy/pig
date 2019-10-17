package com.github.pig.admin.controller;
import java.util.Map;
import java.util.Date;
import java.util.UUID;

import com.github.pig.admin.common.util.Tool;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.github.pig.common.constant.CommonConstant;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.common.util.Query;
import com.github.pig.common.util.R;
import com.github.pig.admin.model.entity.CaseBatch;;
import com.github.pig.admin.service.ICaseBatchService;
import com.github.pig.common.web.BaseController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sudan
 * @since 2019-05-23
 */
@RestController
@RequestMapping("/caseBatch")
public class CaseBatchController extends BaseController {
    @Autowired private ICaseBatchService caseBatchService;

    /**
    * 通过ID查询
    *
    * @param id ID
    * @return CaseBatch
    */
    @GetMapping("/{id}")
    public R<CaseBatch> get(@PathVariable String id) {
        return new R<>(caseBatchService.selectById(id));
    }


    /**
    * 分页查询信息
    *
    * @param params 分页对象
    * @return 分页对象
    */
    @RequestMapping("/page")
    public Page page(@RequestParam Map<String, Object> params) {

        return caseBatchService.selectPage(new Query<>(params), new EntityWrapper<>());
    }

    /**
     * 添加
     * @param  caseBatch  实体
     * @return success/false
     */
    @PostMapping
    public R<Boolean> add(@RequestBody CaseBatch caseBatch) {
       // caseBatch.setGuid(Tool.getUUid());
        return new R<>(caseBatchService.insert(caseBatch));
    }

    /**
     * 删除
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    public R<Boolean> delete(@PathVariable String id) {

        return new R<>(caseBatchService.deleteById(id));
    }

    /**
     * 编辑
     * @param  caseBatch  实体
     * @return success/false
     */
    @PutMapping
    public R<Boolean> edit(@RequestBody CaseBatch caseBatch) {
      //  caseBatch.setUpdateTime(new Date());
        return new R<>(caseBatchService.updateById(caseBatch));
    }
}
