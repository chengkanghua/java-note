import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) {
        int[] y = {10, 20, 30};
        f01(y); // y实参。都是值传递。
        System.out.println("y: " + Arrays.toString(y));
    }

    /*
        x，形参
     */
    public static void f01(int[] x) {
        System.out.println(Arrays.toString(x));
        x[1]++;
        System.out.println(Arrays.toString(x));
    }
}
