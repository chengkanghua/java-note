public class Demo07 {
    public static void main(String[] args) {
        /*
        1 +到 100，5050
        特点：循环次数固定下来的。建议使用for循环。
        for (声明初始化循环变量; 条件; 修改循环变量) {
            循环体;
        }
         */
        int sum = 0;
        for (int i=0; i<=100; i++) {
            sum += i;
        }
        System.out.println("和：" + sum);
    }
}
