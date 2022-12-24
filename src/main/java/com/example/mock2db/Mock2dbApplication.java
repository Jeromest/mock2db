package com.example.mock2db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mock2db.mapper")
public class Mock2dbApplication {

    public static void main(String[] args) {
        SpringApplication.run(Mock2dbApplication.class, args);
    }

}
