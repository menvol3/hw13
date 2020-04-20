package com.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PropTest {

    @Parameters({"setup", "teardown"})
    @Test
    public void parameters(String setup, String teardown) {
        System.out.println("First parameter is: " + setup);
        System.out.println("Second parameter is: " + teardown);
    }
}

