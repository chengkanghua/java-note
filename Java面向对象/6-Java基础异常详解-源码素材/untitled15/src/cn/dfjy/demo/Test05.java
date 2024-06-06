package cn.dfjy.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
            解决异常的思路：
                使用异常机制 try catch finally
                面试：
                1. finally代码块不执行的唯一条件
                   虚拟机结束
         */
        try {
            System.out.println("请输入一个数字（分子）：");
            int number1 = scanner.nextInt();
            System.out.println("请输入一个数字（分母）：");
            int number2 = scanner.nextInt();
            System.out.println(number1 + "/" + number2 + "=" + number1/number2);
            System.exit(0); // Terminates the currently running Java Virtual Machine 结束当前java虚拟机
            System.out.println("return");
            return; // 也挡不住 finally 的执行
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage()); // 打印异常的信息：null
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage()); // 打印异常的信息：/ by zero
        } finally {
            // 最终
            System.out.println("try块中涉及的资源释放");
        }

        System.out.println("程序结束");
    }

}
