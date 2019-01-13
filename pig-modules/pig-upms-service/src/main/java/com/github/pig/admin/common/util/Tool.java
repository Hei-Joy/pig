package com.github.pig.admin.common.util;

import java.util.UUID;

/**
 * Created by 46275 on 2018/12/24.
 */
public class Tool {

    public static String getUUid(){
        String uuid = UUID.randomUUID().toString().replace("-","").toLowerCase();
        return uuid;
    }
}
