package cn.qq.xiangmu.entity;

public class Penguin extends Pet {
    public static final String SEX_MALE = "Q仔";
    public static final String SEX_FEMALE = "Q妹";
    private String sex;

    public Penguin() {
        super(); // 可以省略，底层会帮你自动调用一个无参构造函数
    }

    public Penguin(String name, int health, int love, String sex) {
        super(name, health, love);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("，性别是"+sex);
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "sex='" + sex + '\'' +
                "} " + super.toString();
    }

    @Override
    public void f1() {

    }
}
