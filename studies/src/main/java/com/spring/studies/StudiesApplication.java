package com.spring.studies;

import com.spring.studies.config.annobased.Car;
import com.spring.studies.config.annobased.Config;
import com.spring.studies.ioc.constructor.Person;
import com.spring.studies.ioc.field.Cars;
import com.spring.studies.ioc.setter.Employee;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication // -> This single annotation is equivalent to using @Configuration, @EnableAutoConfiguration, @ComponentScan
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

        // Now, we call annotation based injection
        System.out.println("-----annotation based injection-----");
        ApplicationContext contextAnnotationBased = new AnnotationConfigApplicationContext(Config.class);
        Car car = contextAnnotationBased.getBean(Car.class);
        System.out.println(car.getEngine());
        System.out.println(car.getTransmission());
    }

}
