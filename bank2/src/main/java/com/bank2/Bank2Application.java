package com.bank2;


import com.bank2.config.CanalClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.annotation.Resource;


@SpringBootApplication
@MapperScan("com.bank2.mapper")
@EnableFeignClients
public class Bank2Application {

    @Resource
    private CanalClient canalClient;

    public static void main(String[] args) {

        SpringApplication.run(Bank2Application.class);

    }
}
