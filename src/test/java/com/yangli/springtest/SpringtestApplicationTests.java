package com.yangli.springtest;

import com.yangli.springtest.bean.Dog;
import com.yangli.springtest.bean.Person;
import com.yangli.springtest.config.MainConfigOfProperties;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySources;

import java.util.Date;


class SpringtestApplicationTests {

    AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(MainConfigOfProperties.class);

    @Test
    public void Test()
    {
        int i=50;
        i=i++*2;
        System.out.println(i);
    }

    @Test
    public void contextLoads() {
        printBeans(annotationConfigApplicationContext);
        System.out.println("==================");

        Person person=(Person) annotationConfigApplicationContext.getBean("person");
        Dog dog= (Dog) annotationConfigApplicationContext.getBean("dog");

        System.out.println(person);
        System.out.println(dog);

        ConfigurableEnvironment environment=annotationConfigApplicationContext.getEnvironment();

        PropertySources propertySources=environment.getPropertySources();

        System.out.println(propertySources);
    }

    private void printBeans(AnnotationConfigApplicationContext annotationConfigApplicationContext) {

        String[] definitionNames= annotationConfigApplicationContext.getBeanDefinitionNames();

        for (String name:definitionNames
             ) {
            System.out.println(name);
        }
    }

}
