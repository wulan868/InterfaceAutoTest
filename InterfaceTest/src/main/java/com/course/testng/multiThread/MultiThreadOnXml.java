package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * Created by wulantuya on 2019/8/7
 */
public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }
}
