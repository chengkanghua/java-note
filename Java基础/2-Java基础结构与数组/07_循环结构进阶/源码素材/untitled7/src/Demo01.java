import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 二重循环 外循环班级 内循环学生
        for (int i=1; i<=3; i++) { // 外循环班级
            System.out.println("请输入第" + i + "班级的成绩");
            int sum = 0; // 就近原则
            for (int j=1; j<=4; j++) { // 内循环学生
                System.out.print("第" + j + "个学生的成绩：");
                sum += scanner.nextInt();
            }
            System.out.println("第" + i + "班级的平均成绩：" + sum / 4.0);
        }
    }
}
