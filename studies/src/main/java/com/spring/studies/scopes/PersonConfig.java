package com.spring.studies.scopes;

import org.springframework.context.annotation.*;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
@ComponentScan("com.spring.studies.scopes")
public class PersonConfig {

    @Bean
    @Scope("singleton")
    //@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Person personSingleton(){
        return new Person();
    }

    @Bean
    @Scope("prototype")
    public Person personPrototype(){
        return new Person();
    }

    @Bean
    @RequestScope
    public HelloMessageGenerator requestScopedBean(){
        return new HelloMessageGenerator();
    }

    @Bean
    @SessionScope
    public HelloMessageGenerator sessionScopedBean(){
        return new HelloMessageGenerator();
    }

    @Bean
    //@ApplicationScope
    @Scope(value = WebApplicationContext.SCOPE_APPLICATION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public HelloMessageGenerator applicationScopedBean(){
        return new HelloMessageGenerator();
    }

    @Bean
    @Scope(scopeName = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public HelloMessageGenerator websocketScopedBean(){
        return new HelloMessageGenerator();
    }

}
