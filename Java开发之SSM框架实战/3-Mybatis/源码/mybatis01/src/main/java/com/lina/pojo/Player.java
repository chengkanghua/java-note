package com.lina.pojo;

/**
 * 球员的实体类：对方
 */
public class Player {
    private Integer playerId;
    private String playerName;
    private Integer playerNum;
    private Integer teamId;
    //关系字段：多个球员可以属于同一个球队
    //多方（球员）持有一方（球队）的对象
    private Team team1;
    private Team team2;
    private Team team3;

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", playerNum=" + playerNum +
                ", teamId=" + teamId +
                ", team1=" + team1 +
                ", team2=" + team2 +
                ", team3=" + team3 +
                '}';
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(Integer playerNum) {
        this.playerNum = playerNum;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Team getTeam3() {
        return team3;
    }

    public void setTeam3(Team team3) {
        this.team3 = team3;
    }
}