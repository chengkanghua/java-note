package com.lina.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * ClassName: MybatisUtil
 * 工具类：获取连接和关闭连接
 * @author wanglina
 * @version 1.0
 */
public class MybatisUtil {
    private static ThreadLocal<SqlSession> sqlSessionThreadLocal=new ThreadLocal<>();
    private static SqlSessionFactory factory;

    static {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建工厂
        factory=new SqlSessionFactoryBuilder().build(reader);//根据图纸创建出了工厂
    }

    /**
     * 获取连接
     * @return
     */
    public static SqlSession getSqlSession(){
        //从ThreadLocal中获取
        SqlSession sqlSession = sqlSessionThreadLocal.get();
        if(sqlSession==null) {
            //创建sqlSession
            sqlSession = factory.openSession();
            //将sqlSession与线程进行绑定
            sqlSessionThreadLocal.set(sqlSession);
        }
       return sqlSession;
    }

    /**
     * 关闭连接
     */
    public static void closeSqlSession(){
        //从ThreadLocal中获取
        SqlSession sqlSession = sqlSessionThreadLocal.get();
        if(sqlSession!=null){
            sqlSession.close();
            sqlSessionThreadLocal.remove();
        }
    }
}
