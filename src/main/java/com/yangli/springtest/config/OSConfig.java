package com.yangli.springtest.config;

import com.yangli.springtest.bean.Person;
import com.yangli.springtest.condition.LinuxCondition;
import com.yangli.springtest.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 *  可以修改虚拟机vm参数 -Dos.name=linux 来达到模拟切换系统类型实现
 *
 */

@Configuration
public class OSConfig {


    @Lazy
    @Bean("person")
    public Person person()
    {
        System.out.println("给容器中添加person");
        return new Person(12,"李四","小李四");
    }

    @Bean("linus")
    @Conditional(LinuxCondition.class)
    public Person getPerson1(){

        return new Person(62,"Bill Gates","Bill Gates st");
    }

    @Bean("bill")
    @Conditional(WindowsCondition.class)
    public Person getPerson2(){

        return new Person(48,"linus","linus st");
    }
}
