package com.github.pig.admin.service.impl;

import com.github.pig.admin.model.entity.UserInfo;
import com.github.pig.admin.mapper.UserInfoMapper;
import com.github.pig.admin.service.IUserInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author sudan
 * @since 2019-05-23
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
