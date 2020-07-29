package com.yangli.springtest;

import com.yangli.springtest.bean.Boss;
import com.yangli.springtest.bean.Car;
import com.yangli.springtest.bean.Color;
import com.yangli.springtest.bean.Red;
import com.yangli.springtest.config.MainConfigOfAutowired;
import com.yangli.springtest.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Autowired {

    @Test
    public void testAutoWired()
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

//        BookService bookService = annotationConfigApplicationContext.getBean(BookService.class);
//
//        System.out.println(bookService);
//
//        bookService.print();

//        Boss boss = annotationConfigApplicationContext.getBean(Boss.class);
//
//        Car car = annotationConfigApplicationContext.getBean(Car.class);
//
//        System.out.println(boss.toString());
//
//        System.out.println(car);


        Boss color = annotationConfigApplicationContext.getBean(Boss.class);
        System.out.println(color);
        System.out.println(annotationConfigApplicationContext);
        annotationConfigApplicationContext.close();

    }
}
