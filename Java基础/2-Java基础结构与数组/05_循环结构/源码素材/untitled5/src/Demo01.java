public class Demo01 {
    public static void main(String[] args) {
        /*
        while (条件) {
            循环的体（内容）;
            更新条件;
        }
        1 +到 100，5050
         */
        int i = 1, sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("和：" + sum);
    }
}
