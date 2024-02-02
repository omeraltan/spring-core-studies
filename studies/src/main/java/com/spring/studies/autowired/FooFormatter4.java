package com.spring.studies.autowired;

import org.springframework.stereotype.Component;

@Component("fooFormatter4")
public class FooFormatter4 {
    public String format(){
        return "foo";
    }
}
