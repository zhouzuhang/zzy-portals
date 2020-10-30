package com.zzyportals;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.zzyportals.dao"})
public class ZzyPortalsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZzyPortalsApplication.class, args);
    }

}
