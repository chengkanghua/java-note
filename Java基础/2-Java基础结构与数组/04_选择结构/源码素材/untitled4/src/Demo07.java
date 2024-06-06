import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入是否是会员（y/n）：");
        String yesno = scanner.next();
        // == 用于基本数据类型(byte short int long float double char boolean)的比较
        // 字符串的比较，采用字符串的equals()方法
        if (yesno.equals("y")) {
            System.out.println("是会员");
        } else {
            System.out.println("不是会员");
        }
    }
}
