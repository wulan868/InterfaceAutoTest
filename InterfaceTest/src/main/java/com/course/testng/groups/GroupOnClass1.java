package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by wulantuya on 2019/8/7
 */

@Test(groups = "stu")
public class GroupOnClass1 {

    public void stu1(){
        System.out.println("GroupOnClass1中的stu1运行");
    }
    public void stu12(){
        System.out.println("GroupOnClass1中的stu2运行");
    }
    public void stu3(){
        System.out.println("GroupOnClass1中的stu3运行");
    }
}
