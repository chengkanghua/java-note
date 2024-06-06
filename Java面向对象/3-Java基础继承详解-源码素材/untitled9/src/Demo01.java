public class Demo01 {
    public static void main(String[] args) {
        // 将School类，理解成一种引用数据类型，只不过是自定义的引用数据类型
        // 1. 声明
        School school;
        // 2. 分配空间
        school = new School();
        // 3. 点访问属性
        school.name = "万科城小学";
        school.jsNumber = 36;
        school.jfNumber = 8;
        // 4. 点访问方法
        school.show();
    }
}
