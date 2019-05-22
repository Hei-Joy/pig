package com.github.pig.admin.service.impl;
import com.baomidou.mybatisplus.mapper.SqlHelper;
import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.admin.model.dto.CaseDTO;
import com.github.pig.admin.model.entity.CaseInfo;
import com.github.pig.admin.mapper.CaseInfoMapper;
import com.github.pig.admin.service.ICaseInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lengleng
 * @since 2019-03-28
 */
@Service
public class CaseInfoServiceImpl extends ServiceImpl<CaseInfoMapper, CaseInfo> implements ICaseInfoService {
    @Autowired
    private CaseInfoMapper caseInfoMapper;

    public boolean inserCaseInfo(CaseInfo caseInfo){
        return SqlHelper.delBool(caseInfoMapper.inserCaseInfo(caseInfo));
    }

    @Override
    public CaseDTO selectCaseDTO(String guid) {
        return caseInfoMapper.selectCaseDTO(guid);
    }

    @Override
    public Page<CaseInfo> selectPageByKey(int page,int limit,String key,int userId, String bankname) {
        int current = (page -1) * limit;
        Page<CaseInfo> pages = this.buildPage(page,limit);
        pages.setTotal(caseInfoMapper.selectCount(key,userId,bankname));//设置符合条件的所有记录
        pages.setRecords(caseInfoMapper.selectPageByKey(current,limit,key, userId,bankname));
        pages.getPages();//设置最大页数
        return pages;
    }

    @Override
    public Page<CaseInfo> selectPageByName(int page, int limit, String name,int userId) {
        int current = (page -1) * limit;
        Page<CaseInfo> pages = this.buildPage(page,limit);
        pages.setTotal(caseInfoMapper.selectCountByName(name,userId));//设置查询的记录总数
        pages.setRecords(caseInfoMapper.selectPageByName(current,limit,name,userId));
        pages.getPages();//设置最大页数
        return pages;
    }

    @Override
    public Page<CaseInfo> selectPageNoKey(int page, int limit,int userId,String bankname) {
        int current = (page - 1) * limit;
        System.out.println(userId);
        Page<CaseInfo> pages = this.buildPage(page,limit);
        pages.setTotal(caseInfoMapper.selectCountNoKey(userId, bankname));
        pages.setRecords(caseInfoMapper.selectPageNoKey(current,limit,userId, bankname));
        pages.getPages();
        System.out.println(pages);
        System.out.println(pages.getRecords());
        return pages;
    }

    private Page<CaseInfo> buildPage(int page ,int limit){
        Page<CaseInfo> pages = new Page<>();
        pages.setCurrent(page);
        pages.setSize(limit);//设置获取最大记录数
        return pages;
    }



}
