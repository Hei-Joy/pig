package com.github.pig.admin.service.impl;
import com.baomidou.mybatisplus.mapper.SqlHelper;
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

}
