package com.lina.test;

import com.lina.mapper.UsersMapper;
import com.lina.pojo.Team;
import com.lina.pojo.Users;
import com.lina.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;
import java.util.List;

/**
 * ClassName: TestTeam
 * 测试类
 * @author wanglina
 * @version 1.0
 */
public class TestUsersMapper {

    private UsersMapper mapper= MybatisUtil.getSqlSession().getMapper(UsersMapper.class);
    @Test
    public void test1(){
        Users user = mapper.queryById(1);
        System.out.println(user);
    }

    @Test
    public void test2(){
        Users user = mapper.queryById2(1);
        System.out.println(user);
    }
}
