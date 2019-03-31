package com.github.pig.admin.mapper;
import java.util.List;

import com.github.pig.admin.model.entity.Corporation;
import com.github.pig.admin.model.entity.CorporationExample;
import org.apache.ibatis.annotations.Param;

public interface CorporationMapper {
    long countByExample(CorporationExample example);

    int deleteByExample(CorporationExample example);

    int insert(Corporation record);

    int insertSelective(Corporation record);

    List<Corporation> selectByExample(CorporationExample example);

    int updateByExampleSelective(@Param("record") Corporation record, @Param("example") CorporationExample example);

    int updateByExample(@Param("record") Corporation record, @Param("example") CorporationExample example);
}