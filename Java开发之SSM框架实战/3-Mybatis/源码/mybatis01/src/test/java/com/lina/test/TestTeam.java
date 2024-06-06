package com.lina.test;

import com.lina.pojo.Team;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;
import java.util.List;

/**
 * ClassName: TestTeam
 * 测试类
 * @author wanglina
 * @version 1.0
 */
public class TestTeam {

    private String resource="mybatis.xml"; //画的图纸
    private SqlSession sqlSession;
    @Test
    public void testDel(){
        int num = sqlSession.delete("com.lina.pojo.Team.del", 1049);
        sqlSession.commit();
        System.out.println(num);
    }
    @Test
    public void testUpdate(){
        Team team=sqlSession.selectOne("com.lina.pojo.Team.queryById",1049);
        team.setTeamName("linawang的球队");
        team.setLocation("洛杉矶");
        int num = sqlSession.update("com.lina.pojo.Team.update", team);
        sqlSession.commit();
        System.out.println(num);
    }
    @Test
    public void testAdd(){
        Team team=new Team();
        team.setTeamName("lina的球队");
        team.setLocation("北京");
        team.setCreateTime(new Date());
        int num = sqlSession.insert("com.lina.pojo.Team.add", team);//增删改必须手动提交事务
        sqlSession.commit();//手动提交事务
        System.out.println(num);
    }

    @Test
    public void test02(){
        System.out.println("test02---------");
        Team team = sqlSession.selectOne("com.lina.pojo.Team.queryById", 1001);
        System.out.println(team);
    }

    @Before //表示该方法在执行测试方法之前先执行
    public void before(){
       // System.out.println("before");
        //读取配置文件
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建工厂
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);//根据图纸创建出了工厂
        //获取连接
        sqlSession= factory.openSession();
    }
    @After//表示该方法在执行测试方法之后执行
    public void after(){
        //System.out.println("after");
        sqlSession.close();
    }


    /*@Test
    public void test01(){
        SqlSession sqlSession=null;
        try {
            //读取配置文件
            Reader reader = Resources.getResourceAsReader(resource);
            //创建工厂
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);//根据图纸创建出了工厂
            //获取连接
            sqlSession= factory.openSession();
            //执行sql
            List<Team> list = sqlSession.selectList("com.lina.pojo.Team.queryAll");
            //遍历结果
            for (Team team : list) {
                System.out.println(team);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            sqlSession.close();
        }
    }*/
}
