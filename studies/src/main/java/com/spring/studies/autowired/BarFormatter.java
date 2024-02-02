package com.spring.studies.autowired;

import org.springframework.stereotype.Component;
@FormatterType("Bar")
@Component("barFormatter")
public class BarFormatter implements Formatter{
    public String format(){
        return "bar";
    }
}
