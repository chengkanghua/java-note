package com.lina.mapper;
import com.lina.pojo.QueryTeamVO;
import com.lina.pojo.QueryVO;
import com.lina.pojo.Team;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * ClassName: TeamDao
 * Mapper接口
 * @author wanglina
 * @version 1.0
 */
public interface TeamMapper {

    void delList(List<Integer> list);
    void addList(List<Team> list);
    int update1(Team team);
    List<Team> queryByVO(QueryTeamVO vo);
   /* default List<Team> queryByVO(QueryTeamVO vo) {
        String sql="select * from team   where 1 = 1 ";
                -- 如果用户输入了名称，就模糊查询
        and teamName like '%?%'
                -- 如果用户输入了日期，按照日期区间查询
        and createTime>?and createTime< ?
        --如果输入了地区，按照地区查询
        and location =?";
        if(vo.getName()!=null && !"".equals(vo.getName().trim())){
            sql+=" and teamName like '%"+vo.getName().trim()+"%'";
        }
        if(vo.getBeginTime()!=null ){
            sql+=" and getEndTime>"+vo.getBeginTime();
        }
        if(vo.getBeginTime()!=null ){
            sql+=" and createTime<="+vo.getEndTime();
        }
        if(vo.getLocation()!=null && !"".equals(vo.getLocation().trim())){
            sql+=" and location ="+vo.getLocation().trim();
        }
    }*/

    Team queryById1(Integer teamId);
    Team queryById2(Integer teamId);

    List<Team> queryAll2();

    Map<String,Object> getTwoColumn();
    List<Map<String,Object>> getTwoColumnList();

    int getCount();

    List<Team> queryByName(String teamName);
    List<Team> queryByLocation(String location);
    List<Team> queryByFiled(@Param("column") String column, @Param("columnValue") String columnValue);

    List<Team> queryByRange1(Integer min, Integer max);
    List<Team> queryByRange2(@Param("min") Integer min, @Param("max") Integer max);
    List<Team> queryByRange3(Map<String, Object> map);
    List<Team> queryByCondition(QueryVO vo);

    List<Team> queryAll();
    Team queryById(Integer teamId);
    int add(Team team);
    int update(Team team);

    int del(Integer teamId);
}
