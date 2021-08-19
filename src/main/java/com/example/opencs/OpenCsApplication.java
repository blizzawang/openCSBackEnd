package com.example.opencs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.example.opencs.mapper")
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class OpenCsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenCsApplication.class, args);
    }

}
