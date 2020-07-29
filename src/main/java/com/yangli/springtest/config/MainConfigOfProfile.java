package com.yangli.springtest.config;

import com.yangli.springtest.bean.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.*;
import org.springframework.util.StringValueResolver;


@PropertySource({"classpath:/dbconfig.properties"})
@Import({MyDataSource.class})
@Configuration
public class MainConfigOfProfile implements EmbeddedValueResolverAware {


    @Value("${db.user}")
    private String user;

    private StringValueResolver stringValueResolver;

    private String driverClass;


    @Profile("Test")
    @Bean("dataSourceTest")
    public MyDataSource dataSourceTest()
    {
        MyDataSource myDataSource=new MyDataSource();
        myDataSource.setUser(user);
        myDataSource.setPassword("123456");
        String jdbcStr="${db.driverClass}";
        myDataSource.setEnvironment("Test");
        return myDataSource;
    }

    @Profile("Dev")
    @Bean("dataSourceDev")
    public MyDataSource dataSourceDev()
    {
        MyDataSource myDataSource=new MyDataSource();
        myDataSource.setUser(user);
        myDataSource.setPassword("${db.password}");
        String jdbcStr=driverClass;
        myDataSource.setEnvironment("Dev");
        return myDataSource;
    }

    @Profile("Prod")
    @Bean("dataSourceProd")
    public MyDataSource dataSourceProd(@Value("${db.password}")String pwd)
    {
        MyDataSource myDataSource=new MyDataSource();
        myDataSource.setUser(user);
        myDataSource.setPassword(pwd);
        myDataSource.setJdbc(driverClass);
        myDataSource.setEnvironment("Prod");
        return myDataSource;
    }


    @Override
    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {

        String s = stringValueResolver.resolveStringValue("${db.jdbc}");
        driverClass=s;
    }
}
