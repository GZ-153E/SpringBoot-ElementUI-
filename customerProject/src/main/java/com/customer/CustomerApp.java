package com.customer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.customer.dao")
public class CustomerApp {
    //启动类
    public static void main(String[] args) {
        SpringApplication.run(CustomerApp.class,args);
    }
}
