package com.spring.studies;

import com.spring.studies.ioc.constructor.Person;
import com.spring.studies.ioc.field.Cars;
import com.spring.studies.ioc.setter.Employee;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class StudiesApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");

        // Now, we call setter injection
        System.out.println("-----setter injection-----");
        Employee employee = context.getBean("employeeId",Employee.class);
        System.out.println(employee);

        // Now, we call constructor injection
        System.out.println("-----constructor injection-----");
        Person person = context.getBean("personId", Person.class);
        System.out.println(person);

        // Now, we call field injection
        System.out.println("-----field injection-----");
        Cars cars = context.getBean("carId", Cars.class);
        System.out.println(cars);
    }

}
