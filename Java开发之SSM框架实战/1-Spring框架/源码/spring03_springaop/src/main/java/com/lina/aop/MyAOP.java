package com.lina.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 定义切面类
 */
@Component //切面对象的创建权限交给spring容器
@Aspect //aspectj 框架的注解 标识当前类是一个切面类
public class MyAOP {


    public void before(JoinPoint jp){
        System.out.println("前置通知：在目标方法之前被调用的通知");

    }

    public void afterReturn(Object result){

        System.out.println("后置通知：在目标方法之后被调用,返回值result="+result);
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("方法执行之前执行------");
        Object proceed = pjp.proceed();//目标方法被执行
        System.out.println("方法执行之后执行------");
        return proceed;
    }

    public void exception(JoinPoint jp,Throwable ex){
        //一般把异常的时间、位置、原因都记录
        System.out.println("异常通知：在目标方法执行出现异常的时候才会调用的通知，否则不执行");
        System.out.println(jp.getSignature()+"方法出现异常，异常信息："+ex.getMessage());
    }

    public void myfinally(){
        System.out.println("最终通知：无论是否出现异常都是最后被调用的通知");
    }


}
