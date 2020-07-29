package com.yangli.springtest;

import com.yangli.springtest.bean.MyDataSource;
import com.yangli.springtest.config.MainConfigOfProfile;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Profile {

    @Test
    public void TestProfile()
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();


        //也可以使用虚拟机参数 -Dspring.profiles.active=Dev
        //annotationConfigApplicationContext.getEnvironment().setActiveProfiles("");

        annotationConfigApplicationContext.register(MainConfigOfProfile.class);

        annotationConfigApplicationContext.refresh();

        String[] bean = annotationConfigApplicationContext.getBeanNamesForType(MyDataSource.class);

        for (String s:bean
             ) {
            System.out.println(s);
        }


        annotationConfigApplicationContext.close();
    }
}
