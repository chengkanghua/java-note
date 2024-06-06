package cn.dfjy.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
            解决异常的思路：
                使用异常机制 try catch
         */
        try {
            System.out.println("请输入一个数字（分子）：");
            int number1 = scanner.nextInt();
            System.out.println("请输入一个数字（分母）：");
            int number2 = scanner.nextInt();
            System.out.println(number1 + "/" + number2 + "=" + number1/number2);
        } catch (InputMismatchException ex) {
            ex.printStackTrace(); // 打印异常的栈信息
            // System.out.println(ex.getMessage()); // 打印异常的信息：null
        } catch (ArithmeticException ex) {
            // ex.printStackTrace(); // 打印异常的栈信息
            System.out.println(ex.getMessage()); // 打印异常的信息：/ by zero
        }

        System.out.println("程序结束");
    }

}
