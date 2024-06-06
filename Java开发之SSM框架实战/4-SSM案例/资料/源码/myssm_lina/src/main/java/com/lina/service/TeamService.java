package com.lina.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lina.mapper.TeamMapper;
import com.lina.pojo.Team;
import com.lina.pojo.TeamExample;
import com.lina.vo.QueryVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeamService {
    @Resource
    private TeamMapper teamMapper;

    //多条件分页查询
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public PageInfo<Team> queryByPage(int pageNum, int pageSize, QueryVO vo){
        //多条件查询的实体类
        TeamExample ex=new TeamExample();
        //获取盛放条件的容器
        TeamExample.Criteria criteria = ex.createCriteria();
        //多条件
        if(vo.getChineseName()!=null && !"".equals(vo.getChineseName().trim())){
            criteria.andChineseNameLike("%"+vo.getChineseName().trim()+"%");
        }
        if(vo.getTeamName()!=null && !"".equals(vo.getTeamName().trim())){
            criteria.andTeamNameLike("%"+vo.getTeamName().trim()+"%");
        }
        if(vo.getCoach()!=null && !"".equals(vo.getCoach().trim())){
            criteria.andCoachLike("%"+vo.getCoach().trim()+"%");
        }
        if(vo.getBeginDate()!=null){
            criteria.andCreateTimeGreaterThanOrEqualTo(vo.getBeginDate());
        }
        if(vo.getEndDate()!=null){
            criteria.andCreateTimeLessThanOrEqualTo(vo.getEndDate());
        }
        if(vo.getArea()!=null && vo.getArea()!=-1){
            criteria.andAreaEqualTo(vo.getArea());
        }
        //分页
        PageHelper.startPage(pageNum,pageSize);
        List<Team> teamList = teamMapper.selectByExample(ex);
        return new PageInfo<>(teamList);
    }

    /**
     * 添加一个球队
     * @param team
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int add(Team team){
        int num= teamMapper.insertSelective(team);//动态插入，插入的都是非空列
        return num;
    }

    /**
     * 根据主键查询球队
     * @param teamId
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public Team queryById(int teamId){
       return teamMapper.selectByPrimaryKey(teamId);
    }

    /**
     * 更新一个球队
     * @param team
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int update(Team team){
        return teamMapper.updateByPrimaryKeySelective(team);
    }

    /**
     * 根据主键删除球队--逻辑删除
     * @param teamId
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int del(int teamId){
        Team team = teamMapper.selectByPrimaryKey(teamId);
        team.setIsDel(1);//逻辑删除：将删除标识列修改为删除状态
        return teamMapper.updateByPrimaryKeySelective(team);
    }
}
