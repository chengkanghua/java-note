import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i=1; i<=5; i++) {
            System.out.print("成绩：");
            int cj = scanner.nextInt();
            if (cj < 0) break; // 结束循环
        }

        System.out.println("最后");
    }
}
