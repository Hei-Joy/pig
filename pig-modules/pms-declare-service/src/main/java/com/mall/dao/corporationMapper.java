package com.mall.dao;

import com.mall.pojo.corporation;
import com.mall.pojo.corporationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface corporationMapper {
    long countByExample(corporationExample example);

    int deleteByExample(corporationExample example);

    int insert(corporation record);

    int insertSelective(corporation record);

    List<corporation> selectByExample(corporationExample example);

    int updateByExampleSelective(@Param("record") corporation record, @Param("example") corporationExample example);

    int updateByExample(@Param("record") corporation record, @Param("example") corporationExample example);
}