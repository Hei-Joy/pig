package com.mall.dao;

import com.mall.pojo.additional;
import com.mall.pojo.additionalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface additionalMapper {
    long countByExample(additionalExample example);

    int deleteByExample(additionalExample example);

    int insert(additional record);

    int insertSelective(additional record);

    List<additional> selectByExample(additionalExample example);

    int updateByExampleSelective(@Param("record") additional record, @Param("example") additionalExample example);

    int updateByExample(@Param("record") additional record, @Param("example") additionalExample example);
}