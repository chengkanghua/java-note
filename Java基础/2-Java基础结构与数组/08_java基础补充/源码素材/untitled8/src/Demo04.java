public class Demo04 {
    public static void main(String[] args) {
        int y = 10;
        f01(y); // y实参。都是值传递。
        System.out.println("Y:" + y);
    }

    /*
        x，形参
     */
    public static void f01(int x) {
        System.out.println(x);
        x++;
        System.out.println(x);
    }
}
