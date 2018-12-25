package com.mall.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mall.common.tool.Tool;
import com.mall.mapper.CompanyMapper;
import com.mall.model.entity.Company;
import com.mall.service.CompanyService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.Date;

/**
 * Created by 46275 on 2018/12/24.
 */
@Slf4j
@Service
@AllArgsConstructor
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper,Company> implements CompanyService {
    private final CompanyMapper companyMapper;

    @Override
    public boolean insertCompany(Company company) {
        company.setId(Tool.getUUid());//设置主键id
        companyMapper.insert(company);
        return Boolean.TRUE;
    }

    @Override
    public boolean deleteCompany(String id) {
        companyMapper.deleteCompany(id);
        return Boolean.TRUE;
    }

    @Override
    public boolean updateCompany(Company company) {
        company.setUpdatedate(new Date());
        companyMapper.updateCompany(company);
        return Boolean.TRUE;
    }

    @Override
    public Company findCompanyById(String id) {
        return companyMapper.findCompanyById(id);
    }


}
