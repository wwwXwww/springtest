package com.yangli.springtest;

import com.yangli.springtest.bean.Person;
import com.yangli.springtest.config.MainConfigOfLifeCycle;
import com.yangli.springtest.config.OSConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class IOCTest_LifeCycle {


    AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

    @Test
    public void test()
    {
        //1.创建IOC容器


        System.out.println("容器创建成功");

        //关闭容器
        annotationConfigApplicationContext.close();
    }



}
