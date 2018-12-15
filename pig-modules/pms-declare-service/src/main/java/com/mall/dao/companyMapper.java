package com.mall.dao;

import com.mall.pojo.company;
import com.mall.pojo.companyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface companyMapper {
    long countByExample(companyExample example);

    int deleteByExample(companyExample example);

    int insert(company record);

    int insertSelective(company record);

    List<company> selectByExample(companyExample example);

    int updateByExampleSelective(@Param("record") company record, @Param("example") companyExample example);

    int updateByExample(@Param("record") company record, @Param("example") companyExample example);
}