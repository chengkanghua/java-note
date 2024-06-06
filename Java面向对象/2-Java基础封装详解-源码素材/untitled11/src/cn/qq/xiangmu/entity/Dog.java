package cn.qq.xiangmu.entity;

public class Dog {
    private String name;
    private int health;
    private int love;
    private String strain;

    // ���˽��飬û��ʲô����Ҫ��ʱ���ṩ�޲κ����ι��캯������

    // Ĭ��ϵͳ���ṩһ���޲εĹ��е�û��ʲô���ݵĹ��캯��
    public Dog() {
        //this("����", 50, 50, "����"); // ���캯���ĵ��ã������ں�����ĵ�һ�С�������ݹ���ѭ�����á�ʵ�ʿ�������ʹ�ã�
    }

    // ����Զ������вι��캯����ϵͳ�Ͳ����ṩ�޲ι��캯��
    public Dog(String name, int health, int love, String strain) {
        //this(); // ���캯���ĵ��ã������ں�����ĵ�һ�С�������ݹ���ѭ�����á�ʵ�ʿ�������ʹ�ã�
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
        System.out.println("������԰�");
        System.out.println("�ҵ����ֽ�"+name+"������ֵ��"+health+"�������˵����ܶ���"+love+"������һֻ"+strain);
    }
}
