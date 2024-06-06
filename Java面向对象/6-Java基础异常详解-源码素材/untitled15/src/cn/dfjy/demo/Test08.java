package cn.dfjy.demo;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
            解决异常的思路：
                使用异常机制 try catch finally throw throws

                throw，用于方法体内代码行
                throws，用于方法声明上，跟在方法的后面一点
         */
        try {
            f01(-100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        f02(-100);

        System.out.println("代码正常走完");
    }

    public static void f01(int cj) throws Exception {
        if (cj < 0) throw new Exception("成绩不能为负数！"); // 必检异常（排除掉RuntimeException或它的子类）
        System.out.println("成绩：" + cj);
    }

    public static void f02(int cj) {
        if (cj < 0) throw new RuntimeException("成绩不能为负数！"); // 运行期异常
        System.out.println("成绩：" + cj);
    }

}
