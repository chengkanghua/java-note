import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {8, 4, 2, 1, 23, 344, 12};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // 累计
            System.out.println(arr[i]); // 输出
        }
        System.out.println("和：" + sum);
        System.out.print("输入一个数：");
        int number = scanner.nextInt();
        boolean bFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                bFound = true;
                break;
            }
        }
        System.out.println(bFound ? "找到" : "没有找到"); // 唯一的三元操作符
    }
}
