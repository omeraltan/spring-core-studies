package com.spring.studies.injectionandlombok;

import org.springframework.stereotype.Component;

@Component
public class Translator {

    public static String translate(String param){
        return param.formatted("%s" + param);
    }

}
