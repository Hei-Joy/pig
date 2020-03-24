package com.github.pig.admin.common.config;

import com.github.pig.admin.service.ICaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务，每隔一天查询一次数据库，
 * 超过两天未打电话催债，显示未催债
 */
@Component
public class ScheduledConifg {

    @Autowired private ICaseInfoService caseInfoService;

    @Scheduled(cron = "0 0 0 1/1 * ?") //每一天凌晨24点执行一次0 0 0 1/1 * ?
    public void timing(){
        caseInfoService.timingUpdate();
    }
}
