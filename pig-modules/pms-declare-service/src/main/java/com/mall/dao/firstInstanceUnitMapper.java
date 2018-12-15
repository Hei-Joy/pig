package com.mall.dao;

import com.mall.pojo.firstInstanceUnit;
import com.mall.pojo.firstInstanceUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface firstInstanceUnitMapper {
    long countByExample(firstInstanceUnitExample example);

    int deleteByExample(firstInstanceUnitExample example);

    int insert(firstInstanceUnit record);

    int insertSelective(firstInstanceUnit record);

    List<firstInstanceUnit> selectByExample(firstInstanceUnitExample example);

    int updateByExampleSelective(@Param("record") firstInstanceUnit record, @Param("example") firstInstanceUnitExample example);

    int updateByExample(@Param("record") firstInstanceUnit record, @Param("example") firstInstanceUnitExample example);
}