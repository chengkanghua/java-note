import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 1, 23, 344, 12};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        Arrays.sort(arr); // 排序
        System.out.println(arr); // 打印数组名时，输出的是 [代表数组 I代表整数 @8位十六进制代表内存地址
        System.out.println(Arrays.toString(arr));
    }
}
