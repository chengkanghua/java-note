package cn.dfjy.demo.test;

import cn.dfjy.demo.entity.Dog;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Demo09 {
    @Test
    public void f01() {
        /*
        使用泛型，有一个好处：
        增删改查，自动检查类型是否匹配
         */
        List<Dog> list = new ArrayList<>();
        // 增
        list.add(new Dog()); // 增
        // 查
        for (int i = 0; i < list.size(); i++) {
            Dog dog = list.get(i); // 查
            dog.getName();
        }
    }

    @Test
    public void f07() {
        // 双列
        Map<String, String> map = new HashMap<>();
        // 增（key value 结构）
        // key不能重复，value可以重复
        map.put("CN", "中国"); // 新增
    }

    @Test
    public void f02() {
        Xxx xxx1 = new Xxx();
        xxx1.a = "a";
        xxx1.a = 1;
        xxx1.a = 1.1;
        xxx1.a = new Dog();
    }

    @Test
    public void f03() {
        Xxx<Dog> xxx1 = new Xxx<Dog>();
//        xxx1.a = "a";
//        xxx1.a = 1;
//        xxx1.a = 1.1;
        xxx1.a = new Dog();
    }

    @Test
    public void f04() {
        Xxx<String> xxx1 = new Xxx<String>();
        xxx1.a = "a";
//        xxx1.a = 1;
//        xxx1.a = 1.1;
//        xxx1.a = new Dog();
    }

    @Test
    public void f05() {
        Xxx<Integer> xxx1 = new Xxx<Integer>();
//        xxx1.a = "a";
        xxx1.a = 1;
//        xxx1.a = 1.1;
//        xxx1.a = new Dog();
    }

    @Test
    public void f06() {
        Xxx<Double> xxx1 = new Xxx<Double>();
//        xxx1.a = "a";
//        xxx1.a = 1;
        xxx1.a = 1.1;
//        xxx1.a = new Dog();
    }
}

class Xxx<T> {
    T a;
}
