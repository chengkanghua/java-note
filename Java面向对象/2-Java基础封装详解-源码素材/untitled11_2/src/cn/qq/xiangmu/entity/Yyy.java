package cn.qq.xiangmu.entity;

public class Yyy {
    int a1;
    public static int a2;

    public Yyy() {
        a1 = 10;
    }

    {
        // 代码块 构造了n次对象前，默认就会自动调用n次
        a1++;
    }

    static {
        // 静态代码块 该类有访问就唯一调用一次
        a2++;
    }

    public void f1() {
        System.out.println(a1);
    }
}
