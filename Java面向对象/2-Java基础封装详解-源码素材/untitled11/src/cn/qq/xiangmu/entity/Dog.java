package cn.qq.xiangmu.entity;

public class Dog {
    private String name;
    private int health;
    private int love;
    private String strain;

    // 个人建议，没有什么特殊要求时，提供无参和满参构造函数即可

    // 默认系统会提供一个无参的公有的没有什么内容的构造函数
    public Dog() {
        //this("匿名", 50, 50, "土狗"); // 构造函数的调用，必须在函数体的第一行。不允许递归死循环调用。实际开发很少使用！
    }

    // 如果自定义了有参构造函数，系统就不再提供无参构造函数
    public Dog(String name, int health, int love, String strain) {
        //this(); // 构造函数的调用，必须在函数体的第一行。不允许递归死循环调用。实际开发很少使用！
        this.name = name;
        this.health = health;
        this.love = love;
        this.strain = strain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) health = 0;
        if (health > 100) health = 100;
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public void print() {
        System.out.println("宠物的自白");
        System.out.println("我的名字叫"+name+"，健康值是"+health+"，和主人的亲密度是"+love+"，我是一只"+strain);
    }
}
