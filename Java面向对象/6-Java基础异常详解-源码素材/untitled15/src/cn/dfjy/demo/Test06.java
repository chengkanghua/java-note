package cn.dfjy.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
            解决异常的思路：
                使用异常机制 try catch finally
                catch顺序
                1. 没有继承关系的，谁先谁后，都可以
                2. 有继承关系的，记住父亲在后 Exception 兜底
         */
        try {
            System.out.println(args[0]);
            System.out.println("请输入一个数字（分子）：");
            int number1 = scanner.nextInt();
            System.out.println("请输入一个数字（分母）：");
            int number2 = scanner.nextInt();
            System.out.println(number1 + "/" + number2 + "=" + number1/number2);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage()); // 打印异常的信息：/ by zero
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage()); // 打印异常的信息：null
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            // 最终
            System.out.println("try块中涉及的资源释放");
        }

        System.out.println("程序结束");
    }

}
