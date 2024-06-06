package com.lina.service;

import com.lina.dao.TeamDao;
import com.lina.pojo.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeamService {

    @Autowired
    private TeamDao teamDao;

    /**
     * propagation事务的传播：
     *      REQUIRED:当前没有事务的时候，创建新事物，如果当前有事务，就直接加入，常用设置
     *  isolation = Isolation.DEFAULT 表示使用数据库的默认的隔离级别
     * @param team
     * @return
     */
    //@Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class},isolation = Isolation.DEFAULT)
    public int insert(Team team){
        //为了体现事务的内容：业务要求：同时插入两天数据都成功业务才算完成，一条失败，整个业务失败
        int num1=teamDao.insert(team);
        System.out.println("第一条执行结果：num1="+num1);
       int num=10/0;
        int num2=teamDao.insert(team);
        System.out.println("第二条执行结果：num1="+num2);
        return num1+num2;
    }
}
