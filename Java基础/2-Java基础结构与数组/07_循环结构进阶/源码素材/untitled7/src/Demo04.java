public class Demo04 {
    public static void main(String[] args) {
        // 二重循环 外循环行 内循环*
        int number = 5;
        for (int i=1; i<=number; i++) {
            for (int j=1; j<=number-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
