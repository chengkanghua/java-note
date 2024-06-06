package com.lina.service;

import com.lina.dao.TeamDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "teamService1")//使用在service层
public class TeamService {

    @Autowired(required = false) //自动装配/注入 -默认按类型自动装配 byType;required = false如果容器没有合适的对象自动注入，赋值为null
    //@Qualifier("teamDao") //搭配Qualifier使用的时候就是按名称自动装配 byName
    private TeamDao teamDao;//=new TeamDao();

    public void add(){
        teamDao.add();
        System.out.println("TeamService-----add--------");
    }

    public TeamService() {
        System.out.println("TeamService---默认构造方法");
    }



    public TeamService(TeamDao teamDao) {
        this.teamDao = teamDao;
    }

    public TeamDao getTeamDao() {
        return teamDao;
    }
    @Autowired(required = false)
    public void setTeamDao(TeamDao teamDao) {
        System.out.println("TeamService-----setTeamDao");
        this.teamDao = teamDao;
    }
}
