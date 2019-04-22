package com.github.pig.admin.service;

import com.baomidou.mybatisplus.service.IService;
import com.github.pig.admin.model.entity.BackMoney;

import java.util.List;

public interface BackMoneyService extends IService<BackMoney> {
    List<BackMoney> selectByCard(String cord);
}
