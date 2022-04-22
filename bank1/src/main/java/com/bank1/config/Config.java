package com.bank1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ZengQiang zengQiang(){
        return new ZengQiang();
    }
}
