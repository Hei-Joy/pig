package com.mall.dao;

import com.mall.pojo.shareholder;
import com.mall.pojo.shareholderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface shareholderMapper {
    long countByExample(shareholderExample example);

    int deleteByExample(shareholderExample example);

    int insert(shareholder record);

    int insertSelective(shareholder record);

    List<shareholder> selectByExample(shareholderExample example);

    int updateByExampleSelective(@Param("record") shareholder record, @Param("example") shareholderExample example);

    int updateByExample(@Param("record") shareholder record, @Param("example") shareholderExample example);
}