package com.github.pig.admin.mapper;

import com.github.pig.admin.model.entity.CaseInfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lengleng
 * @since 2019-03-28
 */
public interface CaseInfoMapper extends BaseMapper<CaseInfo> {

    Integer inserCaseInfo(CaseInfo caseInfo);
}
