package com.mall.dao;

import com.mall.pojo.assets;
import com.mall.pojo.assetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface assetsMapper {
    long countByExample(assetsExample example);

    int deleteByExample(assetsExample example);

    int insert(assets record);

    int insertSelective(assets record);

    List<assets> selectByExample(assetsExample example);

    int updateByExampleSelective(@Param("record") assets record, @Param("example") assetsExample example);

    int updateByExample(@Param("record") assets record, @Param("example") assetsExample example);
}