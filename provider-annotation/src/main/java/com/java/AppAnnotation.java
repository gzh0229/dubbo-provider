package com.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class AppAnnotation {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.in.read();
    }

}