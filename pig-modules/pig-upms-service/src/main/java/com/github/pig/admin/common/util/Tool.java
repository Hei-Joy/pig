package com.github.pig.admin.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by 46275 on 2018/12/24.
 */
public class Tool {

    public static String getUUid(){
        String uuid = UUID.randomUUID().toString().replace("-","").toLowerCase();
        return uuid;
    }

    public static String getDate(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String datesdf = sdf.format(date);
        return datesdf;
    }
}
