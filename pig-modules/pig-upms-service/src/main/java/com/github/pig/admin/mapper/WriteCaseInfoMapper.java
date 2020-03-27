package com.github.pig.admin.mapper;

import com.github.pig.admin.model.entity.WriteCaseInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WriteCaseInfoMapper  {

    List<WriteCaseInfo> WriteQuery(@Param("bankname") String bankname);
}
