package cn.dfjy.demo;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
            解决异常的思路：
                使用if判断
         */
        System.out.println("请输入一个数字：");
        if (scanner.hasNextInt()) { // 判断是否缓冲区（键盘）接收到一个数字
            int number = scanner.nextInt();
            System.out.println("数字是：" + number);
        } else {
            System.out.println("请输入正确的数字！");
        }

    }

}
