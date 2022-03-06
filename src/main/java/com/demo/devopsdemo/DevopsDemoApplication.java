package com.demo.devopsdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@MapperScan("com.demo.devopsdemo.dao")
public class DevopsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevopsDemoApplication.class, args);
    }

}
