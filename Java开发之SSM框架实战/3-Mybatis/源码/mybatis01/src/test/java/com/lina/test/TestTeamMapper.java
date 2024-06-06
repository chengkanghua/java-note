package com.lina.test;

import com.lina.mapper.TeamMapper;
import com.lina.pojo.Team;
import com.lina.util.MybatisUtil;
import org.junit.Test;

import java.util.Date;

/**
 * ClassName: TestTeamMapper
 * 测试类
 * @author wanglina
 * @version 1.0
 */
public class TestTeamMapper {
    //通过动态代理的方式产生实现类
   private TeamMapper teamMapper= MybatisUtil.getSqlSession().getMapper(TeamMapper.class);

   @Test
   public void testAdd(){
       Team team=new Team();
       team.setLocation("杭州");
       team.setTeamName("lina的球队");
       team.setCreateTime(new Date());
       int add = teamMapper.add(team);
       MybatisUtil.getSqlSession().commit();
       System.out.println(add);
       System.out.println("新增的球队ID:"+team.getTeamId());
   }

    @Test
    public void testQueryByID(){
        TeamMapper teamMapper= MybatisUtil.getSqlSession().getMapper(TeamMapper.class);
        Team team = teamMapper.queryById(1025);
        System.out.println(team);
    }

    @Test
    public void testDel(){
         TeamMapper teamMapper= MybatisUtil.getSqlSession().getMapper(TeamMapper.class);
        int del = teamMapper.del(1045);
        MybatisUtil.getSqlSession().commit();
        System.out.println(del);
    }

}
