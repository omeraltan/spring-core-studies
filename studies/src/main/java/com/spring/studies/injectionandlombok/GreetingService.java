package com.spring.studies.injectionandlombok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    private Translator translator;

    public String produce(){
        return translator.translate("hello");
    }
}
