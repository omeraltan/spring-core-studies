package com.spring.studies.autowired;

import org.springframework.stereotype.Component;

@Component("fooFormatter2")
public class FooFormatter2 {
    public String format(){
        return "foo";
    }
}
