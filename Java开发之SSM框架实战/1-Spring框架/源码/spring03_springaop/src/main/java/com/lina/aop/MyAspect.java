package com.lina.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.omg.CORBA.ARG_IN;
import org.springframework.stereotype.Component;

/**
 * 定义切面类
 */
//Component //切面对象的创建权限交给spring容器
//@Aspect //aspectj 框架的注解 标识当前类是一个切面类
public class MyAspect {
    /**
     * 当很多的增强方法使用相同的切入点表达式的时候，编写和后期的维护都比较麻烦
     * @Pointcut 注解是aspectj提供的，定义切入点表达式
     */
    @Pointcut("execution(* com.lina.service..*.*(..))")
    private void pointCut(){

    }

    @Pointcut("execution(* com.lina.service..*.add*(..))")
    private void pointCut2(){

    }

    /**
     * 声明前置通知
     */
    @Before("pointCut()")
    public void before(JoinPoint jp){
        System.out.println("前置通知：在目标方法之前被调用的通知");
        String name = jp.getSignature().getName();
        System.out.println("拦截的方法的名称："+name);
        Object[] args = jp.getArgs();
        System.out.println("方法的参数个数："+ args.length);
        System.out.println("参数列表：");
        for (Object arg : args) {
            System.out.print("\t"+arg);
        }
        System.out.println();
    }

    /**
     * 后置通知
     * @param result
     * @return
     */
    @AfterReturning(value = "pointCut2()",returning = "result")
    public Object afterReturn(Object result){
        if(result!=null){
            boolean res= (boolean) result;
            if(res){
                result=false;
            }
        }
        System.out.println("后置通知：在目标方法之后被调用,返回值result="+result);
        return result;
    }

    /**
     * 环绕通知
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("execution(* com.lina.service..*.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("方法执行之前执行------");
        Object proceed = pjp.proceed();//目标方法被执行
        System.out.println("方法执行之后执行------");
        return proceed;
    }

    /*
    异常通知
     */
    @AfterThrowing(value = "execution(* com.lina.service..*.*(..))",throwing = "ex")
    public void exception(JoinPoint jp,Throwable ex){
        //一般把异常的时间、位置、原因都记录
        System.out.println("异常通知：在目标方法执行出现异常的时候才会调用的通知，否则不执行");
        System.out.println(jp.getSignature()+"方法出现异常，异常信息："+ex.getMessage());
    }

    /**
     * 最终通知
     */
    @After("execution(* com.lina.service..*.*(..))")
    public void myfinally(){
        System.out.println("最终通知：无论是否出现异常都是最后被调用的通知");
    }


}
