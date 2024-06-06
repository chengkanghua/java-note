package com.lina.staticproxy;

import com.lina.service.IService;

/**
 * 基于接口的静态代理：
 *      要求：代理类和被代理类都实现同一个接口
 */
public class ProxyTranService implements IService {

    private IService service;//被代理对象

    public ProxyTranService(IService service) {
        this.service = service;
    }

    @Override
    public void add() {
        try {
            System.out.println("开始事务");
            service.add();//核心业务--被代理类干活
            System.out.println("提交事务");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("事务回滚");
        }
    }
}
