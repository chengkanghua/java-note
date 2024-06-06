package cn.dfjy.demo.test;

import cn.dfjy.demo.entity.Dog;
import org.junit.Test;

import java.util.TreeSet;
import java.util.Set;


public class Demo06 {
    @Test
    public void f01() {
        // 不能重复，无序
        Set set = new TreeSet();
        // 增
        set.add("中国");
        set.add("美国");
        set.add("日本");
        set.add("韩国");
        set.add("中国"); // 相同的
        System.out.println(set.size());
        // 查（无序，没有索引）
        for (Object o : set) {
            System.out.println((String)o);
        }
    }

    @Test
    public void f02() {
        // 不能重复，无序（Set去重，必须保证改写过equals和hashCode方法）
        Set set = new TreeSet();
        // 增
        set.add(new Dog("欧欧", "雪纳瑞"));
        set.add(new Dog("丫丫", "拉布拉多"));
        set.add(new Dog("菲菲", "拉布拉多"));
        set.add(new Dog("美美", "雪纳瑞"));
        set.add(new Dog("欧欧", "雪纳瑞"));
        System.out.println(set.size());
        // 查（无序，没有索引）
        for (Object o : set) {
            System.out.println((Dog)o);
        }
    }

}
