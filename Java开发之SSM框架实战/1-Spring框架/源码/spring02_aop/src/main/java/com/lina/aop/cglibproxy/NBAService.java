package com.lina.aop.cglibproxy;

import com.lina.aop.AOP;
import com.lina.aop.TranAop;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLIB: 也叫子类代理。在内存中构建一个子类对象从而实现对目标对象功能的扩展
 *  1、不要求目标对象实现接口
 *  2、
 */
public class NBAService {

    public int add(String name,int id){
        System.out.println("NBAService-----add----");
        //System.out.println(1/0);
        return id;
    }

    public static void main1(String[] args) {
        NBAService nbaService=new NBAService();//没有接口的目标对象
        //cglib代理
        NBAService proxyService= (NBAService) Enhancer.create(nbaService.getClass(),
                new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        try{
                            System.out.println("开始事务");
                            Object o1 = methodProxy.invokeSuper(o, objects);//核心方法
                            System.out.println("提交事务");
                            return o1;
                        }catch (Exception e){
                            e.printStackTrace();
                            System.out.println("回滚事务");
                            throw  e;
                        }finally {
                            System.out.println("finally");
                        }
                    }
                });

        int yongshi = proxyService.add("yongshi", 1001);
        System.out.println(yongshi);
        System.out.println(proxyService.getClass());
    }

    public static void main(String[] args) {
        NBAService nbaService=new NBAService();//没有接口的目标对象
        AOP tranAop=new TranAop();
        NBAService proxyInstance = (NBAService) new CgllibProxyFactory().getProxyInstance(nbaService, tranAop);
        int yongshi = proxyInstance.add("yongshi", 1002);
        System.out.println(yongshi);
        System.out.println(proxyInstance.getClass());
    }
}
