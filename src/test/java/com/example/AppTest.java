/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example;

import org.testng.annotations.*;

import java.lang.reflect.Method;

public class AppTest {
    @Test
    public void setup(Method method) {
        System.out.println("Method name is:" + method.getName());

    }

    @Test
    public void teardown(Method method) {
        System.out.println("Method name is:" + method.getName());
    }
}