package com.github.pig.admin.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.github.pig.admin.model.entity.TelRecord;
import com.github.pig.common.util.R;

import java.util.List;

public interface TelRecordService extends IService<TelRecord> {

    List<TelRecord> selectByCid(String cid);

    Page<TelRecord> selectPageByCid(int page,int limit,String cid);
}
