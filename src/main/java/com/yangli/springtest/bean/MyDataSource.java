package com.yangli.springtest.bean;


import org.springframework.stereotype.Component;

@Component
public class MyDataSource {

    private String user;

    private String password;

    private String jdbc;

    private String environment;

    public MyDataSource() {
    }

    public MyDataSource(String user, String password, String jdbc, String environment) {
        this.user = user;
        this.password = password;
        this.jdbc = jdbc;
        this.environment = environment;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdbc() {
        return jdbc;
    }

    public void setJdbc(String jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public String toString() {
        return "MyDataSource{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", jdbc='" + jdbc + '\'' +
                ", environment='" + environment + '\'' +
                '}';
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
