package com.github.pig.admin.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pig.admin.common.util.Tool;
import com.github.pig.admin.mapper.TelRecordMapper;
import com.github.pig.admin.model.entity.CaseContacts;
import com.github.pig.admin.model.entity.TelRecord;
import com.github.pig.admin.service.TelRecordService;
import com.github.pig.common.util.R;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelRecordServiceImpl extends ServiceImpl<TelRecordMapper, TelRecord> implements TelRecordService {
    @Autowired private TelRecordMapper telRecordMapper;

    @Override
    public List<TelRecord> selectByCid(String cid) {
        return telRecordMapper.selectByCid(cid);
    }

    @Override
    public Page<TelRecord> selectPageByCid(int page, int limit, String cid) {
        int current = (page -1 ) * limit;//获取当前第page页的第一条数据的下标
        Page<TelRecord> pages = new Page<>();
        List<TelRecord> list =  telRecordMapper.selectPageByCid(current,limit,cid);
        pages.setRecords(list);
        pages.setSize(limit);
        pages.setCurrent(page);
        pages.setTotal(telRecordMapper.selectCount(cid));
        pages.getPages();
        return pages;
    }


}
