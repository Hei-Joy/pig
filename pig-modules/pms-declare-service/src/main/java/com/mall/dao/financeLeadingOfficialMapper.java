package com.mall.dao;

import com.mall.pojo.financeLeadingOfficial;
import com.mall.pojo.financeLeadingOfficialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface financeLeadingOfficialMapper {
    long countByExample(financeLeadingOfficialExample example);

    int deleteByExample(financeLeadingOfficialExample example);

    int insert(financeLeadingOfficial record);

    int insertSelective(financeLeadingOfficial record);

    List<financeLeadingOfficial> selectByExample(financeLeadingOfficialExample example);

    int updateByExampleSelective(@Param("record") financeLeadingOfficial record, @Param("example") financeLeadingOfficialExample example);

    int updateByExample(@Param("record") financeLeadingOfficial record, @Param("example") financeLeadingOfficialExample example);
}