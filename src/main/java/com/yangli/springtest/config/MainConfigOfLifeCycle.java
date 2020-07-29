package com.yangli.springtest.config;


import com.yangli.springtest.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/***
 * 1)  指定初始化和销毁方法；
 *       通过 @Bean 指定init-methodh和destroy-method;
 * 2)  通过Bean实现InitializingBean(定义初始化逻辑），DisposableBean(定义销毁逻辑）;
 *
 * 3)  可以使用JSR250:
 *      @PostConstructor :在bean创建完成并赋属性完成，来执行初始化方法
 *      @PreDestroy :在容器销毁bean之前通知我们进行清理工作
 *
 * 4） BeanPostProcessor : bean的后置处理器；
 *      在bean初始化前后进行一些处理工作
 *      postProcessBeforeInitialization
 *      postProcessAfterInitialization
 *
 */


@ComponentScan("com.yangli.springtest.bean")
@Configuration
public class MainConfigOfLifeCycle {


    @Bean(initMethod = "init" ,destroyMethod = "destroy")
    public Car car()
    {
        return new Car();
    }
}
