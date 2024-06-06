package cn.qq.xiangmu.test;

import cn.qq.xiangmu.entity.Xxx;

public class Demo02 {
    public static void main(String[] args) {
        Xxx xxx1 = new Xxx(1111);
        Xxx xxx2 = new Xxx(11111);
        System.out.println(xxx1.a1);
        System.out.println(xxx2.a1);
        xxx1.f1();
        xxx2.f1();
        Xxx.a2 = 22;
        Xxx.f2();
    }
}
