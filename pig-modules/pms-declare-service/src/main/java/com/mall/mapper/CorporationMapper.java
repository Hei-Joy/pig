package com.mall.mapper;

import com.mall.model.entity.Corporation;
import com.mall.model.entity.CorporationExample;
import java.util.List;
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