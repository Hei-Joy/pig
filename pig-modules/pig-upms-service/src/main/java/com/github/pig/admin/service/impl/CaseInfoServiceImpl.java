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
    public Page<CaseInfo> selectPageByKey(int page,int limit,String key) {
        int current = (page -1) * limit;
        Page<CaseInfo> pages = new Page<>();
        pages.setCurrent(page);//设置当前页数
        pages.setSize(limit);//设置获取最大记录数
        pages.setTotal(caseInfoMapper.selectCount(key).intValue());//设置符合条件的所有记录
        System.out.println(pages.getSize());
        System.out.println(caseInfoMapper.selectPageByKey(current,limit,key));
        pages.setRecords(caseInfoMapper.selectPageByKey(current,limit,key));
        pages.getPages();//设置最大页数
        return pages;
    }


}
