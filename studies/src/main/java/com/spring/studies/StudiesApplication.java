package com.spring.studies;

import com.spring.studies.autowiringofgeneric.CustomConfiguration;
import com.spring.studies.autowiringofgeneric.Vehicle;
import com.spring.studies.config.annobased.Car;
import com.spring.studies.config.annobased.Config;
import com.spring.studies.injecting.CollectionConfig;
import com.spring.studies.injecting.CollectionsBean;
import com.spring.studies.ioc.constructor.Person;
import com.spring.studies.ioc.field.Cars;
import com.spring.studies.ioc.setter.Employee;
import com.spring.studies.primary.ConfigPrimary;
import com.spring.studies.primary.Information;
import com.spring.studies.primary.Manager;
import com.spring.studies.primary.ManagerService;
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
        AnnotationConfigApplicationContext contextAnnotationBased = new AnnotationConfigApplicationContext(Config.class);
        Car car = contextAnnotationBased.getBean(Car.class);
        System.out.println(car.getEngine());
        System.out.println(car.getTransmission());

        // Now, we call @Primary annotation example
        System.out.println("-----@Primary annotation-----");
        AnnotationConfigApplicationContext contextPrimary = new AnnotationConfigApplicationContext(ConfigPrimary.class);
        Information info = contextPrimary.getBean(Information.class);
        System.out.println(info);

        // Now, we call @Primary With @Component example
        System.out.println("-----@Primary with @Component-----");
        ManagerService service = contextPrimary.getBean(ManagerService.class);
        Manager manager = service.getManager();
        System.out.println(manager.getManagerName());

          // Now we call injecting collection
//        System.out.println("-----Injecting Collection-----");
//        ApplicationContext InjectionCollection = new AnnotationConfigApplicationContext(CollectionConfig.class);
//        CollectionsBean collectionsBean = InjectionCollection.getBean(CollectionsBean.class);
//        collectionsBean.printNameList();

        // Now we call injecting collection set
//        System.out.println("-----Injecting Collection Set-----");
//        ApplicationContext InjectionCollection = new AnnotationConfigApplicationContext(CollectionConfig.class);
//        CollectionsBean collectionsBean = InjectionCollection.getBean(CollectionsBean.class);
//        collectionsBean.printNameSet();

//        // Now we call injecting collection map
//        System.out.println("-----Injecting Collection Map-----");
//        ApplicationContext InjectionCollection = new AnnotationConfigApplicationContext(CollectionConfig.class);
//        CollectionsBean collectionsBean = InjectionCollection.getBean(CollectionsBean.class);
//        collectionsBean.printNameMap();

        // Now we call injecting collection map
        System.out.println("-----Injecting Collection Reference-----");
        ApplicationContext InjectionCollection = new AnnotationConfigApplicationContext(CollectionConfig.class);
        CollectionsBean collectionsBean = InjectionCollection.getBean(CollectionsBean.class);
        collectionsBean.printBeanList();

    }

}
