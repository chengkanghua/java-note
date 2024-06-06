public class Demo02 {
    public static void main(String[] args) {
        // 二重循环 外循环行 内循环*
        int number = 3;
        for (int i=1; i<=number; i++) {
            for (int j=1; j<=number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
