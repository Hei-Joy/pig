package com.mall.mapper;

import com.mall.model.entity.FinanceLeadingOfficial;
import com.mall.model.entity.FinanceLeadingOfficialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinanceLeadingOfficialMapper {
    long countByExample(FinanceLeadingOfficialExample example);

    int deleteByExample(FinanceLeadingOfficialExample example);

    int insert(FinanceLeadingOfficial record);

    int insertSelective(FinanceLeadingOfficial record);

    List<FinanceLeadingOfficial> selectByExample(FinanceLeadingOfficialExample example);

    int updateByExampleSelective(@Param("record") FinanceLeadingOfficial record, @Param("example") FinanceLeadingOfficialExample example);

    int updateByExample(@Param("record") FinanceLeadingOfficial record, @Param("example") FinanceLeadingOfficialExample example);
}