package com.lina.pojo;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * ClassName: pojo
 * 实体类:一方
 * @author wanglina
 * @version 1.0
 */
public class Team implements Serializable {
    private Integer teamId;
    private String teamName;
    private String location;
    private Date createTime;
    //关系字段：一个球队可以拥有多个球员
    //一方（球队）持有多方（球员）的集合
    private List<Player> playerList1;
    private List<Player> playerList2;

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                ", location='" + location + '\'' +
                ", createTime=" + createTime +
                ", playerList1=" + playerList1 +
                ", playerList2=" + playerList2 +
                '}';
    }

    public List<Player> getPlayerList1() {
        return playerList1;
    }

    public void setPlayerList1(List<Player> playerList1) {
        this.playerList1 = playerList1;
    }

    public List<Player> getPlayerList2() {
        return playerList2;
    }

    public void setPlayerList2(List<Player> playerList2) {
        this.playerList2 = playerList2;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}
