package com.github.pig.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pig.admin.mapper.CaseContactsMapper;
import com.github.pig.admin.model.entity.CaseContacts;
import com.github.pig.admin.service.CaseContactsService;
import org.springframework.stereotype.Service;

@Service
public class CaseContactsServiceImpl extends ServiceImpl<CaseContactsMapper, CaseContacts> implements CaseContactsService {
}
