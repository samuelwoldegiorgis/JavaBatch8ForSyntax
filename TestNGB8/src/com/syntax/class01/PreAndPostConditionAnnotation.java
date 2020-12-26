package com.syntax.class01;

import org.testng.annotations.*;

public class PreAndPostConditionAnnotation {
    @Test
    public void testMethod() {
        System.out.println("I am a test method");
    }
    @Test
    public void testMethod2(){
        System.out.println("I am a second test method");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }
}
