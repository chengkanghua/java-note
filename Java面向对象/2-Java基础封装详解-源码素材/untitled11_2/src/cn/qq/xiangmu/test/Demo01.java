package cn.qq.xiangmu.test;

import cn.qq.xiangmu.entity.*;

public class Demo01 {
    public static void main(String[] args) {
        Dog dog = new Dog("ŷŷ", 100, 0, "�¹�����Ȯ");
        System.out.println(Penguin.SEX_FEMALE);
        Penguin penguin = new Penguin("����", 90, 10, Penguin.SEX_FEMALE);
        dog.print();
        penguin.print();
    }
}
