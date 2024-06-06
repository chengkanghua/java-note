package com.lina.test;

import com.lina.dao.TeamDao;
import com.lina.pojo.Team;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;
import java.util.List;
import java.util.Map;

public class Test01 {
    ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
    @Test
    public void testGetMany() {
        TeamDao teamDao = (TeamDao) ac.getBean("teamDao");
        Map<String, Object> many = teamDao.getMany();
        for (String s : many.keySet()) {
            System.out.println(s+"-----"+many.get(s));
        }

    }
    @Test
    public void testGetCount() {
        TeamDao teamDao = (TeamDao) ac.getBean("teamDao");
        int count = teamDao.getCount();
        System.out.println("count="+count);
    }
    @Test
    public void testFindAll(){
        TeamDao teamDao= (TeamDao) ac.getBean("teamDao");
        List<Team> byAll = teamDao.findByAll();
        for (Team team : byAll) {
            System.out.println(team);
        }
    }
    @Test
    public void testFindById(){
        TeamDao teamDao= (TeamDao) ac.getBean("teamDao");
        Team team = teamDao.findById(1);
        System.out.println(team);
    }
    @Test
    public void test04(){

        TeamDao teamDao= (TeamDao) ac.getBean("teamDao");

        int insert = teamDao.del(4);
        System.out.println("删除数据的结果是："+insert);
    }
    @Test
    public void test03(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        TeamDao teamDao= (TeamDao) ac.getBean("teamDao");
        Team team=new Team();
        team.settId(2);
        team.settName("勇士");
        team.setLocation("金州");
        int insert = teamDao.update(team);
        System.out.println("修改数据的结果是："+insert);
    }
    @Test
    public void test02(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        TeamDao teamDao= (TeamDao) ac.getBean("teamDao");
        Team team=new Team();
        team.settName("快船");
        team.setLocation("洛杉矶");
        int insert = teamDao.insert(team);
        System.out.println("插入数据的结果是："+insert);
    }

    @Test
    public void test01() throws PropertyVetoException {
        //创建数据源
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/springJDBC?serverTimezone=Asia/Shanghai&characterEncoding=utf8&useUnicode=true&useSSL=false");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        //使用JdbcTemplate
        JdbcTemplate template=new JdbcTemplate(dataSource);
        String sql="INSERT INTO `springjdbc`.`team` ( `tname`, `location`) VALUES (?,?)";
        int update = template.update(sql,"勇士","金州");
        System.out.println("插入数据的结果是："+update);
    }
}
