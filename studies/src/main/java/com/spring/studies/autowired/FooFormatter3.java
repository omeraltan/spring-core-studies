package com.spring.studies.autowired;

import org.springframework.stereotype.Component;

@Component("fooFormatter3")
public class FooFormatter3 {
    public String format(){
        return "foo";
    }
}
