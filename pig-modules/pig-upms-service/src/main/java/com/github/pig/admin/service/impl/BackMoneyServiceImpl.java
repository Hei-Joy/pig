package com.github.pig.admin.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pig.admin.mapper.BackMoneyMapper;
import com.github.pig.admin.model.entity.BackMoney;
import com.github.pig.admin.model.entity.CaseInfo;
import com.github.pig.admin.service.BackMoneyService;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BackMoneyServiceImpl extends ServiceImpl<BackMoneyMapper, BackMoney> implements BackMoneyService {
    @Autowired
    BackMoneyMapper backMoneyMapper;
    @Override
    public List<BackMoney> selectByCard(String cord) {
        return backMoneyMapper.selectByCard(cord);
    }

    @Override
    public Page<CaseInfo> selectPageNoKey(int page, int limit, String bankname, String batchno, String ownerid) {
        int current = (page - 1) * limit;
        Page<CaseInfo> pages = this.buildPage(page,limit);
        pages.setTotal(backMoneyMapper.selectCountNoKey( bankname,batchno,ownerid));
        pages.setRecords(backMoneyMapper.selectPageNoKey(current,limit, bankname,batchno,ownerid));
        pages.getPages();
        System.out.println(pages);
        System.out.println(pages.getRecords());
        return pages;
    }

    @Override
    public Page<CaseInfo> selectPage(int page, int limit, String bankname, String batchno, String ownerid) {
        int current = (page - 1) * limit;
        Page<CaseInfo> pages = this.buildPage(page,limit);
        pages.setTotal(backMoneyMapper.selectSum(bankname,batchno,ownerid));
        pages.setRecords(backMoneyMapper.selectPage(current,limit, bankname,batchno,ownerid));
        pages.getPages();
        System.out.println(pages);
        System.out.println(pages.getRecords());
        return pages;
    }

    @Override
    public Page<BackMoney> getBackMoneyById(int page, int limit, String cardno) {
        Page<BackMoney> pages = new Page<>(page,limit);
        pages.setTotal(baseMapper.selectBackMoneyByIdCount(cardno));
        pages.setRecords(backMoneyMapper.selectBackMoneyById(page, limit, cardno));
        return pages;
    }


    @Override
    public Page<CaseInfo> selectPageByKey(int page, int limit, String key, String bankname, String batchno, String ownerid) {
        int current = (page -1) * limit;
        Page<CaseInfo> pages = this.buildPage(page,limit);
        pages.setTotal(backMoneyMapper.selectCount(key,bankname,batchno,ownerid));//设置符合条件的所有记录
        pages.setRecords(backMoneyMapper.selectPageByKey(current,limit,key ,bankname,batchno,ownerid));
        pages.getPages();//设置最大页数
        return pages;
    }

    private Page<CaseInfo> buildPage(int page ,int limit){
        Page<CaseInfo> pages = new Page<>();
        pages.setCurrent(page);
        pages.setSize(limit);//设置获取最大记录数
        return pages;
    }
}
