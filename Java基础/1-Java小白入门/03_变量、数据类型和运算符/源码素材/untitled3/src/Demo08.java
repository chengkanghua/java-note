import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        // 鍵盤輸入功能 Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入你的姓名："); // 先提示，別人才好輸入
        String name = scanner.next(); // 卡住，等待你輸入姓名
        System.out.println("你輸入的姓名是：" + name);
    }
}
