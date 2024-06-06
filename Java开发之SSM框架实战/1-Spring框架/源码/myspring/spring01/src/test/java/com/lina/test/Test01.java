package com.lina.test;

import com.lina.pojo.Team;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.SpringProperties;
import org.springframework.core.io.FileSystemResource;

import java.util.Date;
import java.util.logging.XMLFormatter;

public class Test01 {
    @Test
    public void test02(){
        String springConfig="application.xml";
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(springConfig);// 容器创建完毕对象就已经创建完毕
        //获取容器中的对象
        Team t1= (Team) applicationContext.getBean("team");
        Team t2= (Team) applicationContext.getBean("team2");
        System.out.println(t1);
        System.out.println(t2);
        Team t11= (Team) applicationContext.getBean("team");
        Team t22= (Team) applicationContext.getBean("team2");
        System.out.println(t11);
        System.out.println(t22);
        applicationContext.close();
    }


    @Test
    public void test01(){
        //原有的创建对象的方式：程序员自己创建对象
       //Team team=new Team();
        String springConfig="application.xml";
        //获取spring容器
        //方式1：
        //BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("D:\\workspace\\ideaWorkspace\\myspring\\spring01\\src\\main\\resources\\application.xml"));
        //beanFactory.getBean("team");//根据ID从IOC容器获取对象
        //方式2：
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(springConfig);// 容器创建完毕对象就已经创建完毕
        //获取容器中对象
        Team team= (Team) applicationContext.getBean("team");
        //容器中其他API
        int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
        System.out.println("spring容器中的对象的个数="+beanDefinitionCount);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("容器中的所有bean对象的名称：");
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        //获取非自定义的对象
        Date date= (Date) applicationContext.getBean("date");
        System.out.println(date);
        //方式3：
        //ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\workspace\\ideaWorkspace\\myspring\\spring01\\src\\main\\resources\\application.xml");
    }
}
