package cn.qq.xiangmu.entity;

import java.util.Objects;

public abstract class Pet extends Object {
    private String name;
    private int health;
    private int love;

    public Pet() {
    }

    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
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
        if (love < 0) love = 0;
        if (love > 100) love = 100;
        this.love = love;
    }

    public void print() {
        System.out.println("������԰�");
        System.out.print("�ҵ����ֽ�"+name+"������ֵ��"+health+"�������˵����ܶ���"+love);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", love=" + love +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return health == pet.health &&
                love == pet.love &&
                Objects.equals(name, pet.name);
    }

    public abstract void f1();
}
