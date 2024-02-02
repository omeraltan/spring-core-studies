package com.spring.studies.scopes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
public class ScopeTypesTest {
    private static final String NAME = "John Smith";
    private static final String NAME_OTHER = "Anna Jones";
    @Test
    public void givenSingletonScope_whenSetName_thenEqualNames(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appcontext.xml");

        Person personSingletonA = (Person) applicationContext.getBean("personSingleton");
        Person personSingletonB = (Person) applicationContext.getBean("personSingleton");
        personSingletonA.setName(NAME);
        Assert.assertEquals(NAME, personSingletonB.getName());
        ((AbstractApplicationContext) applicationContext).close();
    }

    @Test
    public void givenPrototypeScope_whenSetNames_thenDifferentNames(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appcontext.xml");

        Person personPrototypeA = (Person) applicationContext.getBean("personPrototype");
        Person personPrototypeB = (Person) applicationContext.getBean("personPrototype");

        personPrototypeA.setName(NAME);
        personPrototypeB.setName(NAME_OTHER);

        Assert.assertEquals(NAME, personPrototypeA.getName());
        Assert.assertEquals(NAME_OTHER, personPrototypeB.getName());

        ((AbstractApplicationContext) applicationContext).close();
    }

}
