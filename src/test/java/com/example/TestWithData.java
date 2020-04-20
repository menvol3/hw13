package com.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class TestWithData {

    @DataProvider(name = "newData")
    public Object[] dataProviderMethod(Method method) {
        return new Object[][]{
                {method.getName()}
        };
    }

    @Test(dataProvider = "newData")
    public void resultMethod(String method) {
        System.out.println("Method name is: " + method);
    }
}

