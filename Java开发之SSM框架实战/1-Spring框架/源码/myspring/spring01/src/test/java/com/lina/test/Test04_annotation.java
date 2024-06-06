package com.lina.test;
import com.lina.controller.TeamController;
import com.lina.pojo.Team;
import com.lina.service.TeamService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04_annotation {


    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("annotation.xml");
        /*Team team= (Team) ac.getBean("team");
        System.out.println(team);

        TeamService teamService= (TeamService) ac.getBean("teamService");
        teamService.add();*/

        TeamController teamController= (TeamController) ac.getBean("teamController");
        teamController.add();


    }
}
