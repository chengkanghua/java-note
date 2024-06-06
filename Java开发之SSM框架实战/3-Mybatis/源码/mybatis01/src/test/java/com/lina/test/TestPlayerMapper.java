package com.lina.test;

import com.lina.mapper.PlayerMapper;
import com.lina.mapper.TeamMapper;
import com.lina.pojo.Player;
import com.lina.pojo.Team;
import com.lina.util.MybatisUtil;
import org.junit.Test;

import java.util.List;

/**
 * ClassName: TestPlayerMapper
 * 测试类
 * @author wanglina
 * @version 1.0
 */
public class TestPlayerMapper {
    private PlayerMapper playerMapper= MybatisUtil.getSqlSession().getMapper(PlayerMapper.class);
    private TeamMapper teamMapper=MybatisUtil.getSqlSession().getMapper(TeamMapper.class);
    @Test
    public void test1(){
        Player player = playerMapper.queryById(1);
        System.out.println(player);
    }
    @Test
    public void test2(){
        Player player = playerMapper.queryById1(1);
        System.out.println(player);
    }
    @Test
    public void test3(){
        Player player = playerMapper.queryById2(1);
        System.out.println(player);
    }
    @Test
    public void test4(){
        Player player = playerMapper.queryById3(1);
        System.out.println(player);
    }
    @Test
    public void test6(){
        List<Player> players = playerMapper.queryByTeamId(1025);
        players.forEach(player -> System.out.println(player));
    }

    @Test
    public void test5(){
        Team team = teamMapper.queryById1(1025);
        System.out.println(team);
        List<Player> playerList = team.getPlayerList1();
        System.out.println("该球队的球员个数："+playerList.size());
        playerList.forEach(player -> System.out.println(player));
    }
    @Test
    public void test7(){
        Team team = teamMapper.queryById2(1025);
        System.out.println(team);
        List<Player> playerList = team.getPlayerList2();
        System.out.println("该球队的球员个数："+playerList.size());
        playerList.forEach(player -> System.out.println(player));
    }
}
