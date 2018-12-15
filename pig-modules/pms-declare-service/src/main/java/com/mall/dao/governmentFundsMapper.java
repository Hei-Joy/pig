package com.mall.dao;

import com.mall.pojo.governmentFunds;
import com.mall.pojo.governmentFundsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface governmentFundsMapper {
    long countByExample(governmentFundsExample example);

    int deleteByExample(governmentFundsExample example);

    int insert(governmentFunds record);

    int insertSelective(governmentFunds record);

    List<governmentFunds> selectByExample(governmentFundsExample example);

    int updateByExampleSelective(@Param("record") governmentFunds record, @Param("example") governmentFundsExample example);

    int updateByExample(@Param("record") governmentFunds record, @Param("example") governmentFundsExample example);
}