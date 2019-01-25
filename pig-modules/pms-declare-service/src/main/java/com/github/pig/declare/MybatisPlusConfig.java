package com.github.pig.declare;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 46275 on 2018/12/25.
 */
@Configuration
@MapperScan("com.mall.mapper")
public class MybatisPlusConfig {

}
