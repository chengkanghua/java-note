import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名次：");
        int mingci = scanner.nextInt();
        if (mingci == 1) System.out.println("夏令营");
        else if (mingci == 2) System.out.println("笔记本一台");
        else if (mingci == 3) System.out.println("移动硬盘");
        else System.out.println("无");
        // 使用switch的条件：等值判断
        switch (mingci) {
            case 1:
                System.out.println("夏令营");
                break;
            case 2:
                System.out.println("笔记本一台");
                break;
            case 3:
                System.out.println("移动硬盘");
                break;
            default:
                System.out.println("无");
                break;
        }
    }
}
