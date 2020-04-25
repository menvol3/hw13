package com.example;

import org.testng.annotations.*;

import java.lang.reflect.Method;

public class SimpleTest {
    @BeforeMethod
    public void setup() {
        System.out.println("Method name is: setup");
    }

    @Test
    public void SimpleMethod(Method method) {
        System.out.println("Method name is: " + method.getName());
    }

    @AfterMethod
    public void teardown() {
        System.out.println("Method name is: teardown");
    }
}