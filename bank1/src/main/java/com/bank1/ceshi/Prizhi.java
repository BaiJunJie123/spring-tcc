package com.bank1.ceshi;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Prizhi {

    @Bean
    public Customer customer(){
        return new Customer();
    }

    @Bean
    public CustomEditorConfigurer customEditorConfigurer(){
        CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
        customEditorConfigurer.setPropertyEditorRegistrars((new PropertyEditorRegistrar[]{new CustomerZuCe()}));
        return customEditorConfigurer;
    }
}
