package com.github.pig.admin.service;

import com.github.pig.admin.model.entity.WriteCaseInfo;

import java.util.List;

public interface WriteeCaseInfoService  {

    List<WriteCaseInfo> WriteQuery(String bankname);

}
