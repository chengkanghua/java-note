import java.util.Arrays;

public class Demo02 {
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

    public static void f01(int... x) { // 总而言之，不管如何传参数，x最终是int[]一维数组
        System.out.println("f01(int...) 被调用了");
        System.out.println(Arrays.toString(x));
    }
}
