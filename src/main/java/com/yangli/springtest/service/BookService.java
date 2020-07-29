package com.yangli.springtest.service;

import com.yangli.springtest.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class BookService {


    //@Qualifier(value = "BookDao") //强制装配bookDao
    @Autowired(required = false)
    private BookDao bookDao;



    public void print()
    {
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
