package com.yangli.springtest.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition {

    /**
     * ConditionContext:判断条件能使用的上下文（环境）
     * AnnotationTypeMetadata：注释信息
     *
     * @param conditionContext
     * @param annotatedTypeMetadata
     * @return
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //获取ioc使用的beanfactory
        ConfigurableListableBeanFactory listableBeanFactory=conditionContext.getBeanFactory();

        //获取类加载器
        ClassLoader classLoader=conditionContext.getClassLoader();

        //获取当前环境信息
        Environment environment=conditionContext.getEnvironment();

        //获取到bean定义的注册类
        BeanDefinitionRegistry registry=conditionContext.getRegistry();

        String properties=environment.getProperty("os.name");

        if(properties.contains("Windows")){
            return true;
        }

        return false;
    }
}
