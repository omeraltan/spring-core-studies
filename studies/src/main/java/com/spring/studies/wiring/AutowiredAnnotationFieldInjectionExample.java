package com.spring.studies.wiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutowiredAnnotationFieldInjectionExample {

    // Match by Type
    @Autowired
    private ArbitraryDependency2 fieldDependency;

    // Match by Qualifier
    @Autowired
    @Qualifier("autowiredFielddependency")
    private FieldDependency fieldDependency1;

    @Autowired
    @Qualifier("anotherAutowiredFielddependency")
    private FieldDependency fieldDependency2;


}

class ArbitraryDependency2{
    private final String label = "Arbitrary Dependency";

    @Override
    public String toString() {
        return label;
    }
}

class FieldDependency{
    private final String label = "Field Dependency";

    @Override
    public String toString() {
        return label;
    }
}
