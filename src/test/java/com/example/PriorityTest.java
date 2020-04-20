package com.example;

import org.testng.annotations.Test;

public class PriorityTest {
    @Test(priority = 3)
    public void test1() {
        System.out.println("first");
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("second");
    }

    @Test(priority = 1)
    public void test3() {
        System.out.println("third");
    }
}