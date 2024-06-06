import java.util.Arrays;

public class Demo10 {
    public static void main(String[] args) {
        // 二重循环
        int[] arr = {10, 8, 4, 5, 2, -1, 56, 33};
        // 模拟Arrays.sort(arr)方法
        // 外层循环 n-1
        for (int i=0; i<arr.length-1; i++) {
            // 内层循环 n-1-i
            for (int j=0; j<arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
