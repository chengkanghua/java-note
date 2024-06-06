import java.util.Arrays;

public class Demo08 {
    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z'};
        System.out.print("原字符序列：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.print("升续排序后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("逆序输出后：");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
