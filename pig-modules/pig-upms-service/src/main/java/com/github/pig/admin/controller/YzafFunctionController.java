package com.github.pig.admin.controller;
import java.util.Map;
import java.util.Date;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pig.admin.common.util.Tool;
import com.github.pig.admin.model.entity.YzafIpa;
import com.github.pig.admin.service.IYzafIpaService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.github.pig.common.constant.CommonConstant;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.common.util.Query;
import com.github.pig.common.util.R;
import com.github.pig.admin.model.entity.YzafFunction;
import com.github.pig.admin.service.IYzafFunctionService;
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
@RequestMapping("/yzafFunction")
public class YzafFunctionController extends BaseController {
    @Autowired private IYzafFunctionService yzafFunctionService;
    @Autowired private IYzafIpaService yzafIpaService;
    /**
    * 通过ID查询
    *
    * @param id ID
    * @return YzafFunction
    */
    @GetMapping("/{id}")
    public R<YzafFunction> get(@PathVariable Integer id) {
        return new R<>(yzafFunctionService.selectById(id));
    }


    /**
    * 分页查询信息
    *
    * @param params 分页对象
    * @return 分页对象
    */
    @RequestMapping("/page")
    public Page page(@RequestParam Map<String, Object> params) {
        params.put(CommonConstant.DEL_FLAG, CommonConstant.STATUS_NORMAL);
        return yzafFunctionService.selectPage(new Query<>(params), new EntityWrapper<>());
    }

    @RequestMapping("/newpage")
    public Page newpage(@RequestParam Map<String, Object> params) {
        //params.put(CommonConstant.DEL_FLAG, CommonConstant.STATUS_NORMAL);
        return yzafFunctionService.selectPage(new Query<>(params), new EntityWrapper<>());
    }

    /**
     * 添加
     * @param  yzafFunction  实体
     * @return success/false
     */
    @PostMapping
    public R<Boolean> add(@RequestBody YzafFunction yzafFunction) {
        yzafFunction.setId(Tool.getUUid());
        yzafFunction.setDelFlag(CommonConstant.STATUS_NORMAL);

        //查询出接口
        EntityWrapper<YzafIpa> wrapper = new EntityWrapper<YzafIpa>();
        wrapper.where("ipa_Name={0}",yzafFunction.getIpaId());

        YzafIpa yzafIpa = yzafIpaService.selectOne(wrapper);

        String functionName = yzafIpa.getFunctionId();
        if(StringUtils.isNotEmpty(functionName)){
            //如果不包含就新增
            if (!StringUtils.contains(functionName,yzafFunction.getFunctionName())){
                yzafIpa.setFunctionId(yzafFunction.getFunctionName()+","+functionName);
                yzafIpaService.updateById(yzafIpa);
            }
        }else {
            yzafIpa.setFunctionId(yzafFunction.getFunctionName());
            yzafIpaService.updateById(yzafIpa);
        }
        return new R<>(yzafFunctionService.insert(yzafFunction));
    }

    /**
     * 删除
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    public R<Boolean> delete(@PathVariable String id) {
        YzafFunction yzafFunction = new YzafFunction();
        yzafFunction.setId(id);
        yzafFunction.setDelFlag(CommonConstant.STATUS_DEL);
        return new R<>(yzafFunctionService.updateById(yzafFunction));
    }

    /**
     * 编辑
     * @param  yzafFunction  实体
     * @return success/false
     */
    @PutMapping
    public R<Boolean> edit(@RequestBody YzafFunction yzafFunction) {
        return new R<>(yzafFunctionService.updateById(yzafFunction));
    }
}
