package cn.dfjy.demo;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class Demo03 {
    @Test
    public void f01() {
        //static long currentTimeMillis() 返回以毫秒为单位的当前时间。
        long begin = System.currentTimeMillis();
        Random random = new Random(System.currentTimeMillis()); // 使用时钟作为种子
        System.out.println(random.nextDouble()); // 返回一个从 0.0d（包括）到 1.0d（不包括）范围
        // 返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
        System.out.println(random.nextInt(3) + 1);
        System.out.println(System.currentTimeMillis() - begin + " ms"); // 估算代码运行时长
    }

    @Test
    public void f02() {
        // static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        // 从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 0};
        System.arraycopy(arr1, 1, arr2, 1, 4);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    @Test
    public void f03() {
        // static void exit(int status)
        // 终止当前正在运行的 Java 虚拟机。
        System.out.println(1);
        System.exit(0);
        System.out.println(3);
    }

    @Test
    public void f04() {
        Dog dog1 = new Dog(1);
        Dog dog2 = new Dog(2);
        Dog dog3 = new Dog(3);
        dog2 = null;
        // static void gc() 运行垃圾回收器。
        System.gc();
    }

    @Test
    public void f05() {
        /*
        static PrintStream err  “标准”错误输出流。
        static InputStream in   “标准”输入流。
        static PrintStream out  “标准”输出流。
        */
        System.out.println("out"); // 默认的输出地址是控制台
        System.err.println("err"); // 默认的输出地址是控制台
        System.out.println(System.in); // 默认指代键盘
    }
}

class Dog extends Object {
    int id;

    @Deprecated
    public Dog(int id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("狗狗" + id + "被垃圾回收了！");
    }
}
