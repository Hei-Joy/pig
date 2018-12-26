package com.mall.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mall.model.entity.Company;
import com.mall.model.entity.CompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper extends BaseMapper<Company>{

    int deleteCompany(String id);

    int updateCompany(Company company);

    Company findCompanyById(String id);

    long countByExample(CompanyExample example);

    int deleteByExample(CompanyExample example);

    Integer insert(Company company);

    int insertSelective(Company record);

    List<Company> selectByExample(CompanyExample example);

    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);
}