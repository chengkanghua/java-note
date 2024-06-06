package cn.qq.xiangmu.entity;

public class Xxx {
    public int a1 = 1;
    public static int a2 = 2;

    public Xxx() {
        System.out.println("Xxx()构造函数");
    }

    public Xxx(int a1) {
        System.out.println("Xxx(int)构造函数");
        this.a1 = a1;
    }

    public void f1() {
        System.out.println("f1(): " + this.a1 + Xxx.a2);
        Xxx.f2();
    }

    public static void f2() {
        System.out.println("f2(): " + Xxx.a2);
    }
}
