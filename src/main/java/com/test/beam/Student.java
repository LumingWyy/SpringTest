package com.test.beam;

import lombok.ToString;

import java.util.List;
import java.util.Map;

@ToString
public class Student {
    String name;
    int age;
    Card card;
    List<String> list;
    Map<String ,String> map;
    
    
    public  Student() {
        System.out.println("student constructor");
    }


    public  Student(String name) {
        System.out.println("student constructor2"+ name);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void say(String text) {
        System.out.println("im"+name+ ".  i say "+text);
    }
    @Deprecated
    public void test() {
        System.out.println("old method");
    }
}
