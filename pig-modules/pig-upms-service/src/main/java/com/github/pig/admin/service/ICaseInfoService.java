package com.github.pig.admin.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.github.pig.admin.model.dto.CaseDTO;
import com.github.pig.admin.model.entity.CaseInfo;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lengleng
 * @since 2019-03-28
 */
public interface ICaseInfoService extends IService<CaseInfo> {

    @Override
    boolean insert(CaseInfo caseInfo);

    boolean inserCaseInfo(CaseInfo caseInfo);

    CaseDTO selectCaseDTO(String guid);

    Page<CaseInfo> selectPageByKey(int page,int limit,String key,int userId,String bankname,String batchno,String ownerid,String batchnoType,String certno,String sort);

    Page<CaseInfo> selectPageByName(int page,int limit ,String name,int userId);

    Page<CaseInfo> selectPageNoKey(int page,int limit,int userId,String bankname,String batchno,String ownerid,String batchnoType,String certno,String sort);

    int selectCountbatchNo(String batchNo);

    void timingUpdate();

    int  updateUser(String id,String ownerId);
}
