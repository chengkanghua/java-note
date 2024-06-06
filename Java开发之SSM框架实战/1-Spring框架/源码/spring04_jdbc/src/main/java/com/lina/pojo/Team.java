package com.lina.pojo;

public class Team {
    private Integer tId;
    private String tName;
    private String location;

    @Override
    public String toString() {
        return "Team{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
