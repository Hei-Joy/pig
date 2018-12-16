package com.mall.mapper;

import com.mall.model.entity.GovernmentFunds;
import com.mall.model.entity.GovernmentFundsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GovernmentFundsMapper {
    long countByExample(GovernmentFundsExample example);

    int deleteByExample(GovernmentFundsExample example);

    int insert(GovernmentFunds record);

    int insertSelective(GovernmentFunds record);

    List<GovernmentFunds> selectByExample(GovernmentFundsExample example);

    int updateByExampleSelective(@Param("record") GovernmentFunds record, @Param("example") GovernmentFundsExample example);

    int updateByExample(@Param("record") GovernmentFunds record, @Param("example") GovernmentFundsExample example);
}