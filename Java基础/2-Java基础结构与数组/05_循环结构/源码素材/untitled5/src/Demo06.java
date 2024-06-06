public class Demo06 {
    public static void main(String[] args) {
        /*
            使用do-while实现：输出 *摄氏温度 与 *华氏温度的对照表，要求它从摄氏温度0度到250度，每隔20度为一项，对照表中的 *条目 不超过10条。
            转换关系：华氏温度 = 摄氏温度 * 9 / 5.0 + 3
         */
        double huashidu, sheshidu = 0;
        int count = 0;
        do {
            huashidu = sheshidu * 9 / 5.0 + 32;
            System.out.println(sheshidu + " vs. " + huashidu);
            sheshidu += 20;
            count++;
        } while (sheshidu <= 250 && count <= 10);
    }
}
