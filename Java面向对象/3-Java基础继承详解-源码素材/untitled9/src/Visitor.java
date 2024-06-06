public class Visitor {
    String name;
    int age;

    public void show() {
        if (age <= 10) System.out.println(name + "的年龄为：" + age + "，门票免费");
        else System.out.println(name + "的年龄为：" + age + "，门票价格为：20元");
    }
}
