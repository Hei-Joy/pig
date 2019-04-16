package com.github.pig.admin.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.admin.model.entity.CaseContacts;
import com.github.pig.admin.service.CaseContactsService;
import com.github.pig.common.util.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 联系人前端控制器
 */
@RestController
@RequestMapping("/admin/caseContacts")
public class CaseContactsController {
    @Autowired
    CaseContactsService caseContactsService;


    /**
     * 分页查询联系人
     * 根据cid查询
     * @return
     */
    @RequestMapping("/page")
    public Page page(@RequestParam Map<String,Object> params,String cid){
        params.remove("cid");
        EntityWrapper<CaseContacts> wrapper = new EntityWrapper<>();
        wrapper.eq("cid",cid);
        return caseContactsService.selectPage(new Query<>(params),wrapper);
    }

}
