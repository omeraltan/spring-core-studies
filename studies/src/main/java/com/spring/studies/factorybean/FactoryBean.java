package com.spring.studies.factorybean;

public interface FactoryBean {
    //T getObject() throws Exception;
    //Class<?> getObjectType();
    //boolean isSingleton();

    /**
     *
     *      getObject()     -> returns an object produced by factory, and this is the object that
     *                         will be used by Spring container
     *      getObjectType() -> returns the type of object that this FactoryBean produces
     *      isSingletion()  -> denotes if the object produced by this FactoryBean is a singleton
     *
     */
}
