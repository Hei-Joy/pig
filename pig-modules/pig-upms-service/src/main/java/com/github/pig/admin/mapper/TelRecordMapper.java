package com.github.pig.admin.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.admin.model.entity.CaseContacts;
import com.github.pig.admin.model.entity.TelRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TelRecordMapper extends BaseMapper<TelRecord> {

    List<TelRecord> selectByCid(String id);

    int selectCount(String cid);

    List<TelRecord> selectPageByCid(@Param("current") int current,@Param("limit") int limit,@Param("cid") String cid,@Param("sort")String sort);

    List<TelRecord> selectTop1ByTelTime(String cid);
}
