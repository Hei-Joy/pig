package com.mall.dao;

import com.mall.pojo.scienceLeadingOfficial;
import com.mall.pojo.scienceLeadingOfficialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface scienceLeadingOfficialMapper {
    long countByExample(scienceLeadingOfficialExample example);

    int deleteByExample(scienceLeadingOfficialExample example);

    int insert(scienceLeadingOfficial record);

    int insertSelective(scienceLeadingOfficial record);

    List<scienceLeadingOfficial> selectByExample(scienceLeadingOfficialExample example);

    int updateByExampleSelective(@Param("record") scienceLeadingOfficial record, @Param("example") scienceLeadingOfficialExample example);

    int updateByExample(@Param("record") scienceLeadingOfficial record, @Param("example") scienceLeadingOfficialExample example);
}