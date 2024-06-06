package cn.dfjy.demo.test;

import cn.dfjy.demo.entity.Dog;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo04 {
    @Test
    public void f01() {
        List list = new ArrayList(); // 默认容器是10
        // 增，只装了4个对象
        list.add(new Dog("欧欧", "雪纳瑞"));
        list.add(new Dog("丫丫", "拉布拉多"));
        list.add(new Dog("菲菲", "拉布拉多"));
        list.add(new Dog("美美", "雪纳瑞"));
        // 查
        System.out.println("共有" + list.size() + "条狗");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void f02() {
        List list = new ArrayList(); // 默认容器是10
        // 增，只装了4个对象
        list.add(new Dog("欧欧", "雪纳瑞"));
        list.add(new Dog("丫丫", "拉布拉多"));
        list.add(new Dog("菲菲", "拉布拉多"));
        list.add(new Dog("美美", "雪纳瑞"));
        // 查
        System.out.println("共有" + list.size() + "条狗");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // contains包含 remove移除，必须保证Dog里面改写过equals方法
        System.out.println(list.contains(new Dog("菲菲", "拉布拉多")));
        System.out.println("----------------------");
        list.remove(new Dog("菲菲", "拉布拉多")); // 返回的是真假
        // list.remove(2); // 返回的是Dog("菲菲", "拉布拉多")对象
        System.out.println(list.contains(new Dog("菲菲", "拉布拉多")));
    }

    @Test
    public void f03() {
        LinkedList list = new LinkedList(); // 默认容器是10
        // 增，只装了4个对象
        list.add(new Dog("欧欧", "雪纳瑞"));
        list.add(new Dog("丫丫", "拉布拉多"));
        list.add(new Dog("菲菲", "拉布拉多"));
        list.add(new Dog("美美", "雪纳瑞"));
        // 首尾各增加一个（list数据类型，必须是子类类型）
        list.addFirst(new Dog("丽丽1", "牧羊犬1"));
        list.addLast(new Dog("丽丽2", "牧羊犬2"));
        // 查
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void f04() {
        LinkedList list = new LinkedList(); // 默认容器是10
        // 增，只装了4个对象
        list.add(new Dog("欧欧", "雪纳瑞"));
        list.add(new Dog("丫丫", "拉布拉多"));
        list.add(new Dog("菲菲", "拉布拉多"));
        list.add(new Dog("美美", "雪纳瑞"));
        // 首尾各读取一个（list数据类型，必须是子类类型）
        Dog dogFirst = (Dog)list.getFirst();
        Dog dogLast = (Dog)list.getLast();
        System.out.println(dogFirst);
        System.out.println(dogLast);
        // 查
        System.out.println("遍历：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void f05() {
        LinkedList list = new LinkedList(); // 默认容器是10
        // 增，只装了4个对象
        list.add(new Dog("欧欧", "雪纳瑞"));
        list.add(new Dog("丫丫", "拉布拉多"));
        list.add(new Dog("菲菲", "拉布拉多"));
        list.add(new Dog("美美", "雪纳瑞"));
        // 首尾各移除一个（list数据类型，必须是子类类型）
        Dog dogFirst = (Dog)list.removeFirst();
        Dog dogLast = (Dog)list.removeLast();
        System.out.println(dogFirst);
        System.out.println(dogLast);
        // 查
        System.out.println("遍历：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
