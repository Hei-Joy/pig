package com.github.pig.admin.controller;

import com.github.pig.admin.model.entity.Company;
import com.github.pig.admin.service.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 46275 on 2018/12/24.
 */
@RestController
@RequestMapping("/company")
public class CompanyController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CompanyService companyService;

    /**
     * 添加单位信息
     * @param
     * @return
     */
    @PostMapping("/insert")
    public boolean insertCompany(Company company){
        companyService.insertCompany(company);
        return Boolean.TRUE;
    }

    /**
     * 根据id删除单位信息
     * @param id 单位信息id
     * @return
     */
    @PostMapping("/delete")
    public boolean deleteCompany(String id){
        companyService.deleteCompany(id);
        return Boolean.TRUE;
    }

    @PostMapping("/update")
    public boolean updateCompany(@RequestBody Company company){
        companyService.updateCompany(company);
        return Boolean.TRUE;
    }

    /**
     * 根据id查询单位信息
     * @param id   单位信息id
     * @return
     */
    @GetMapping("/{id}")
    public Company company(@PathVariable String id){
        logger.info("执行查询单位信息ID:{}",id);
        return companyService.findCompanyById(id);
    }
}
