package com.lina.test;

import com.lina.util.MybatisUtil;
import org.junit.Test;
import org.lina.mapper.TeamMapper;
import org.lina.pojo.Team;
import org.lina.pojo.TeamExample;

import java.util.List;

/**
 * ClassName: TestGenerator
 * 测试反向生成的内容
 * @author wanglina
 * @version 1.0
 */
public class TestGenerator {
    private TeamMapper mapper= MybatisUtil.getSqlSession().getMapper(TeamMapper.class);
    @Test
    public void test1(){
        Team team = mapper.selectByPrimaryKey(1001);
        System.out.println(team);
    }
    @Test
    public void test2(){
        Team team=new Team();
        team.setTeamName("lina-test");
        team.setLocation("bj");
        int i = mapper.insert(team);
        MybatisUtil.getSqlSession().commit();
        System.out.println(i);
    }
    @Test
    public void test3(){
        //可以理解为为多条件、排序等服务的类
        TeamExample example=new TeamExample();
        //理解为盛放条件的容器
        TeamExample.Criteria criteria = example.createCriteria();
        //向容器中添加条件
        criteria.andTeamNameLike("人");
        criteria.andTeamIdBetween(1001,1100);
        //排序
        example.setOrderByClause("teamName desc");
        List<Team> teams = mapper.selectByExample(example);
        for (Team team : teams) {
            System.out.println(team);
        }
    }
}
