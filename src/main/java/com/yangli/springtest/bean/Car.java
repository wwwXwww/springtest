package com.yangli.springtest.bean;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


@Component
public class Car  {//implements InitializingBean, DisposableBean

    public Car() {
        System.out.println("car constructor...");
    }


    public void init()
    {
        System.out.println("car init....");
    }

    //@Override
    public void destroy() throws Exception {
        System.out.println("car destroy....");
    }

    //@Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("car ...afterPropertiesSet... ");
    }
}
