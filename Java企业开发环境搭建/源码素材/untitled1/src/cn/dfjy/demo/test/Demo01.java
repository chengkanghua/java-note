package cn.dfjy.demo.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    // 共有的 没有返回值的 没有参数的
    // External Libraries，主要是帮助代码生成.class文件
    // External Libraries，其次是帮助代码能进行单元测试（不支持键盘扫描）
    @Test
    public void f01() {
        // 声明的时候，最好采用多态的形式，也就是以父接口去声明
        // 原因：1. 关于可重复、有序操作的方法，都是在接口中已经定义好了 2. 利于多态
        List list = new ArrayList();
        // 增
        list.add("中国");
        list.add("美国");
        list.add("日本");
        list.add("韩国");
        list.add("中国");
        // 查
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void f02() {
        // 声明的时候，最好采用多态的形式，也就是以父接口去声明
        // 原因：1. 关于可重复、有序操作的方法，都是在接口中已经定义好了 2. 利于da多态
        List list = new ArrayList();
        // 增
        list.add("中国");
        list.add("美国");
        list.add("日本");
        list.add("韩国");
        list.add("中国");
        // 删
        list.remove(1);
        // 查
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void f03() {
        // 声明的时候，最好采用多态的形式，也就是以父接口去声明
        // 原因：1. 关于可重复、有序操作的方法，都是在接口中已经定义好了 2. 利于多态
        List list = new ArrayList();
        // 增
        list.add("中国"); // 0
        list.add("美国"); // 1
        list.add("日本"); // 2
        list.add("韩国"); // 3
        list.add("中国"); // 4
        // 改
        list.set(2, "小日本");
        // 查
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
