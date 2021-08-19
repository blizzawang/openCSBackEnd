package com.example.opencs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.opencs.mapper")
@SpringBootApplication
public class OpenCsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenCsApplication.class, args);
    }

}
