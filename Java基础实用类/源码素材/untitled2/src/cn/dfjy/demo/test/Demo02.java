package cn.dfjy.demo.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
    @Test
    public void test01() {
        List<Integer> list = new ArrayList<>(); // 不允许使用基本数据类型
        list.add(1); // 共享一份空间
        list.add(1); // 共享一份空间
        list.add(new Integer(1)); // 新开辟了一个空间 不要写new
        System.out.println(list);
    }

    @Test
    public void test02() {
        Integer i1 = 1;
        Integer i2 = new Integer(1); // 一定是一个新开辟的地址空间
        System.out.println(i1 == i2); // false
    }

    @Test
    public void test03() {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2); // true 如果给的是纯数字，没有超过一个字节的范围[-128,127]，就为真
    }

    @Test
    public void test04() {
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2); // false 如果给的是纯数字，超过了一个字节的范围[-128,127]，就为假
    }

    @Test
    public void test05() {
        Integer i1 = new Integer(1); // 一定是一个新开辟的地址空间
        Integer i2 = new Integer(1); // 一定是一个新开辟的地址空间
        System.out.println(i1 == i2); // false
    }
}
