package com.lina.staticproxy;

import com.lina.aop.AOP;
import com.lina.service.IService;

/**
 * 1、可以在不修改目标对象的前提下，对目标对象功能扩展
 * 缺点：1、代理对象要和目标对象实现同一个接口，所以会有很多的代理类，一旦接口变更，目标对象与代理对象都要改变
 */
public class ProxyAOPService implements IService {
    private IService service;//被代理对象
    private AOP aop;//要加入的切面

    public ProxyAOPService(IService service, AOP aop) {
        this.service = service;
        this.aop = aop;
    }

    @Override
    public void add() {
        try {
            aop.before();
            service.add();
            aop.after();
        }catch (Exception e){
            e.printStackTrace();
            aop.exception();
        }finally {
            aop.myFinally();
        }
    }
}
