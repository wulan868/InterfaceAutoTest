package com.course.testng;

import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;

/**
 * Created by wulantuya on 2019/8/7
 */
public class ExpectedException {
    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();

    }

}
