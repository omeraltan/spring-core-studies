package com.spring.studies.autowired;

import org.springframework.stereotype.Component;

@FormatterType("Foo")
@Component("fooFormatter")
public class FooFormatter implements Formatter{
    public String format(){
        return "foo";
    }
}
