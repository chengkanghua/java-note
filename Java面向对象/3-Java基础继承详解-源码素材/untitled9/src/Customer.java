public class Customer {
    int jifeng; // 积分
    String type; // 卡类型

    public void show() {
        System.out.println("积分：" + jifeng + "，卡类型：" + type);
    }

    public void huikui() {
        // 金卡客户积分大于1000分或普卡客户积分大于5000，获得回馈积分500分
        if (("金卡".equals(type) && jifeng>1000) || ("普卡".equals(type) && jifeng>5000)) {
            System.out.println("回馈积分500分！");
        } else {
            System.out.println("谢谢惠顾！");
        }
    }
}
