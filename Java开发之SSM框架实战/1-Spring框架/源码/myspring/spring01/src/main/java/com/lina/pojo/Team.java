package com.lina.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * NBA球队的实体类
 */
@Component
public class Team {

    private Integer id;
    @Value(("勇士"))
    private String name;
    @Value("金州")
    private String location;

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public void init(){
        System.out.println("Team-----init");
    }

    public void destroy(){
        System.out.println("Team-----destroy");
    }

    public Team() {
        System.out.println("Team默认的构造方法：id="+id+",name="+name+",loaction="+location);
    }

    public Team(Integer id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        System.out.println("Team带三个参数的构造方法：id="+id+",name="+name+",loaction="+location);
    }

    public Integer getId() {
        return id;
    }
    @Value("1001")
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
