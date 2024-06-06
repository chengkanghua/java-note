package cn.dfjy.demo.entity;

/**
 * 狗
 */
public class Dog {
    private int id;
    private String name;

    /**
     * 满参构造
     * @param id    ID
     * @param name  名称
     */
    public Dog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 字符串的表达
     * @return  字符串
     */
    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
