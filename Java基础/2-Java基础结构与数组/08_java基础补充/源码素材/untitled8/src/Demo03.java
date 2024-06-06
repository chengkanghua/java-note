public class Demo03 {
    /*
    函数可变参数
     */
    public static void main(String[] args) {
        f01(new int[]{1,3,5,7,9});
        f01();
        f01(1);
        f01(1, 2);
        f01(1, 2, 3);
    }

    public static void f01(int... arr) { // 总而言之，不管如何传参数，x最终是int[]一维数组
        System.out.println("f01(int...) 被调用了");
        // 自动循环arr数组，也知道何时结束，每次取出一个送到变量a上
        for (int a : arr) { // foreach输出（增强版for循环），没有下标了
            System.out.println(a);
        }
    }
}
