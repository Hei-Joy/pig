package com.mall.mapper;

import com.mall.model.entity.ScienceLeadingOfficial;
import com.mall.model.entity.ScienceLeadingOfficialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScienceLeadingOfficialMapper {
    long countByExample(ScienceLeadingOfficialExample example);

    int deleteByExample(ScienceLeadingOfficialExample example);

    int insert(ScienceLeadingOfficial record);

    int insertSelective(ScienceLeadingOfficial record);

    List<ScienceLeadingOfficial> selectByExample(ScienceLeadingOfficialExample example);

    int updateByExampleSelective(@Param("record") ScienceLeadingOfficial record, @Param("example") ScienceLeadingOfficialExample example);

    int updateByExample(@Param("record") ScienceLeadingOfficial record, @Param("example") ScienceLeadingOfficialExample example);
}