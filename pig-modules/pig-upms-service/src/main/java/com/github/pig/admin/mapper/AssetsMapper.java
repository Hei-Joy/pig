package com.github.pig.admin.mapper;
import java.util.List;

import com.github.pig.admin.model.entity.Assets;
import com.github.pig.admin.model.entity.AssetsExample;
import org.apache.ibatis.annotations.Param;

public interface AssetsMapper {
    long countByExample(AssetsExample example);

    int deleteByExample(AssetsExample example);

    int insert(Assets record);

    int insertSelective(Assets record);

    List<Assets> selectByExample(AssetsExample example);

    int updateByExampleSelective(@Param("record") Assets record, @Param("example") AssetsExample example);

    int updateByExample(@Param("record") Assets record, @Param("example") AssetsExample example);
}