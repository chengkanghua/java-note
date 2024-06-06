package com.lina.dynamicproxy;

import com.lina.aop.AOP;
import com.lina.service.IService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private IService service;//被代理对象、目标对象
    private AOP aop;//切面类

    public ProxyFactory(IService service, AOP aop) {
        this.service = service;
        this.aop = aop;
    }

    /**
     * 获取动态代理对象的实例
     * @return
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        try {
                            aop.before();
                            Object invoke = method.invoke(service, args);//核心业务
                            aop.after();
                            return invoke;
                        }catch (Exception e){
                            e.printStackTrace();
                            aop.exception();
                            throw e;
                        }finally {
                            aop.myFinally();
                        }
                    }
                });
    }
}
