package cn.dfjy.demo.test;

import org.junit.Test;

public class Demo06 {
    @Test
    public void f01() {
        String s1 = "aBc";
        String s2 = "dEf";
        /*
        字符串的 长度、比较字符串、大小写转换、拼接 方法
         */
        System.out.println("s1的长度：" + s1.length());
        if (s1.equals("abc")) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
        if (s1.equalsIgnoreCase("abc")) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
        System.out.println("转成小写：" + s1.toLowerCase());
        System.out.println("转成大写：" + s1.toUpperCase());
        System.out.println("拼接后的字符串是：" + (s1.concat(s2)));
        System.out.println("拼接后的字符串是：" + (s1 + s2));
    }

    @Test
    public void f02() {
        String str = "风向真变了！一边整治，一边安排央企齐接盘，原来是要下一盘大棋";
        int pos1 = str.indexOf('一');
        int pos2 = str.indexOf('一', 7);
        int pos3 = str.indexOf("一边安排");
        int pos4 = str.indexOf("一边安排", 12);
        int pos5 = str.lastIndexOf('一');
        int pos6 = str.lastIndexOf('一', 7);
        int pos7 = str.lastIndexOf("一边安排");
        int pos8 = str.lastIndexOf("一边安排", 12);
        System.out.println("pos1: " + pos1); // 找的是匹配的第一个 6
        System.out.println("pos2: " + pos2); // 从第7个下标位置开始，找的是匹配的第一个 11
        System.out.println("pos3: " + pos3); // 找的是匹配的第一个 11
        System.out.println("pos4: " + pos4); // 找不到 -1
        System.out.println("pos5: " + pos5); // 找到 26
        System.out.println("pos6: " + pos6); // 找到 26 TODO 6
        System.out.println("pos7: " + pos7); // 找到 11
        System.out.println("pos8: " + pos8); // 找不到 -1 TODO 11
    }

    @Test
    public void f03() {
        String str = "风向真变了！一边整治，一边安排央企齐接盘，原来是要下一盘大棋";
        String substring1 = str.substring(2);
        String substring2 = str.substring(2, 6); // 总结：它们的差值，就是要提取的字符串数目
        System.out.println("substring1: " + substring1);
        System.out.println("substring2: " + substring2);
    }

    @Test
    public void f04() {
        String str = "  \r\n\t风向真变了\r\n\t  ";
        System.out.println("原来字符串的长度：" + str.length());
        System.out.println("去除边角料的字符串：" + str.trim());
        System.out.println("去除边角料的长度：" + str.trim().length());
    }

    @Test
    public void f05() {
        String str = "abc\r\ndef\r\nghi";
        String[] arr = str.split("\r\n");
        System.out.println("切割后得到的字符串数组长度：" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i]: " + arr[i]);
        }
    }
}
