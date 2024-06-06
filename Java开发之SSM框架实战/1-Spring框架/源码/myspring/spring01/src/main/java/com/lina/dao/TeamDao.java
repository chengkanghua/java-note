package com.lina.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//注解其实就相当于<bean id="teamDao" class="com.lina.dao.TeamDao"></bean>，告知spring容器创建对象的权限交给你
//value属性可以省略，如果没写，表示id默认值是类名的首字母小写
//@Component
@Repository("teamDao") //一般使用在dao层
public class TeamDao {

    public void add(){
        System.out.println("TeamDao-----add--------");
    }

    public TeamDao() {
        System.out.println("TeamDao---默认构造方法");
    }
}
