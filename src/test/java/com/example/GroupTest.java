package com.example;

import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class GroupTest {
    @Test(groups = "smoke")
    public void setup(Method method) {
        System.out.println("Method name is:" + method.getName());

    }

    @Test(groups = "regression")
    public void teardown(Method method) {
        System.out.println("Method name is:" + method.getName());

    }

    @Test(groups = "e2e")
    public void testGroup(Method method) {
        System.out.println("Method name is:" + method.getName());

    }

    @Test(dependsOnGroups = {"smoke", "regression"})
    public void groupsCheck(Method method) {
        System.out.println("Method name is:" + method.getName());
    }
}

