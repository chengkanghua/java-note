package com.lina.dao;

import com.lina.pojo.Team;
import com.lina.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * ClassName: TeamDaoImpl
 * 实现类
 * @author wanglina
 * @version 1.0
 */
public class TeamDaoImpl implements TeamDao{
    /**
     * 查询所有球队
     * @return
     */
    @Override
    public List<Team> queryAll() {
        SqlSession sqlSession= MybatisUtil.getSqlSession();
       return  sqlSession.selectList("com.lina.pojo.Team.queryAll");
    }
    /**
     * 根据id查询单个球队
     * @param teamId
     * @return
     */
    @Override
    public Team queryById(Integer teamId) {
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        return sqlSession.selectOne("com.lina.pojo.Team.queryById",teamId);
    }

    /**
     * 添加球队
     * @param team
     * @return
     */
    @Override
    public int add(Team team) {
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        int num= sqlSession.insert("com.lina.pojo.Team.add",team);
        sqlSession.commit();
        return num;
    }

    /**
     * 更新球队
     * @param team
     * @return
     */
    @Override
    public int update(Team team) {
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        int num=  sqlSession.update("com.lina.pojo.Team.update",team);
        sqlSession.commit();
        return num;
    }

    /**
     * 根据id删除球队
     * @param teamId
     * @return
     */
    @Override
    public int del(Integer teamId) {
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        int num=  sqlSession.delete("com.lina.pojo.Team.del",teamId);
        sqlSession.commit();
        return num;
    }
}
