package com.github.pig.admin.controller;

import com.github.pig.admin.model.entity.BackMoney;
import com.github.pig.admin.service.BackMoneyService;
import com.github.pig.common.util.R;
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
}
