package com.spring.studies.autowiringofgeneric;

import org.springframework.context.annotation.Bean;

public class CustomConfiguration {

    @Bean
    @CarQualifier
    public Car getMercedes(){
        return new Car("e280", "Mercedes", "Diesel");
    }
}
