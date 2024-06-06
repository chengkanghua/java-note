public class Demo06 {
    public static void main(String[] args) {
        // 将School类，理解成一种引用数据类型，只不过是自定义的引用数据类型
        // 声明分配空间
        School school1 = new School();
        School school2 = new School();
        System.out.printf("%x\n", school1.hashCode()); // 内存地址
        System.out.printf("%x\n", school2.hashCode()); // 内存地址
        // 点访问属性
        school1.name = "万科城小学";
        school1.jsNumber = 36;
        school1.jfNumber = 8;
        school2.name = "艾溪湖小学";
        school2.jsNumber = 24;
        school2.jfNumber = 6;
        // 点访问方法
        school1.show();
        school2.show();
    }
}
