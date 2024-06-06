public class Demo01 {
    /*
    函数重载原则：
        方法名相同
        参数列表不相同
    注意：
        与返回值无关
     */
    public static void main(String[] args) {
        f01(1.0);
        f01(1);
    }

    public static void f01(double money) { // double
        System.out.println("f01(double money) 被调用了");
    }

    public static int f01(int age) { // int
        System.out.println("f01(int age) 被调用了");
        return 100;
    }
}
