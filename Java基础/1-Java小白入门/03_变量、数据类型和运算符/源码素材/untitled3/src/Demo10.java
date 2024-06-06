import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入王浩的3門功課的成績：");
        System.out.println("Java：");
        int java = scanner.nextInt();
        System.out.println("PS：");
        int ps = scanner.nextInt();
        System.out.println("SQL：");
        int sql = scanner.nextInt();
        int chazhi = java - sql;
        System.out.println("方法1，Java和SQL的差：" + chazhi);
        System.out.println("方法2，Java和SQL的差：" + (java - sql)); // 一定要加小括號，調整一下優先級
        int pingjunzhi = (java + ps + sql) / 3;
        System.out.println("方法1，平均值：" + pingjunzhi);
        System.out.println("方法2，平均值：" + (java + ps + sql) / 3);
    }
}
