package com.github.pig.admin.mapper;

import com.github.pig.admin.model.entity.WriteCaseInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WriteCaseInfoMapper  {

    List<WriteCaseInfo> WriteQuery(@Param("bankname") String bankname,@Param("name") String name,@Param("batchno") String batchno,@Param("ownerid") String ownerid,@Param("batchnotype") String batchnotype,@Param("certno") String certno,@Param("frontTime") String frontTime,@Param("rearTime") String rearTime);
}
