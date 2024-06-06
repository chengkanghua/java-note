package com.lina.test;

import com.github.pagehelper.PageInfo;
import com.lina.mapper.TeamMapper;
import com.lina.pojo.Team;
import com.lina.service.TeamService;
import com.lina.vo.QueryVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class Test01 {
    @Resource
    private TeamMapper teamMapper;

    @Resource
    private TeamService teamService;

    @Test
    public void test(){
        Team team = teamMapper.selectByPrimaryKey(1001);
        System.out.println(team);
    }
    @Test
    public void test02(){
        QueryVO vo=new QueryVO();
        vo.setChineseName("人");
        vo.setTeamName("A");
        vo.setArea(1);
        PageInfo<Team> teamPageInfo = teamService.queryByPage(1, 5, vo);
        System.out.println(teamPageInfo);
    }
}
