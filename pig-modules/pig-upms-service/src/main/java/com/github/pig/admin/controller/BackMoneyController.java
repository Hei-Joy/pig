package com.github.pig.admin.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.admin.model.entity.BackMoney;
import com.github.pig.admin.model.entity.CaseInfo;
import com.github.pig.admin.service.BackMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    public Page<CaseInfo> page(int page, int limit,String key, String batchno, String ownerid,String frontTime,String rearTime){
        //if(StringUtils.isBlank(bankname)){

            return backMoneyService.selectPage(page,limit,key,batchno,ownerid,frontTime,rearTime);
//                    }
//            return  backMoneyService.selectPageByKey(page,limit,key,bankname,batchno,ownerid);
    }

    @GetMapping("/getBackMoneyById")
    public Page<BackMoney> getBackMoneyById(int page, int limit, String cardno){
        return backMoneyService.getBackMoneyById(page, limit, cardno);
    }



}