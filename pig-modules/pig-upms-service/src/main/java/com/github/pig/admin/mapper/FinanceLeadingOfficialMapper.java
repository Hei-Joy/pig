package com.github.pig.admin.mapper;
import java.util.List;

import com.github.pig.admin.model.entity.FinanceLeadingOfficial;
import com.github.pig.admin.model.entity.FinanceLeadingOfficialExample;
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