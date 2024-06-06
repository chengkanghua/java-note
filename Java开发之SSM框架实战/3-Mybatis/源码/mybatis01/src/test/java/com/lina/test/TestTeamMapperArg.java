package com.lina.test;

import com.lina.mapper.TeamMapper;
import com.lina.pojo.QueryVO;
import com.lina.pojo.Team;
import com.lina.util.MybatisUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: TestTeamMapperArg
 * 测试输入映射:多个参数
 * @author wanglina
 * @version 1.0
 */
public class TestTeamMapperArg {
    private TeamMapper teamMapper= MybatisUtil.getSqlSession().getMapper(TeamMapper.class);

    @Test
    public void test01(){
        List<Team> teams = teamMapper.queryByRange1(1004, 1010);
        teams.forEach(team -> System.out.println(team));
    }

    @Test
    public void test02(){
        List<Team> teams = teamMapper.queryByRange2(1005, 1011);
        teams.forEach(team -> System.out.println(team));
    }

    @Test
    public void test03(){
        Map<String, Object> map=new HashMap<>();
        map.put("min",1010);
        map.put("max",1015);
        List<Team> teams = teamMapper.queryByRange3(map);
        teams.forEach(team -> System.out.println(team));
    }

    @Test
    public void test04(){
        QueryVO vo=new QueryVO();
        vo.setLocation("洛杉矶");
        vo.setName("%球队%");
        vo.setMin(1001);
        vo.setMax(1111);
        List<Team> teams = teamMapper.queryByCondition(vo);
        teams.forEach(team -> System.out.println(team));
    }

    @Test
    public void test05(){
        System.out.println("根据球队名称查询：");
        List<Team> teams = teamMapper.queryByName("lina的球队");
        teams.forEach(team -> System.out.println(team));
        System.out.println("根据球队位置查询：");
        List<Team> teams2 = teamMapper.queryByLocation("洛杉矶");
        teams2.forEach(team -> System.out.println(team));
    }
    @Test
    public void test06(){
        System.out.println("根据球队名称查询：");
        List<Team> teams = teamMapper.queryByFiled("teamName","lina的球队");
        teams.forEach(team -> System.out.println(team));
        System.out.println("根据球队位置查询：");
        List<Team> teams2 = teamMapper.queryByFiled("location","洛杉矶");
        teams2.forEach(team -> System.out.println(team));
    }
    @Test
    public void test07(){
        int count = teamMapper.getCount();
        System.out.println("总共的行数："+count);
    }
    @Test
    public void test08(){
        Map<String, Object> map = teamMapper.getTwoColumn();
        System.out.println(map);
    }
    @Test
    public void test09(){
        List<Map<String, Object>> list = teamMapper.getTwoColumnList();
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }

    }

    @Test
    public void test10(){
        List<Team> teams = teamMapper.queryAll2();
        teams.forEach(team-> System.out.println(team));
    }

}
