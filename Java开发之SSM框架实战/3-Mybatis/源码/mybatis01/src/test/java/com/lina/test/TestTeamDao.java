package com.lina.test;
import com.lina.dao.TeamDao;
import com.lina.dao.TeamDaoImpl;
import com.lina.pojo.Team;
import org.junit.Test;
import java.util.Date;
import java.util.List;

/**
 * ClassName: TestTeam
 * 测试类
 * @author wanglina
 * @version 1.0
 */
public class TestTeamDao {
    private TeamDao teamDao=new TeamDaoImpl();
    @Test
    public void testDel(){
        int num = teamDao.del(1048);
        System.out.println(num);
    }
    @Test
    public void testUpdate(){
        Team team = teamDao.queryById(1052);
        team.setTeamName("lina");
        team.setLocation("bj");
        int num = teamDao.update(team);
        System.out.println(num);
    }
    @Test
    public void testAdd(){
        Team team=new Team();
        team.setTeamName("lina的球队");
        team.setLocation("北京");
        team.setCreateTime(new Date());
        int num = teamDao.add( team);
        System.out.println(num);
    }

    @Test
    public void test02(){
        Team team = teamDao.queryById(1001);
        System.out.println(team);
    }
    @Test
    public void test01(){
        List<Team> teams = teamDao.queryAll();
        teams.forEach(team -> System.out.println(team));
    }

}
