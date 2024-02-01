package com.spring.studies.wiring;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;

public class InjectAnnotationFieldInjectionExample {

    // Match by Type
    @Inject
    private ArbitraryDependency fieldInjectDependency;

    // Match by Qualifier
    @Inject
    @Qualifier("defaultFile")
    private ArbitraryDependency defaultDependency;

    @Qualifier("namedFile")
    private ArbitraryDependency namedDependency;

    // Match by Name
    @Inject
    @Named("yetAnotherArbitraryDependency")
    private ArbitraryDependency yetAnotherFieldInjectDependency;

}

class ArbitraryDependency{
    private final String label = "Arbitrary Dependency";

    @Override
    public String toString() {
        return label;
    }
}

class AnotherArbitraryDependency extends ArbitraryDependency{
    private final String label = "Another Arbitrary Dependency";

    @Override
    public String toString() {
        return label;
    }
}

class YetAnotherArbitraryDependency extends ArbitraryDependency{
    private final String label = "Yet Another Arbitrary Dependency";

    @Override
    public String toString() {
        return label;
    }
}

