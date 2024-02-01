package com.spring.studies.wiring;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.File;

public class ResourceAnnotationSetterInjectionExample {

    // Match by Name
    private File defaultFile;

    @Resource(name = "namedFile")
    protected void setDefaultFile(File file){
        this.defaultFile = defaultFile;
    }

    // Match by Type
    private File defaultFile2;

    @Resource
    protected void setDefaultFile2(File file){
        this.defaultFile2 = file;
    }

    // Match by Qualifier
    private File arbDependency;
    private File anotherArbDependency;

    @Resource
    @Qualifier("namedFile")
    public void setArbDependency(File arbDependency) {
        this.arbDependency = arbDependency;
    }

    @Resource
    @Qualifier("defaultFile")
    public void setAnotherArbDependency(File anotherArbDependency) {
        this.anotherArbDependency = anotherArbDependency;
    }
}
