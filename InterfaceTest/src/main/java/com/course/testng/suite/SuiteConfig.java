package com.course.testng.suite;

import org.testng.annotations.*;

/**
 * Created by wulantuya on 2019/8/7
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite运行啦");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite运行啦");
    }


    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}
