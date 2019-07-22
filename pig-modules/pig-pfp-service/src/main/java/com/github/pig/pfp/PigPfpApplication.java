/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.github.pig.pfp;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.tools.Tool;
import java.util.UUID;


@EnableAsync
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.github.pig.pfp", "com.github.pig.common.bean"})
public class PigPfpApplication {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString().replace("-","").toLowerCase();
        uuid = uuid.replaceAll("[a-zA-Z]","" ).substring(0,9);
        System.out.println(uuid);
        System.out.println(checkTicketNum(uuid));
     //   SpringApplication.run(PigPfpApplication.class, args);
    }

    public static   String checkTicketNum(String jksbh) {
        String checkValue = "";
        String str = new String();
        int ai = 0;
        long wi = 0;
        int value = 0;
        int j = 1;
        for (int i = 9; i > 0; i--) {
            str = jksbh.substring(i - 1, i);
            ai = Integer.parseInt(str);
            wi = getValue(j++) % 11;
            value += ai * wi;
        }
        value = value % 11;
        switch (value) {
            case 0:
                checkValue = "1";
                break;
            case 1:
                checkValue = "0";
                break;
            case 2:
                checkValue = "X";
                break;
            case 3:
                checkValue = "9";
                break;
            case 4:
                checkValue = "8";
                break;
            case 5:
                checkValue = "7";
                break;
            case 6:
                checkValue = "6";
                break;
            case 7:
                checkValue = "5";
                break;
            case 8:
                checkValue = "4";
                break;
            case 9:
                checkValue = "3";
                break;
            case 10:
                checkValue = "2";
                break;
        }
        return checkValue;
    }
    private static long getValue(int i) {
        long value = 2;
        for (int k = 1; k < i; k++) {
            value = 2 * value;
        }
        return value;
    }

}