import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("请输入姓名：");
            String name = scanner.next();
            if (name.equals("n")) break; // 提供了一个退出通道
            System.out.print("请输入年龄：");
            int age = scanner.nextInt();
            Visitor visitor = new Visitor(); // 创建对象
            // 自动提示功能
            visitor.name = name;
            visitor.age = age;
            visitor.show();
        }

        System.out.println("退出程序");
    }
}
