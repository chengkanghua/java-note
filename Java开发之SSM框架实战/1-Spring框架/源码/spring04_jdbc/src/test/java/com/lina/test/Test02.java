package com.lina.test;

import com.lina.pojo.Team;
import com.lina.service.TeamService;
import com.sun.xml.internal.txw2.TXW;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        TeamService teamService = (TeamService) ac.getBean("teamService");
        Team team=new Team();
        team.settName("凯尔特人");
        team.setLocation("波士顿");
        int num=teamService.insert(team);
        System.out.println("num="+num);
    }
}
