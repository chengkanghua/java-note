package com.lina.dao;

import com.lina.pojo.Team;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;


public class TeamDao extends JdbcDaoSupport {

    public Map<String,Object> getMany(){
        String sql="select max(tid) as max,min(tid) as min from team";
        return this.getJdbcTemplate().queryForMap(sql);
    }

    public int getCount(){
        String sql="select count(tid) from team";
        //如果查询的列只有唯一一列，queryForObject（sql语句,唯一列的数据类型）
        return this.getJdbcTemplate().queryForObject(sql,Integer.class);
    }
    /**
     * 自己封装处理结果的方法
     * @param resultSet
     * @return
     * @throws SQLException
     */
    public Team handlResult(ResultSet resultSet) throws SQLException {
        Team team=new Team();
        team.settId(resultSet.getInt("tid"));
        team.settName(resultSet.getString("tname"));
        team.setLocation(resultSet.getString("location"));
        return team;
    }

    public List<Team> findByAll() {
        String sql = "select * from team";
        return this.getJdbcTemplate().query(sql, new RowMapper<Team>() {
            @Override
            public Team mapRow(ResultSet resultSet, int i) throws SQLException {
                /*Team team=new Team();
                team.settId(resultSet.getInt("tid"));
                team.settName(resultSet.getString("tname"));
                team.setLocation(resultSet.getString("location"));
                return team;*/
                return handlResult(resultSet);
            }
        });
    }

    public Team findById(int id){
        String sql="select * from team where tid=?";
        return this.getJdbcTemplate().queryForObject(sql, new Object[]{id}, new RowMapper<Team>() {
            @Override
            public Team mapRow(ResultSet resultSet, int i) throws SQLException {
                /*Team team=new Team();
                team.settId(resultSet.getInt("tid"));
                team.settName(resultSet.getString("tname"));
                team.setLocation(resultSet.getString("location"));
                return team;*/
                return handlResult(resultSet);
            }
        });
    }

    public int insert(Team team){
        String sql="INSERT INTO `springjdbc`.`team` ( `tname`, `location`) VALUES (?,?)";
        return this.getJdbcTemplate().update(sql,team.gettName(),team.getLocation());
    }

    public int update(Team team){
        String sql="UPDATE `springjdbc`.`team` SET `tname` = ?, `location` = ? WHERE `tid` = ?";
        return this.getJdbcTemplate().update(sql,team.gettName(),team.getLocation(),team.gettId());
    }

    public int del(int id){
        String sql="delete from team where tid=?";
        return this.getJdbcTemplate().update(sql,id);
    }
}
