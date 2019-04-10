package com.github.pig.admin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pig.admin.mapper.TelRecordMapper;
import com.github.pig.admin.model.entity.TelRecord;
import com.github.pig.admin.service.TelRecordService;
import com.github.pig.common.util.R;
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
}
