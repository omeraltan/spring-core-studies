package com.spring.studies.stereotype;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class StereotypeExample {
}
@Controller
class ControllerExample{ }
@Service
class ServiceExample{ }

@Repository
class RepositoryExample{ }

@Component
class ComponentExample{ }
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Component
@interface CustomComponent{ }

@CustomComponent
class CustomComponentExample{ }
