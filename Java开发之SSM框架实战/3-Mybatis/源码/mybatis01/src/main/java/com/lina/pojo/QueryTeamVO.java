package com.lina.pojo;

import java.util.Date;

/**
 * ClassName: QueryVO
 * 自己封装的球队查询条件
 * @author wanglina
 * @version 1.0
 */
public class QueryTeamVO {
    private String name;
    private Date beginTime ;
    private Date endTime;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
