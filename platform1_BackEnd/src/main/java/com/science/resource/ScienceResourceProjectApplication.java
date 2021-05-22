package com.science.resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.science.resource.mapper")
public class ScienceResourceProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScienceResourceProjectApplication.class, args);
    }

}
