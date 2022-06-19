package com.example.kyujinsts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.kyujinsts.mapper")
public class KyujinStsApplication {

    public static void main(String[] args) {
        SpringApplication.run(KyujinStsApplication.class, args);
    }

}
