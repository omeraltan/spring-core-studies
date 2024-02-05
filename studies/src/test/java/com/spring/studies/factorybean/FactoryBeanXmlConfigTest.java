package com.spring.studies.factorybean;

import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:appcontext.xml"})
public class FactoryBeanXmlConfigTest {

    @Resource(name = "&tool") // To access the FactoryBean, you just need to add a "&" before the bean name.
    private ToolFactory toolFactory;

    @Test
    public void testConstructWorkerByXml(){
        assertThat(toolFactory.getFactoryId(), equalTo(9090));
    }
}
