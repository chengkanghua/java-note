import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入整數：");
        int age = scanner.nextInt();
        System.out.println("請輸入小數：");
        double money = scanner.nextDouble();
        System.out.println("整數：" + age + "，小數：" + money);
    }
}
