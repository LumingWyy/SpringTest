package com.test;

import com.test.beam.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        Student student = (Student) context.getBean("student");
        student.say("aaaaaaaaaaaaaa");
        student.test();

    }
}
