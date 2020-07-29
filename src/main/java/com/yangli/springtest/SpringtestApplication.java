package com.yangli.springtest;

import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringtestApplication {

    public static void main(String[] args) {
        SpringApplication springApplication=new SpringApplication();
        springApplication.run(SpringtestApplication.class, args);

    }

}
