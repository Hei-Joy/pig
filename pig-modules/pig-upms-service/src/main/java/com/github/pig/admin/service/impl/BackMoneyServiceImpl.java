package com.github.pig.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pig.admin.mapper.BackMoneyMapper;
import com.github.pig.admin.model.entity.BackMoney;
import com.github.pig.admin.service.BackMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackMoneyServiceImpl extends ServiceImpl<BackMoneyMapper, BackMoney> implements BackMoneyService {
    @Autowired
    BackMoneyMapper backMoneyMapper;
    @Override
    public List<BackMoney> selectByCard(String cord) {
        return backMoneyMapper.selectByCard(cord);
    }
}
