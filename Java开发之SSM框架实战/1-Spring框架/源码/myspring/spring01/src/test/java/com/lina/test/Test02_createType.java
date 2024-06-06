package com.lina.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02_createType {

    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("createType.xml");
    }
}
