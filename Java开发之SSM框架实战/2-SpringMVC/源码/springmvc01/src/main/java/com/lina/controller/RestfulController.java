package com.lina.controller;

import com.lina.pojo.Team;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RestfulController {
    private static List<Team> teamList;
    static {
        teamList=new ArrayList<>(3);
        for(int i=1;i<=3;i++){
            Team team=new Team();
            team.setTeamId(1000+i);
            team.setTeamName("湖人"+i);
            team.setLocation("洛杉矶"+i);
            teamList.add(team);
        }
    }

    @RequestMapping(value = "teams",method = RequestMethod.GET)
    @ResponseBody
    public List<Team> getAll(){
        System.out.println("查询所有GET---发起的请求-----------");
        return teamList;
    }

    @RequestMapping(value = "/team/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Team getOne(@PathVariable("id") int teamId){
        System.out.println(teamId);
        System.out.println("查询单个GET---发起的请求-----------");
        for (Team team : teamList) {
            if(team.getTeamId()==teamId){
                return team;
            }
        }
        return null;
    }

    @RequestMapping(value = "team",method = RequestMethod.POST)
    @ResponseBody
    public String  add(Team team){
        System.out.println("添加POST---发起的请求-----------");
       teamList.add(team);
        return "201";
    }

    @RequestMapping(value = "team/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public String  update(@PathVariable("id")int id, Team newTeam){
        System.out.println("添加POST---发起的请求-----------");
        System.out.println(id);
        System.out.println(newTeam);
        for (Team team : teamList) {
            if(team.getTeamId()==id){
                team.setTeamName(newTeam.getTeamName());
                team.setLocation(newTeam.getLocation());
                return "204";
            }
        }
        return "404";
    }

    @RequestMapping(value = "team/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String  DEL(@PathVariable("id")int id){
        System.out.println("删除DELETE---发起的请求-----------");
        for (Team team : teamList) {
            if(team.getTeamId()==id){
                teamList.remove(team);
                return "200";
            }
        }
        return "500";
    }



    @RequestMapping("hello")
    public String hello(){
        return "restful";
    }
}
