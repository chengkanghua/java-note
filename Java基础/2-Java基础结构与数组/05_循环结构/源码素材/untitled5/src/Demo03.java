public class Demo03 {
    public static void main(String[] args) {
        int n = 1, sum = 0;
        while (n <= 100) {
            if (n % 2 == 0) sum += n;
            n++;
        }
        System.out.println("sum: " + sum);
    }
}
