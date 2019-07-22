package com.github.pig.admin.controller;
import java.util.Map;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.github.pig.common.constant.CommonConstant;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.common.util.Query;
import com.github.pig.common.util.R;
import com.github.pig.admin.model.entity.YzafIpa;
import com.github.pig.admin.service.IYzafIpaService;
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
@RequestMapping("/yzafIpa")
public class YzafIpaController extends BaseController {
    @Autowired private IYzafIpaService yzafIpaService;

    /**
    * 通过ID查询
    *
    * @param id ID
    * @return YzafIpa
    */
    @GetMapping("/{id}")
    public R<YzafIpa> get(@PathVariable Integer id) {
        return new R<>(yzafIpaService.selectById(id));
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
        return yzafIpaService.selectPage(new Query<>(params), new EntityWrapper<>());
    }

    /**
     * 分页查询信息
     *
     * @param params 分页对象
     * @return 分页对象
     */
    @RequestMapping("/newpage")
    public Page newpage(@RequestParam Map<String, Object> params) {
        params.put(CommonConstant.DEL_FLAG, CommonConstant.STATUS_NORMAL);
        return yzafIpaService.selectPage(new Query<>(params), new EntityWrapper<>());
    }

    /**
     * 添加
     * @param  yzafIpa  实体
     * @return success/false
     */
    @PostMapping
    public R<Boolean> add(@RequestBody YzafIpa yzafIpa) {
        yzafIpa.setDelFlag(CommonConstant.STATUS_NORMAL);
        yzafIpa.setStatus("新增");
        return new R<>(yzafIpaService.insert(yzafIpa));
    }

    /**
     * 删除
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    public R<Boolean> delete(@PathVariable String id) {
        YzafIpa yzafIpa = new YzafIpa();
        yzafIpa.setId(id);
        yzafIpa.setDelFlag(CommonConstant.STATUS_DEL);
        yzafIpa.setUpdateTime(new Date());
        yzafIpa.setStatus("删除");
        return new R<>(yzafIpaService.updateById(yzafIpa));
    }

    /**
     * 编辑
     * @param  yzafIpa  实体
     * @return success/false
     */
    @PutMapping
    public R<Boolean> edit(@RequestBody YzafIpa yzafIpa) {
        yzafIpa.setStatus("修改");
        return new R<>(yzafIpaService.updateById(yzafIpa));
    }
}
