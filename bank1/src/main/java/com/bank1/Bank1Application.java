package com.bank1;


import com.bank1.config.CanalClient;
import com.bank1.entity.Car;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

@SpringBootApplication
@MapperScan("com.bank1.mapper")
@EnableFeignClients
public class Bank1Application {

    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-aaa.xml");
//        Car car = (Car) context.getBean("car");
//        System.out.println(car.getUserAge());
        SpringApplication.run(Bank1Application.class);
    }
}
