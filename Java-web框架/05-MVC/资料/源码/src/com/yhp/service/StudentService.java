package com.yhp.service;

import com.yhp.bean.Student;

import java.util.List;

//方法基本和dao层一样
public interface StudentService {
    //查询全部   一行数据=一个javabean对象
    public List<Student> getall();

}
