package com.yangli.springtest.config;


import com.yangli.springtest.dao.BookDao;
import org.springframework.context.annotation.*;


/**
 *
 *  自定义组件想要使用Spring容器底层的一些组件(applicationContext,BeanFactory,xxx);
 *  自定义组件实现 xxxAware;
 */
@PropertySource(value={"classpath:/person.properties","classpath:/dog.properties"},encoding ="" )
@ComponentScan({"com.yangli.springtest.controller","com.yangli.springtest.dao","com.yangli.springtest.service","com.yangli.springtest.bean"})
@Configuration
public class MainConfigOfAutowired {


    //@Primary  //首选装配标注了该注解的Bean，此时的 @Qualifier
    @Bean("BookDao2")
    public BookDao bookDao2()
    {
        BookDao bookDao=new BookDao();
        bookDao.setLable("2");
        return bookDao;
    }
}
