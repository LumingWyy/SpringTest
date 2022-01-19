package com.test.aop;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
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
}
