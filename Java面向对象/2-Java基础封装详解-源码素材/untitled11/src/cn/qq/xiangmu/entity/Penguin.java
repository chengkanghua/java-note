package cn.qq.xiangmu.entity;

public class Penguin {
    private String name;
    private int health;
    private int love;
    private String sex;

    public Penguin() {
    }

    public Penguin(String name, int health, int love, String sex) {
        this.name = name;
        this.health = health;
        this.love = love;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void print() {
        System.out.println("������԰�");
        System.out.println("�ҵ����ֽ�"+name+"������ֵ��"+health+"�������˵����ܶ���"+love+"���Ա���"+sex);
    }
}
