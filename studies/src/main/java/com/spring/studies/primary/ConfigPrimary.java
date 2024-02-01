package com.spring.studies.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.spring.studies.primary")
public class ConfigPrimary {

    @Bean
    public Information JohnInformation(){
        return new Information("John");
    }

    @Bean
    @Primary
    public Information TonyInformation(){
        return new Information("Tony");
    }

}
