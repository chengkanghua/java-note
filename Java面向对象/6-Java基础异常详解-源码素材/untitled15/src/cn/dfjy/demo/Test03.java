package cn.dfjy.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {
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
            System.out.println("请输入正确的数字！");
        } catch (ArithmeticException ex) {
            System.out.println("分母不能为零！");
        }
    }

}
