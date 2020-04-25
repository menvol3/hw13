package com.example;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class GroupTest {
    @BeforeGroups("smoke")
    public void before() {
        System.out.println("before smoke");

    }

    @AfterGroups("regression")
    public void after() {
        System.out.println("after regression");

    }

    @Test(groups = "smoke")
    public void setup(Method method) {
        System.out.println("Method name is: " + method.getName());

    }

    @Test(groups = "regression")
    public void teardown(Method method) {
        System.out.println("Method name is: " + method.getName());

    }

    @Test(groups = "e2e")
    public void testGroup(Method method) {
        System.out.println("Method name is: " + method.getName());

    }

    @Test(dependsOnGroups = {"smoke", "regression"})
    public void groupsCheck(Method method) {
        System.out.println("Method name is: " + method.getName());
    }
}

