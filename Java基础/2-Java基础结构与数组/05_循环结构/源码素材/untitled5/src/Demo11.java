import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i=1; i<=5; i++) {
            System.out.print("成绩：");
            int cj = scanner.nextInt();
            if (cj < 0) continue; // 忽略当次
            sum += cj;
        }

        System.out.println("和：" + sum);
    }
}
