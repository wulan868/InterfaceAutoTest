package com.course.testng;

import org.testng.annotations.*;

/**
 * Created by wulantuya on 2019/8/6
 */
public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这个是测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这个是测试方法之前后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass这个是类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这个是类运行之前运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }

}
