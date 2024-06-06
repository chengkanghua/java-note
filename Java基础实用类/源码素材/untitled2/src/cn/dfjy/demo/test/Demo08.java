package cn.dfjy.demo.test;

import org.junit.Test;

import java.util.Arrays;

public class Demo08 {
    @Test
    public void f01() {
        // 原则：StringBuffer一定是new出来的
        StringBuffer s1 = new StringBuffer("abc");
        String s2 = s1.toString();
        StringBuffer s3 = new StringBuffer(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    @Test
    public void f02() {
        // StringBuffer的用法
        StringBuffer s1 = new StringBuffer("abc");
        s1.insert(1, "x").append("def"); // 返回this，支持链式调用
        System.out.println(s1);
    }

}
