package cn.dfjy.demo;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        /*
            解决异常的思路：
                使用异常机制 try catch finally throw throws

                throw，用于方法体内代码行
                throws，用于方法声明上，跟在方法的后面一点
         */
        throw new Exception();
    }

}
