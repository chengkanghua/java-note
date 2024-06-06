import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name = scanner.next(); // 记录姓名
        int sum = 0; // 记录总成绩
        for (int i=1; i<=5; i++) {
            System.out.print("请输入5门功课的第" + i + "门的成绩：");
            sum += scanner.nextInt();
        }
        System.out.println(name + "的平均分是：" + sum / 5.0);
    }
}
