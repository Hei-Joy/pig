package com.github.pig.admin.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.github.pig.admin.model.entity.TelRecord;

import java.util.List;

public interface TelRecordMapper extends BaseMapper<TelRecord> {

    List<TelRecord> selectByCid(String id);
}
