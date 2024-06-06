package cn.dfjy.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //System.out.println(args[0]);
        Scanner scanner = new Scanner(System.in);

        /*
        异常也是一个类
        java.util.InputMismatchException
        java.lang.NullPointerException
        java.lang.ArrayIndexOutOfBoundsException
        java.lang.ArithmeticException
         */
        System.out.println("请输入一个数字：");
        int number = scanner.nextInt();
        System.out.println("数字是：" + number);

        System.out.println("程序结束");
    }

}
