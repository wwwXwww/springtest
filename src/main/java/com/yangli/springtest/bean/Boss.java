package com.yangli.springtest.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boss {

    private Car car;

    public Car getCar() {
        return car;
    }

    public Boss() {
    }

    //可以直接将注解写到参数位置
    public Boss(Car car) {
        this.car = car;
    }

    //@Autowired //可以通过注解注入到方法的参数中
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
