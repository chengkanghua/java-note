package com.lina.dynamicproxy;

import com.lina.aop.AOP;
import com.lina.aop.LogAop;
import com.lina.aop.TranAop;
import com.lina.service.IService;
import com.lina.service.TeamService;
import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;
import sun.rmi.runtime.NewThreadAction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理:目标对象必须实现接口，没有实现接口不能使用JDK动态代理
 * public static Object newProxyInstance(ClassLoader loader,
 *                                           Class<?>[] interfaces,
 *                                           InvocationHandler h)
 *     ClassLoader loader: 类加载器，因为是动态代理，借助别人的类加载器，一般借助被代理对象的
 *     Class<?>[] interfaces：接口类对象的集合，针对接口代理，针对那个接口做代理，一般使用的就是被代理对象的接口
 *     InvocationHandler h: 句柄 回调函数，编写代理的规则的代码--真正的业务逻辑
 *
 *     Object invoke(Object proxy, Method method, Object[] args)
 *     proxy: 代理对象
 *     method:被代理的方法
 *     args:被代理方法执行的时候参数的数组
 */
public class MyJDKProxy {
    public static void main1(String[] args) {
        TeamService teamService=new TeamService();//被代理对象
        //JDK提供的方法：动态产生代理对象
       IService proxyService= (IService) Proxy.newProxyInstance(
               teamService.getClass().getClassLoader(),
               teamService.getClass().getInterfaces(),
               new InvocationHandler() {
                   @Override
                   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                       try {
                           System.out.println("开始事务");
                           Object invoke = method.invoke(teamService, args);//核心业务
                           System.out.println("提交事务");
                           return invoke;
                       }catch (Exception e){
                           e.printStackTrace();
                           System.out.println("回滚事务");
                       }finally {
                           System.out.println("finally----------");
                       }
                       return null;
                   }
               }
               );
       proxyService.add();//代理对象干活
        System.out.println(teamService.getClass());
        System.out.println(proxyService.getClass());
    }

    public static void main2(String[] args) {
        //目标对象--被代理对象
        TeamService teamService= new TeamService();
        //切面
        AOP aop=new TranAop();

        IService service = (IService) Proxy.newProxyInstance(teamService.getClass().getClassLoader(),
                teamService.getClass().getInterfaces(),
                new ProxyHandler(teamService, aop));
        service.add();
        System.out.println(service.getClass());
    }

    public static void main(String[] args) {
        //目标对象--被代理对象
        TeamService teamService= new TeamService();
        //切面
        AOP aop=new TranAop();
        AOP logAop=new LogAop();

        //获取代理对象
        IService service = (IService) new ProxyFactory(teamService, aop).getProxyInstance();
        IService service1 = (IService) new ProxyFactory(service, logAop).getProxyInstance();
        service1.add();
    }
}
