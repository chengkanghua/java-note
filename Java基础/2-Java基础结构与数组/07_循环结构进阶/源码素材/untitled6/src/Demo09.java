public class Demo09 {
    public static void main(String[] args) {
        // 二重循环，循环中嵌套循环
        for (int i=1; i<=9; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t"); // 行内效果
            }
            System.out.println(); // 行数
        }
    }
}
