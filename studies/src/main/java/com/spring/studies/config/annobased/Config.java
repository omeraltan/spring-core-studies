package com.spring.studies.config.annobased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.studies.config")
public class Config {

    @Bean
    public Engine engine(){
        return new Engine("v8",5);
    }

    @Bean
    public Transmission transmission(){
        return new Transmission("sliding");
    }

}
