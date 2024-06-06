package com.yhp.dao;

import com.yhp.bean.Student;

import java.util.List;

//定义操作数据库的方法
public interface StudentDao {
    //查询全部   一行数据=一个javabean对象
    public List<Student> getall();
}
