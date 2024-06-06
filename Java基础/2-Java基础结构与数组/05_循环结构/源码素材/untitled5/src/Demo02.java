public class Demo02 {
    public static void main(String[] args) {
        /*
        do {
            循环的体（内容）;
            更新条件;
        } while(条件);
        1 +到 100，5050
         */
        int i = 1, sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println("和：" + sum);
    }
}
