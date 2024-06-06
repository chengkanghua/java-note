import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("奖励");
        }
        System.out.println("程序结束");
    }
}
