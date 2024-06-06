package com.lina.staticproxy;

import com.lina.service.IService;

/**
 * 代理类--代理日志
 */
public class ProxyLogService implements IService {
    private IService service;//被代理对象

    public ProxyLogService(IService service) {
        this.service = service;
    }

    @Override
    public void add() {
        try {
            System.out.println("开始日志");
            service.add();//核心业务--被代理类干活
            System.out.println("结束日志");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("异常日志");
        }
    }
}
