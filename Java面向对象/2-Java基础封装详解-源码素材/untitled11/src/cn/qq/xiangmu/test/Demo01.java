package cn.qq.xiangmu.test;

import cn.qq.xiangmu.entity.*;

public class Demo01 {
    public static void main(String[] args) {
        Dog dog = new Dog("ŷŷ", 100, 0, "�¹�����Ȯ");
        Penguin penguin = new Penguin("����", 90, 10, "Q��");
        dog.print();
        penguin.print();
    }
}
