package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by wulantuya on 2019/8/7
 */

@Test(groups = "tea")
public class GroupOnClass3 {
    public void teacher1(){
        System.out.println("GroupOnClass3中的teacher1运行");
    }
    public void teacher2(){
        System.out.println("GroupOnClass3中的teacher2运行");
    }
}