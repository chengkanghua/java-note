import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("购物结算");
        System.out.println("请选择商品编号：");
        System.out.println("1.T恤  2.网球鞋 3.网球拍");

        String jx;
        do {
            System.out.print("请输入商品编号：");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("T恤 100元");
                    break;
                case 2:
                    System.out.println("网球鞋 200元");
                    break;
                case 3:
                    System.out.println("网球拍 300元");
                    break;
            }
            System.out.print("是否继续（y/n）：");
            jx = scanner.next();
        } while (jx.equals("y"));

        System.out.println("程序结束！");
    }
}
