package com.spring.studies.ioc;


/**
 *      The advantage of this architecture are:
 *      1. decoupling the execution of a task from its implementation
 *      2. making it easier to switch between different implementations
 *      3. greater modularity of a program
 *      4. greater ease in testing a program by isolating a component or mocking its dependencies
 *         and allowing components to communicate through contracts
 *
 *      We can achieve Inversion of Control through various mechanisms such as:
 *      1. Strategy Design Pattern
 *      2. Service Locator Pattern
 *      3. Factory Pattern
 *      4. Dependency Injection (DI)
 *
 *      Note1: The Spring documentation recommends using constructor-based injection for mandatory dependencies
 *             and setter-based injection for optional ones.
 *
 *      @Configuration
 *      @Bean
 *      @Qualifier:
 */
