import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入是否是会员（y/n）：");
        String yesno = scanner.next();
        System.out.println("请输入购物金额：");
        int money = scanner.nextInt();
        double zk = 1.0; // 默认值，没有折扣
        if (yesno.equals("y")) {
            if (money >= 200) zk = 0.75;
            else zk = 0.8;
        } else {
            if (money >= 100) zk = 0.9;
        }
        System.out.println("实际支付：" + money * zk);
    }
}
