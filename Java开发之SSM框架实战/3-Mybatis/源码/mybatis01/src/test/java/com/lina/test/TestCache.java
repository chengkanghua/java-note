package com.lina.test;

import com.lina.pojo.Team;
import com.lina.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * ClassName: TestCache
 * 测试mybatis缓存
 * @author wanglina
 * @version 1.0
 */
public class TestCache {
    private SqlSession sqlSession= MybatisUtil.getSqlSession();
    //测试一级缓存：自动开启，sqlSession级别的缓存
    @Test
    public void test1() {
        Team t1=sqlSession.selectOne("com.lina.mapper.TeamMapper.queryById",1001);//第一次查询，先查缓存，此时缓存中没有，继续向数据库发送查询语句
        System.out.println(t1);//查询完毕之后数据被自动存入缓存区域
        Team t2=sqlSession.selectOne("com.lina.mapper.TeamMapper.queryById",1001);//第二次查询，因为缓存中已经有了该数据，可以直接获取，不需要发送查询语句
        System.out.println(t2);
        MybatisUtil.closeSqlSession();//关闭连接，缓存清空
        sqlSession=MybatisUtil.getSqlSession();//再次获取连接，此时缓存为空
        Team t3=sqlSession.selectOne("com.lina.mapper.TeamMapper.queryById",1001);//新连接下第一次查询，肯定发送查询语句
        System.out.println(t3);//查询完毕之后数据被自动存入缓存区域
        int num=sqlSession.delete("com.lina.mapper.TeamMapper.del",10000);
        sqlSession.commit();//提交之后缓存被整个清空
        System.out.println("删除结果："+num);
        Team t4=sqlSession.selectOne("com.lina.mapper.TeamMapper.queryById",1001);//第二次查询，因为缓存已经被上一次的提交清空了，所以还是需要发送查询语句
        System.out.println(t4);
        sqlSession.close();
    }

    /*
     测试2级缓存:前提3点：全局配置文件开启了二级缓存；TeamMapper.xml配置了缓存；Team实体类实现了序列化接口
     */
    @Test
    public void test2() {
        SqlSession sqlSession1 = MybatisUtil.getSqlSession();
        Team t1 = sqlSession1.selectOne("com.lina.mapper.TeamMapper.queryById", 1001);//先查缓存，没有，先数据库，查询完毕写入二级缓存
        System.out.println(t1);
        MybatisUtil.closeSqlSession();//关闭连接，一级缓存清空，二级缓存存在

        SqlSession sqlSession2 = MybatisUtil.getSqlSession();
        Team t2 = sqlSession2.selectOne("com.lina.mapper.TeamMapper.queryById", 1001);//先查缓存，有，直接获取，不需要查询数据库
        System.out.println(t2);
        MybatisUtil.closeSqlSession();//关闭连接，一级缓存清空，二级缓存存在

        SqlSession sqlSession3 = MybatisUtil.getSqlSession();
        int num = sqlSession3.delete("com.lina.mapper.TeamMapper.del", 10000);//删除成功
        System.out.println("删除的结果：" + num);
        sqlSession3.commit();//提交之后清空二级缓存
        MybatisUtil.closeSqlSession();//关闭连接，缓存清空

        SqlSession sqlSession4 = MybatisUtil.getSqlSession();
        Team t3 = sqlSession4.selectOne("com.lina.mapper.TeamMapper.queryById", 1001);////先查缓存，曾经有，但是上一个提交已经清空了缓存，所以只能去数据库中查询，查询完毕写入二级缓存
        System.out.println(t3);
        MybatisUtil.closeSqlSession();//关闭连接，缓存清空
    }
}
