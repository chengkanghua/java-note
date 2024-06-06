package com.lina.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lina.mapper.TeamMapper;
import com.lina.pojo.QueryTeamVO;
import com.lina.pojo.Team;
import com.lina.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName: TestSQL
 *
 * @author wanglina
 * @version 1.0
 */
public class TestSQL {
    private TeamMapper teamMapper= MybatisUtil.getSqlSession().getMapper(TeamMapper.class);
    private SqlSession sqlSession=MybatisUtil.getSqlSession();
    @Test
    public void test1(){
        QueryTeamVO vo=new QueryTeamVO();
        vo.setName("人");
        vo.setEndTime(new Date());
        vo.setLocation("加利福尼亚州洛杉矶");
        List<Team> teams = teamMapper.queryByVO(vo);
        for (Team team : teams) {
            System.out.println(team);
        }
    }
    @Test
    public void test2(){
        Team team=new Team();
        team.setTeamId(1055);
        team.setTeamName("lina");
        int update = teamMapper.update1(team);
        MybatisUtil.getSqlSession().commit();
        System.out.println(update);
    }

    @Test
    public void test3(){
        List<Team> list=new ArrayList<>();
        for(int i=1;i<=3;i++){
            Team team=new Team();
            team.setTeamName("lina"+i);
            team.setLocation("bj"+i);
            list.add(team);
        }
        teamMapper.addList(list);
        MybatisUtil.getSqlSession().commit();
    }
    @Test
    public void test4() {
        List<Integer> list = new ArrayList<>();
        list.add(1109);
        list.add(1110);
        list.add(1111);
        teamMapper.delList(list);
        MybatisUtil.getSqlSession().commit();
    }
    @Test
    public void test5() {
        // PageHelper.startPage 必须紧邻查询语句，而且只对第一条查询语句生效
        PageHelper.startPage(2,5);
        List<Team> teams = teamMapper.queryAll();//查询语句结尾不能有分号
        teams.forEach(team-> System.out.println(team));
        PageInfo<Team> info=new PageInfo<>(teams);
        System.out.println("分页信息如下：");
        System.out.println("当前页:"+info.getPageNum());
        System.out.println("总页数:"+info.getPages());
        System.out.println("前一页:"+info.getPrePage());
        System.out.println("后一页:"+info.getNextPage());
        System.out.println("navigatepageNums:"+info.getNavigatepageNums());
        for (int num : info.getNavigatepageNums()) {
            System.out.println(num);
        }
    }
}
