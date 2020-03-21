package com.github.pig.admin.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.github.pig.admin.model.entity.BackMoney;
import com.github.pig.admin.model.entity.CaseInfo;

import java.util.List;

public interface BackMoneyService extends IService<BackMoney> {
    List<BackMoney> selectByCard(String cord);

    Page<CaseInfo> selectPageNoKey(int page, int limit, String bankname, String batchno, String ownerid);

    Page<CaseInfo> selectPageByKey(int page, int limit, String key, String bankname, String batchno, String ownerid);

    Page<CaseInfo> selectPage(int page, int limit, String bankname, String batchno, String ownerid);
}
