package com.yangli.springtest.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {


    @Value("#{20-2}")
    private int age;

    @Value("哈萨吉")
    private String name;

    @Value("${person.nickName}")
    private String nickName;

    public Person() {
    }

    public Person(int age, String name, String nickName) {

        this.age=age;
        this.name=name;
        this.nickName=nickName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
