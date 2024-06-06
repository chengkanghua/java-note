package com.lina.test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ThreadLocalTest
 *
 * @author wanglina
 * @version 1.0
 */
public class ThreadLocalTest {
    //可以理解为一个容器：特殊点：只能盛放一个数据
    private ThreadLocal<String> threadLocal=new ThreadLocal<>();
    private List<String> list=new ArrayList<String>();

    class MyThread1 extends Thread{
        @Override
        public void run() {
            threadLocal.set("贾宝玉1");
            list.add("AAAA");
            System.out.println("MyThread1---threadLocal-----"+threadLocal.get());
            System.out.println("MyThread1---list-----"+list.get(0));
        }
    }
    class MyThread2 extends Thread{
        @Override
        public void run() {
            threadLocal.set("林黛玉2");
            list.add("BBBB");
            System.out.println("MyThread2---threadLocal-----"+threadLocal.get());
            System.out.println("MyThread2---list-----"+list.get(0));
        }
    }

    public static void main(String[] args) {
        ThreadLocalTest test=new ThreadLocalTest();
        MyThread1 t1=test.new MyThread1();
        MyThread2 t2=test.new MyThread2();
        t1.start();
        t2.start();
    }

    public static void main1(String[] args) {
        ThreadLocalTest test=new ThreadLocalTest();
        //添加数据
        test.threadLocal.set("wangLina");
        test.threadLocal.set("贾宝玉");//再次添加会覆盖前面的值
        //取出数据
        String s = test.threadLocal.get();
        System.out.println(s);
    }
}
