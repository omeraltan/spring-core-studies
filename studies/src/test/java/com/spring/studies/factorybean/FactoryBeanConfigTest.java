package com.spring.studies.factorybean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:appcontext.xml"})
public class FactoryBeanConfigTest {

    @Autowired
    private Tool tool;

    @Test
    public void testConstructWorkerByXml(){
        assertThat(tool.getId(), equalTo(1));
    }
}
