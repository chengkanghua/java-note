import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入消费金额:");
        double money = scanner.nextInt();
        System.out.println("是否换购：");
        System.out.println("1.满50元，加2元换购商品1");
        System.out.println("2.满100元，加3元换购商品2");
        System.out.println("3.满100元，加10元换购商品3");
        System.out.println("4.满200元，加10元换购商品4");
        System.out.println("5.满200元，加20元换购商品5");
        System.out.println("0.不换购");
        System.out.print("请选择：");
        int select = scanner.nextInt();
        String goods = "不换购"; // 全选中good单词，右键菜单Refactor下的rename
        switch (select) {
            case 1:
                if (money > 50) {
                    money += 2;
                    goods = "商品1";
                }
                break;
            case 2:
                if (money > 100) {
                    money += 3;
                    goods = "商品2";
                }
                break;
            case 3:
                if (money > 100) {
                    money += 10;
                    goods = "商品3";
                }
                break;
            case 4:
                if (money > 200) {
                    money += 10;
                    goods = "商品4";
                }
                break;
            case 5:
                if (money > 200) {
                    money += 20;
                    goods = "商品5";
                }
                break;
        }
        System.out.println("消费金额：" + money);
        System.out.println("成功换购：" + goods);
    }
}
