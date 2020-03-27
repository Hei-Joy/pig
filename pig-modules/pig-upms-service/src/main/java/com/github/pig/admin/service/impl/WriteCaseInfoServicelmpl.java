package com.github.pig.admin.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.admin.mapper.WriteCaseInfoMapper;
import com.github.pig.admin.model.entity.WriteCaseInfo;
import com.github.pig.admin.service.WriteeCaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class WriteCaseInfoServicelmpl implements WriteeCaseInfoService {
    @Autowired
    private WriteCaseInfoMapper writeCaseInfoMapper;
    @Override
    public List<WriteCaseInfo> WriteQuery(String bankname) {
        return writeCaseInfoMapper.WriteQuery(bankname);
    }

}
