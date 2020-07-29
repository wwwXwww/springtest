package com.yangli.springtest;

import com.yangli.springtest.bean.Person;
import com.yangli.springtest.config.OSConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Conditional {

    AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(OSConfig.class);

    @Test
    public void testOS()
    {
        String[]  namesFortype=annotationConfigApplicationContext.getBeanNamesForType(Person.class);
//        ConfigurableEnvironment environment= annotationConfigApplicationContext.getEnvironment();
//        String property=environment.getProperty("os.name");
//
//        System.out.println(property);
        for(String name:namesFortype)
        {
            System.out.println(name);
        }
    }
}
