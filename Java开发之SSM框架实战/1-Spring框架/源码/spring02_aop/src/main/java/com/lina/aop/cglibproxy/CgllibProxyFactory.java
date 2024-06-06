package com.lina.aop.cglibproxy;

import com.lina.aop.AOP;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CgllibProxyFactory {

    private NBAService nbaService;
    private AOP aop;



    public Object getProxyInstance(NBAService nbaService,AOP aop){
        return Enhancer.create(nbaService.getClass(),
                new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        try{
                            aop.before();
                            Object o1 = methodProxy.invokeSuper(o, objects);//核心方法
                            aop.after();
                            return o1;
                        }catch (Exception e){
                            e.printStackTrace();
                            aop.exception();
                            throw  e;
                        }finally {
                            aop.myFinally();
                        }
                    }
                });
    }
}
