package com.test.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AopAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("method name is "+ method.getName());
        System.out.println("para : "+ Arrays.toString(objects));
        System.out.println("target :" + o1);
        System.out.println("return :" + o);
    }
}
