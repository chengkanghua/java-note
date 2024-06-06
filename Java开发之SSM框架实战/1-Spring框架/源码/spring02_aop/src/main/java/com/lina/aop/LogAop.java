package com.lina.aop;

public class LogAop implements AOP {
    @Override
    public void before() {
        System.out.println("日志----before");
    }

    @Override
    public void after() {
        System.out.println("日志----after");
    }

    @Override
    public void exception() {
        System.out.println("日志----exception");
    }

    @Override
    public void myFinally() {
        System.out.println("日志----myFinally");
    }
}
