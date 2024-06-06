package cn.dfjy.demo.test;

import cn.dfjy.demo.entity.Dog;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo03 {
    @Test
    public void f01() {
        List list = new ArrayList(); // 默认的容量是10
        // 增
        list.add("中国");
        list.add("美国");
        list.add("日本");
        list.add("韩国");
        list.add("中国");
        // 查
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.contains("美国"));
    }

    @Test
    public void f02() {
        List list = new LinkedList();
        // 增
        list.add("中国");
        list.add("美国");
        list.add("日本");
        list.add("韩国");
        list.add("中国");
        // 查
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
