package com.github.pig.admin.mapper;
import java.util.List;

import com.github.pig.admin.model.entity.GovernmentFunds;
import com.github.pig.admin.model.entity.GovernmentFundsExample;
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