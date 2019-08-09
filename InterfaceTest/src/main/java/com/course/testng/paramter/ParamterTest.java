package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by wulantuya on 2019/8/7
 */
public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("name = " + name + " age = " + age);
    }
}
