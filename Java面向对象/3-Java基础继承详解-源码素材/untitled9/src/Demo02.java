public class Demo02 {
    public static void main(String[] args) {
        // 将School类，理解成一种引用数据类型，只不过是自定义的引用数据类型
        // 声明分配空间
        School school = new School();
        // 点访问方法
        school.show();
        // 点访问属性
        school.name = "万科城小学";
        school.jsNumber = 36;
        school.jfNumber = 8;
        // 点访问方法
        school.show();
    }
}
