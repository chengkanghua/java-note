package cn.dfjy.demo;

import org.junit.Test;

public class Demo01 {
    @Test
    public void f01() {
        System.out.println(Math.PI);
    }

    @Test
    public void f02() {
        // 数学要用到的函数，想一想Math
        System.out.println(Math.abs(3.5)); // 3.5
        System.out.println(Math.abs(-3.5)); // 3.5
        System.out.println(Math.round(3.5)); // 4
        System.out.println(Math.round(-3.5)); // -3
        System.out.println(Math.floor(3.9)); // 3
        System.out.println(Math.floor(-3.9)); // -4
        System.out.println(Math.ceil(3.1)); // 4
        System.out.println(Math.ceil(-3.1)); // -3
        System.out.println(Math.sqrt(2.0)); // 1.414
    }

    @Test
    public void f03() {
        System.out.println(Math.random()); // 该值大于等于 0.0 且小于 1.0。
        System.out.println((int)(Math.random()*3) + 1); // m总个数，n起始值
    }
}
