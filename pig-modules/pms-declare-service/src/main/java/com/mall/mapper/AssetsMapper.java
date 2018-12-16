package com.mall.mapper;

import com.mall.model.entity.Assets;
import com.mall.model.entity.AssetsExample;
import java.util.List;
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