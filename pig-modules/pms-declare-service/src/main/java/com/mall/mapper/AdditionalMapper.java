package com.mall.mapper;

import com.mall.model.entity.Additional;
import com.mall.model.entity.AdditionalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdditionalMapper {
    long countByExample(AdditionalExample example);

    int deleteByExample(AdditionalExample example);

    int insert(Additional record);

    int insertSelective(Additional record);

    List<Additional> selectByExample(AdditionalExample example);

    int updateByExampleSelective(@Param("record") Additional record, @Param("example") AdditionalExample example);

    int updateByExample(@Param("record") Additional record, @Param("example") AdditionalExample example);
}