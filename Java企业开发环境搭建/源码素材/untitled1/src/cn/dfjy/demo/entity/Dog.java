package cn.dfjy.demo.entity;

import java.util.Objects;

public class Dog implements Comparable<Dog> {
    private String name;
    private String strain;

    public Dog() {
    }

    public Dog(String name, String strain) {
        this.name = name;
        this.strain = strain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public String toString() {
        return name + "\t\t" + strain;
    }

    // 在List Set的方法中要使用
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) &&
                Objects.equals(strain, dog.strain);
    }

    // 在Set的方法中要使用
    @Override
    public int hashCode() {
        return Objects.hash(name, strain);
    }

    @Override
    public int compareTo(Dog o) {
        return name.compareTo(o.name) + strain.compareTo(o.strain);
    }
}















