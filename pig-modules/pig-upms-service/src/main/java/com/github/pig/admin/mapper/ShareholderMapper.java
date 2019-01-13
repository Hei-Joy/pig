package com.github.pig.admin.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;

import com.github.pig.admin.model.entity.Shareholder;
import com.github.pig.admin.model.entity.ShareholderExample;
import org.apache.ibatis.annotations.Param;

public interface ShareholderMapper extends BaseMapper<Shareholder>{

    Shareholder findShareholderById(String id);

    int deleteShareholder(String id);

    int updateShareholder(Shareholder shareholder);

    int insertShareholder(Shareholder shareholder);

    long countByExample(ShareholderExample example);

    int deleteByExample(ShareholderExample example);

    Integer insert(Shareholder record);

    int insertSelective(Shareholder record);

    List<Shareholder> selectByExample(ShareholderExample example);

    int updateByExampleSelective(@Param("record") Shareholder record, @Param("example") ShareholderExample example);

    int updateByExample(@Param("record") Shareholder record, @Param("example") ShareholderExample example);
}