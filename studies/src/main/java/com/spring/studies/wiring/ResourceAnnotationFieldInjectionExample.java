package com.spring.studies.wiring;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.File;

public class ResourceAnnotationFieldInjectionExample {

    // Match by Name
    @Resource(name = "namedFile")
    private File defaultFile;

    // Match by Type
    @Resource
    private File defaultFile2;

    // Match by Qualifier
    @Resource
    @Qualifier("defaultFile")
    private File dependency1;

    @Resource
    @Qualifier("namedFile")
    private File dependency2;
}
