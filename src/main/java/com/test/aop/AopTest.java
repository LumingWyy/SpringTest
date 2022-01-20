package com.test.aop;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

@Log
public class AopTest {
    public void before(){
        log.info("before log");
    }
    public void after(JoinPoint point){
        System.out.println(Arrays.toString(point.getArgs()));
        System.out.println(point.getThis());
        log.info("after log");
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before");
        Object res = joinPoint.proceed();
        System.out.println("i am Around");
        return res;
    }
}
