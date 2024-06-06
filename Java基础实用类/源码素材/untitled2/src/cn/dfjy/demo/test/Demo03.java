package cn.dfjy.demo.test;

import org.junit.Test;


public class Demo03 {
    @Test
    public void test01() {
        // Integer -> 字符串（不可能产生异常）
        Integer i1 = 123;
        String s1 = Integer.toString(i1);
        String s2 = String.valueOf(i1);
        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void test02() {
        // 字符串 -> Integer（可能产生异常java.lang.NumberFormatException）
        String s1 = "123";
        Integer i1 = Integer.parseInt(s1); // parse解析
        System.out.println(i1);
    }

}
