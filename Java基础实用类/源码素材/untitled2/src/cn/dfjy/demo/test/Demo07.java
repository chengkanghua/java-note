package cn.dfjy.demo.test;

import org.junit.Test;

import java.util.Arrays;

public class Demo07 {
    @Test
    public void f01() {
        String s1 = "abc";
        String s1_bak = s1;
        System.out.println("拼接前：" + s1);
        s1 += "def";
        System.out.println("拼接后：" + s1);
        System.out.println("备份bak：" + s1_bak);
    }

    @Test
    public void f02() {
        StringBuffer s1 = new StringBuffer("abc");
        StringBuffer s1_bak = s1;
        System.out.println("拼接前：" + s1);
        s1.append("def");
        System.out.println("拼接后：" + s1);
        System.out.println("备份bak：" + s1_bak);
    }

    @Test
    public void f03() {
        final char value[] = {'a','b','c'};
        System.out.println(Arrays.toString(value));
        // value = new char[32]; // final无法扩容

        char[] toStringCache = {'a','b','c', ' ', ' ', ' '};
        toStringCache[3] = 'd';
        toStringCache[4] = 'e';
        toStringCache[5] = 'f';
        toStringCache = new char[32]; // 不是final可以扩容
        // 将原来的字符串进行复制搬家
    }
}
