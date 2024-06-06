package com.lina.test;

import com.lina.service.NBAService;
import com.lina.service.TeamService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        TeamService teamService= (TeamService) ac.getBean("teamService");
        teamService.add(1001,"湖人队");
        System.out.println("-----------------");
        boolean update = teamService.update(88);
        System.out.println("update的结果="+update);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        NBAService nbaService= (NBAService) ac.getBean("nbaService");
        nbaService.add(1002,"勇士");
        boolean update1 = nbaService.update(123);
        System.out.println("update的结果="+update1);
    }
}
