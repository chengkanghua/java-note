import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("> 添加客户信息");
        for (int i=1; i<=3; i++) {
            System.out.print("会员号《4位》：");
            int id = scanner.nextInt();
            if (id >= 1000 && id <= 9999) { // 满足条件1
                System.out.print("生日《mm/dd》：");
                String birth = scanner.next();
                if (birth.length() == 5) { // 满足条件2
                    System.out.print("积分：");
                    int jifeng = scanner.nextInt();
                    if (jifeng >= 0) { // 满足条件3
                        System.out.println("会员信息是：\n" + id + "\t" + birth + "\t" + jifeng);
                    }
                }
            }
        }

        System.out.println("程序结束！");
    }
}
