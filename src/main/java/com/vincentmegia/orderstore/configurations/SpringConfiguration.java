package com.vincentmegia.orderstore.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    @Value("${com.vincentmegia.test}")
    private String test;
    public String getTest() {
        return this.test;
    }
}
