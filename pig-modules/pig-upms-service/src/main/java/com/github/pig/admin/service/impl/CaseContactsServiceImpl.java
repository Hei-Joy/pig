package com.github.pig.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pig.admin.common.util.Tool;
import com.github.pig.admin.mapper.CaseContactsMapper;
import com.github.pig.admin.model.entity.CaseContacts;
import com.github.pig.admin.service.CaseContactsService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaseContactsServiceImpl extends ServiceImpl<CaseContactsMapper, CaseContacts> implements CaseContactsService {
    @Autowired
    private CaseContactsMapper mapper;
}
