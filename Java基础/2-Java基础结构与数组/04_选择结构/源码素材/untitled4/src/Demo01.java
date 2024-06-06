import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("优秀");
        } else {
            System.out.println("其它");
        }
    }
}
