package com.github.pig.admin.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.admin.model.entity.BackMoney;
import com.github.pig.admin.model.entity.CaseInfo;
import com.github.pig.admin.service.BackMoneyService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/backMoney")
public class BackMoneyController {
    @Autowired
    private BackMoneyService backMoneyService;
    @RequestMapping("/{cord}")
    public List<BackMoney> get(@PathVariable String cord){
        return backMoneyService.selectByCard(cord);
    }

    @RequestMapping("/page")
    public Page<CaseInfo> page(int page, int limit, String key, String bankname, String batchno, String ownerid){
        if(StringUtils.isBlank(key)){

            return backMoneyService.selectPage(page,limit,bankname,batchno,ownerid);
                    }
            return  backMoneyService.selectPageByKey(page,limit,key,bankname,batchno,ownerid);
    }
}