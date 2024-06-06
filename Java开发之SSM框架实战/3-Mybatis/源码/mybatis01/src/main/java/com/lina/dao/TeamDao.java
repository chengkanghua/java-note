package com.lina.dao;

import com.lina.pojo.Team;

import java.util.List;

/**
 * ClassName: TeamDao
 * 原有的dao写法
 * @author wanglina
 * @version 1.0
 */
public interface TeamDao {
    List<Team> queryAll();
    Team queryById(Integer teamId);
    int add(Team team);
    int update(Team team);
    int del(Integer teamId);
}
