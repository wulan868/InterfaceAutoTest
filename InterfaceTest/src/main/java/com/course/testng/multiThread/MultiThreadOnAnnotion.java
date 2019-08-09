package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * Created by wulantuya on 2019/8/7
 */
public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)      //用10个线程执行,threadPoolSize线程池
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }
}
