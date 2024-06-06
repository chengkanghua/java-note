package com.lina.aop;

public class TranAop implements AOP {
    @Override
    public void before() {
        System.out.println("事务----before");
    }

    @Override
    public void after() {
        System.out.println("事务----after");
    }

    @Override
    public void exception() {
        System.out.println("事务----exception");
    }

    @Override
    public void myFinally() {
        System.out.println("事务----myFinally");
    }
}
