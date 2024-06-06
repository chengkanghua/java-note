package com.lina.test;

import com.lina.aop.AOP;
import com.lina.aop.LogAop;
import com.lina.aop.TranAop;
import com.lina.service.IService;
import com.lina.service.TeamService;
import com.lina.service.UserService;
import com.lina.staticproxy.ProxyAOPService;
import com.lina.staticproxy.ProxyLogService;
import com.lina.staticproxy.ProxyTranService;
import org.junit.Test;

public class TestStatic {
    @Test
    public void test01() {

        TeamService teamService = new TeamService();//被代理对象
        UserService userService = new UserService();//被代理对象

        ProxyTranService proxyTranService = new ProxyTranService(userService);//事务的代理对象：一级代理
        //proxyTranService.add();

        ProxyLogService logService = new ProxyLogService(proxyTranService);//代理对象代理的是上一个代理对象：二级代理
        logService.add();
    }

    @Test
    public void test02() {
        IService teamService=new TeamService();//被代理对象--核心业务--演员
        AOP aop=new TranAop();//切面--重复性/服务性的代码
        AOP logAop=new LogAop();

        IService service=new ProxyAOPService(teamService,aop);//代理对象--一级代理--- 电视剧的经纪人
        IService service1=new ProxyAOPService(service,logAop);//代理对象--二级代理--- 代言的经纪人
        service1.add();

    }
}
