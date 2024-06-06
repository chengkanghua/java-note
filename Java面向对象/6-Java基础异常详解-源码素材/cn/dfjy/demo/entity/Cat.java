package cn.dfjy.demo.entity;

/**
 * 猫
 */
public class Cat {
    private int id;
    private String name;

    /**
     * 满参构造
     * @param id    ID
     * @param name  名称
     */
    public Cat(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 字符串的表达
     * @return  字符串
     */
    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
