package com.serverless.function;

import java.util.function.Function;

public class Hello implements Function<String, String> {

    @Override
    public String apply(String s) {
        return "Hello " + s + ", and welcome to Spring Cloud Function!!!";
    }
}