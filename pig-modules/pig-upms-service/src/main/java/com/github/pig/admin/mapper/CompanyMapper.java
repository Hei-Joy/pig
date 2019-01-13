package com.github.pig.admin.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;

import com.github.pig.admin.model.entity.Company;
import com.github.pig.admin.model.entity.CompanyExample;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper extends BaseMapper<Company>{

    Integer deleteCompany(String id);

    Integer updateCompany(Company company);

    Company findCompanyById(String id);

    long countByExample(CompanyExample example);

    int deleteByExample(CompanyExample example);

    Integer insertCompany(Company company);

    int insertSelective(Company record);

    List<Company> selectByExample(CompanyExample example);

    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);
}