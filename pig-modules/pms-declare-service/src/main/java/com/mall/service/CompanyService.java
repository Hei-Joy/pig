package com.mall.service;

import com.baomidou.mybatisplus.service.IService;
import com.mall.model.entity.Company;

/**
 * Created by 46275 on 2018/12/24.
 */
public interface CompanyService extends IService<Company> {

    boolean insertCompany(Company company);

    boolean deleteCompany(String id);

    boolean updateCompany(Company company);

    Company findCompanyById(String id);

}
