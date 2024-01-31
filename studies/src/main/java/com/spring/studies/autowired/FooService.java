package com.spring.studies.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FooService {
    // autowired on properties
    @Autowired //Spring injects fooFormatter when FooService is created.
    private FooFormatter fooFormatter;

    private FooFormatter2 fooFormatter2;
    // autowired on setters
    @Autowired // the setter method is called with the instance of FooFormatter2 when FooService is created
    public void setFooFormatter2(FooFormatter2 fooFormatter2) {
        this.fooFormatter2 = fooFormatter2;
    }

    private FooFormatter3 fooFormatter3;
    // autowired on constructors
    @Autowired
    public FooService(FooFormatter3 fooFormatter3) {
        this.fooFormatter3 = fooFormatter3;
    }

    @Autowired(required = false)
    private FooFormatter4 fooFormatter4;

    // autowiring by custom qualifier
    @Autowired
    @FormatterType("Foo")
    //@Qualifier("barFormatter") // When there are multiple beans of the same type, it is a good idea to use @Qualifier to avoid ambiguity
    private Formatter formatter;
}
