package com.yangli.springtest.config;

import com.yangli.springtest.bean.Dog;
import com.yangli.springtest.bean.Person;
import org.springframework.context.annotation.*;


@PropertySource(value={"classpath:/person.properties","classpath:/dog.properties"},encoding ="" )
@Configuration
public class MainConfigOfProperties {


    @Bean
    public Person person()
    {
        return new Person();
    }

    @Bean
    public Dog dog()
    {
        return new Dog();
    }

}
