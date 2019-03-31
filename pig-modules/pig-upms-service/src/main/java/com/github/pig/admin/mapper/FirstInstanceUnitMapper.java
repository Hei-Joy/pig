package com.github.pig.admin.mapper;
import java.util.List;

import com.github.pig.admin.model.entity.FirstInstanceUnit;
import com.github.pig.admin.model.entity.FirstInstanceUnitExample;
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