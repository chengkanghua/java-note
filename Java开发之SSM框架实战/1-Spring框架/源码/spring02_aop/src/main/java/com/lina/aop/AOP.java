package com.lina.aop;

/**
 * 切面：服务性代码，未来要切入到核心代码中，切入哪里？给定四个位置
 */
public interface AOP {
    void before();
    void after();
    void exception();
    void myFinally();
}
