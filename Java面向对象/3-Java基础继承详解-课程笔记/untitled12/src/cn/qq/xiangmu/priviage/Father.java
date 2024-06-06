package cn.qq.xiangmu.priviage;

public class Father {
    /*
    私有的：本类内部才能访问
    包级别的：同包的其它类中也能访问
    保护的：同包的其它类中也能访问，子类也能访问
    共有的：任何类中也能访问
     */
    private int a1 = 1; // 私有的
    int a2 = 2; // 包级别的
    protected int  a3 = 3; // 保护的
    public int a4 = 4; // 共有的

    private void f1() {
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
