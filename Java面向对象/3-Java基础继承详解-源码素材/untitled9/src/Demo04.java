import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin(); // 准备一张卡
        admin.name = "admin1";
        admin.password = "111111";

        // 试图修改该卡的密码
        System.out.print("请输入用户名：");
        String name = scanner.next();
        System.out.print("请输入密码：");
        String password = scanner.next();
        // 核对
        if (name.equals(admin.name) && password.equals(admin.password)) {
            System.out.print("请输入新密码：");
            admin.password = scanner.next(); // 一定要更新到对象的属性上，才叫修改
            System.out.println("密码修改成功，你的新密码是：" + admin.password);
        } else {
            System.out.println("用户名或密码不正确！你没有修改权限。");
        }
    }
}
