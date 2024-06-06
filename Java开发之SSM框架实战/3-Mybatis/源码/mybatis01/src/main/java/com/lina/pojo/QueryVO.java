package com.lina.pojo;

/**
 * ClassName: QueryVO
 * 自己封装的查询条件
 * @author wanglina
 * @version 1.0
 */
public class QueryVO {
    private String name;
    private Integer min;
    private Integer max;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
