package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by wulantuya on 2019/8/7
 */
public class TimeOutTest {

    @Test(timeOut = 3000)  //单位值为毫秒值
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)  //单位值为毫秒值
    public void testFailed() throws InterruptedException{
        Thread.sleep(3000);
    }
}
