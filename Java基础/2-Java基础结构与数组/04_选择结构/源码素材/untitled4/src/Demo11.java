public class Demo11 {
    public static void main(String[] args) {
        String mingci = "星期一";
        // 透传现象的使用场景
        switch (mingci) {
            case "星期一":
            case "星期三":
                System.out.println("画画");
                break;
            case "星期二":
                System.out.println("休息");
                break;
            case "星期四":
                System.out.println("休息");
                break;
            case "星期五":
                System.out.println("移动硬盘");
                break;
            case "星期六":
            case "星期天":
                System.out.println("街舞");
                break;
            default:
                System.out.println("错误值");
                break;
        }
    }
}
