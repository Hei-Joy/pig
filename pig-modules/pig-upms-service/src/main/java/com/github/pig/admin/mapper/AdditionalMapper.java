package com.github.pig.admin.mapper;
import java.util.List;

import com.github.pig.admin.model.entity.Additional;
import com.github.pig.admin.model.entity.AdditionalExample;
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