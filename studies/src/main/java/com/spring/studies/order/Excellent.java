package com.spring.studies.order;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Excellent implements Rating{
    @Override
    public int getRating() {
        return 1;
    }
}

@Component
@Order(2)
class Good implements Rating{

    @Override
    public int getRating() {
        return 2;
    }
}

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
class Average implements Rating{

    @Override
    public int getRating() {
        return 3;
    }
}
