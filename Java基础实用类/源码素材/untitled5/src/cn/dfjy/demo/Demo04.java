package cn.dfjy.demo;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo04 {
    @Test
    public void f01() {
        Date date1 = new Date();
        Date date2 = new Date(0L); // 0代表是1970.1.1 0:00格林威治时间（中国东八区1970.1.1 +8:00）
        System.out.println(date1);
        System.out.println(date2);
    }

    @Test
    public void f02() throws ParseException {
        /* 字符串 2022-03-25 转成 Date对象
        字母  日期或时间元素  表示  示例
        y  年  Year  1996; 96
        M  年中的月份  Month  July; Jul; 07
        d  月份中的天数  Number  10
        */
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = df.parse("2022-03-25 14:23:30");
        System.out.println(date);
    }

    @Test
    public void f03() throws ParseException {
        /*
        Date对象 转成 字符串 2022-03-25
        */
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String str = df.format(date);
        System.out.println(str);
    }

    @Test
    public void f04() throws ParseException {
        /*
         long getTime()
          返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        */
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());
    }
}
