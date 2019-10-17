package com.github.pig.admin;

import org.junit.Test;

/**  -Xss1M 栈空间最大值
 * Created by sudan on 2019/9/8.
 */

public class TestStack {
    private int count = 0;

    public void recursion(){
        count++;
        recursion();
    }
    @Test
    public void testStack(){
        try {
            recursion();
        }catch (Throwable e){
            System.out.println("当前的栈深为:"+count);
            e.printStackTrace();
        }
    }

}
