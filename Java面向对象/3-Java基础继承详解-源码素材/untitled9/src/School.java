// 类名
public class School {
    // 属性
    String name; // 名称
    int jsNumber; // 教室数目
    int jfNumber; // 机房数目

    // 方法
    public void show() {
        System.out.printf("%x\n", this.hashCode()); // 内存地址
        System.out.println("名称：" + name + "，教室数目：" + jsNumber
                + "，机房数目：" + jfNumber);
    }
}
