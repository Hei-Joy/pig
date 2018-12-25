package com.mall.controller;

import com.mall.model.entity.Company;
import com.mall.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 46275 on 2018/12/24.
 */
@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    /**
     * 添加单位信息
     * @param
     * @return
     */
    @GetMapping("/insert")
    public boolean insertCompany(){
//        companyService.insertCompany(company);
//        return Boolean.TRUE;
        System.out.println("前台已经传参");
        return false;
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
//    @GetMapping("/{id}")
//    public Company company(@PathVariable String id){
//        return companyService.findCompanyById(id);
//    }
}
