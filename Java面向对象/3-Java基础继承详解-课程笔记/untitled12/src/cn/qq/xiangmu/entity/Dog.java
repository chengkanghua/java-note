package cn.qq.xiangmu.entity;

import java.util.Objects;

public final class Dog extends Pet {
    private String strain;

    public Dog() {
        super(); // 子类默认会自动调用父类的无参的构造函数
    }

    public Dog(String name, int health, int love, String strain) {
        super(name, health, love);
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override // 注解，检查你的重写方法名是否正确
    public void print() {
        super.print();
        System.out.println("，我是一只"+strain);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "strain='" + strain + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(strain, dog.strain);
    }

    @Override
    public void f1() {

    }

}
