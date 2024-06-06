package cn.qq.xiangmu.test;

import cn.qq.xiangmu.entity.*;

public class Demo01 {
    public static void main(String[] args) {
        Dog dog = new Dog("欧欧", 100, 0, "德国牧羊犬");
        Penguin penguin = new Penguin("美美", 90, 10, "Q妹");
        dog.print();
        penguin.print();
    }
}
