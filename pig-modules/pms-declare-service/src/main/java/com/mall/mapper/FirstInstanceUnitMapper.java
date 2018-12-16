package com.mall.mapper;

import com.mall.model.entity.FirstInstanceUnit;
import com.mall.model.entity.FirstInstanceUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FirstInstanceUnitMapper {
    long countByExample(FirstInstanceUnitExample example);

    int deleteByExample(FirstInstanceUnitExample example);

    int insert(FirstInstanceUnit record);

    int insertSelective(FirstInstanceUnit record);

    List<FirstInstanceUnit> selectByExample(FirstInstanceUnitExample example);

    int updateByExampleSelective(@Param("record") FirstInstanceUnit record, @Param("example") FirstInstanceUnitExample example);

    int updateByExample(@Param("record") FirstInstanceUnit record, @Param("example") FirstInstanceUnitExample example);
}