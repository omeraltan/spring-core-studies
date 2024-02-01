package com.spring.studies.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public interface Manager {
    String getManagerName();
}

@Component
class DepartmentManager implements Manager{

    @Override
    public String getManagerName() {
        return "Department manager";
    }
}

@Component
@Primary
class Generalmanager implements Manager{

    @Override
    public String getManagerName() {
        return "General manager";
    }
}
