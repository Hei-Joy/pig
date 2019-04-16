package com.github.pig.admin.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.github.pig.admin.model.entity.CaseContacts;

public interface CaseContactsMapper extends BaseMapper<CaseContacts> {
    int deleteByPrimaryKey(String guid);

    int insertSelective(CaseContacts record);

    CaseContacts selectByPrimaryKey(String guid);

    int updateByPrimaryKeySelective(CaseContacts record);

    int updateByPrimaryKey(CaseContacts record);
}