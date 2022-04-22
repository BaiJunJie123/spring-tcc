package com.bank1.ceshi;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class Foot implements ApplicationContextAware {

    private ResourceLoader resourceLoader;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.resourceLoader = applicationContext;
    }

    public void ce(){
        if(resourceLoader != null){
            System.out.println("ResourceLoader 不是null的");
        }
    }
}
