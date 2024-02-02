package com.spring.studies.injecting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsBean {
//    @Autowired
//    private List<String> nameList;
//
//    public void printNameList(){
//        System.out.println(nameList);
//    }

//    private Set<String> nameSet;
//
//    public CollectionsBean(Set<String> strings){
//        this.nameSet = strings;
//    }
//
//    public void printNameSet(){
//        System.out.println(nameSet);
//    }

//    private Map<Integer, String> nameMap;
//
//    @Autowired
//    public void setNameMap(Map<Integer, String> nameMap){
//        this.nameMap = nameMap;
//    }
//
//    public void printNameMap(){
//        System.out.println(nameMap);
//    }

    @Autowired
    @Qualifier("CollectionsBeans")
    private List<MyBean> beanList;

    public void printBeanList(){
        System.out.println(beanList);
    }



}
