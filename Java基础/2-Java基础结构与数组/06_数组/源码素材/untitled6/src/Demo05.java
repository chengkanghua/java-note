import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arrJingE = new double[5];
        for (int i = 0; i < arrJingE.length; i++) {
            System.out.print("请输入第"+(i+1)+"笔的金额：");
            arrJingE[i] = scanner.nextDouble();
        }
        System.out.println("序号\t金额");
        double sum = 0.0;
        for (int i = 0; i < arrJingE.length; i++) {
            System.out.println((i+1) + "\t" + arrJingE[i]);
            sum += arrJingE[i];
        }
        System.out.println("总金额\t" + sum);
    }
}
