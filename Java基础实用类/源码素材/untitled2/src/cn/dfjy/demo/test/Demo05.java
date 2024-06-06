package cn.dfjy.demo.test;

import org.junit.Test;

public class Demo05 {
    @Test
    public void f01() {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "abc";
        String s4 = new String("abc"); // 开辟一块新的空间

        System.out.println(s1 == s2); // true 指向了相同的一块空间
        System.out.println(s2 == s3); // true 指向了相同的一块空间
        System.out.println(s1 == s4); // false s4指向了一块新的空间
    }
}
