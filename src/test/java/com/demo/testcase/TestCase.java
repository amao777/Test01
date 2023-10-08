package com.demo.testcase;

import com.demo.apitest.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TestCase extends TestUtil {
    public static String url="https://";

    @BeforeTest
    public void beforeMe(){
        System.out.println("before method!");
    }
    @Test
    public void testLoginSuccess(){
        System.out.println("Test Login Success!");
    }
    @Test
    public void testLoginFail(){
        System.out.println("Test Login Fail!");
        Assert.assertEquals(10,10);
    }
    @AfterTest
    public void afterMe(){
        System.out.println("after method!");
    }
}
