package com.mall.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mall.model.entity.Shareholder;
import com.mall.model.entity.ShareholderExample;
import java.util.List;
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