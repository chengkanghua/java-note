import java.util.Scanner;

public class Demo14 {
    public static void main(String[] args) {
        final double JINDU = 0.00001;
        /*
        1. 录入一个小数1，小数2，小数3。
            判断小数1+小数2是否等于小数3？
            小数是模拟出来的数，近似值。无法用== !=进行比较的。
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("小数1：");
        double d1 = scanner.nextDouble();
        System.out.print("小数2：");
        double d2 = scanner.nextDouble();
        System.out.print("小数3：");
        double d3 = scanner.nextDouble();
        if (d1 + d2 <= d3+JINDU && d1 + d2 >= d3-JINDU) System.out.println("d1+d2==d3");
        else System.out.println("d1+d2!=d3");

        System.out.println("程序结束！");
    }
}
