package com.bank1.config;

import com.bank1.entity.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;

public class ZengQiang implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        //RootBeanDefinition definition = new RootBeanDefinition(Car.class);
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(Car.class);
        builder.addPropertyValue("userName", "bjj");
        System.out.println("我先执行......");
        beanDefinitionRegistry.registerBeanDefinition("car", builder.getBeanDefinition());
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("car");
        Object s = beanDefinition.getPropertyValues().get("userName");
        System.out.println("执行了....."+ s.toString());
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
