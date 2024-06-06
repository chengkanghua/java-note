package cn.dfjy.demo.test;

import org.junit.Test;

import java.util.*;

public class Demo01 {
    @Test
    public void f01() {
        // 有序
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println("\n遍历方式");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n遍历方式");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    @Test
    public void f02() {
        // 无序
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(9);
        System.out.println("\n遍历方式");
        for (Integer i : set) {
            System.out.print(i + " ");
        }
    }

    @Test
    public void f03() {
        // 有序
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println("\n遍历方式");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }

    @Test
    public void f04() {
        // 无序
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(9);
        System.out.println("\n遍历方式");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }
}
