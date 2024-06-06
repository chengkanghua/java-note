public class Demo10 {
    public static void main(String[] args) {
        String mingci = "1";
        /* switch可以使用哪几种数据类型
        1. byte short int char
        2. String JDK7开始才支持（目前我们使用的是JDK8）
        3. enum 枚举（未来再说）
        3. long float double不支持
         */
        switch (mingci) {
            case "1":
                System.out.println("夏令营");
                break;
            case "2":
                System.out.println("笔记本一台");
                break;
            case "3":
                System.out.println("移动硬盘");
                break;
            default:
                System.out.println("无");
                break;
        }
    }
}
