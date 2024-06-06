package cn.qq.xiangmu.test;

import cn.qq.xiangmu.entity.Dog;

public class Demo2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("旺旺", 61, 41, "牧羊犬");
        Dog dog2 = new Dog("旺旺", 60, 40, "牧羊犬");
        System.out.println(dog1 == dog2); // 判断引用变量的地址是否相同，是不是一个对象
        System.out.println(Integer.toHexString(dog1.hashCode())); // 1b6d3586
        System.out.println(Integer.toHexString(dog2.hashCode())); // 4554617c
        // 理解一下，相等的概念，内容是否相等，界定为相等
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.getClass().toString());
    }
}
