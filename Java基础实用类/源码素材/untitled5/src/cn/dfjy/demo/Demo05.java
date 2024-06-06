package cn.dfjy.demo;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Demo05 {
    @Test
    public void f01() {
        Calendar calendar1 = new GregorianCalendar(2020, 3, 25); // 不推荐使用
        System.out.println(calendar1.get(Calendar.YEAR));
        System.out.println(calendar1.get(Calendar.MONDAY));
        System.out.println(calendar1.get(Calendar.DATE));
    }

    @Test
    public void f02() {
        /*
        开发中推荐
        static Calendar getInstance() 使用默认时区和语言环境获得一个日历。
         */
        Calendar calendar1 = Calendar.getInstance(); // 当前时间点
        System.out.println(calendar1.getClass()); // class java.util.GregorianCalendar
        System.out.println(calendar1.get(Calendar.YEAR));
        System.out.println(calendar1.get(Calendar.MONDAY)); // 美国认为月份从0起计
        System.out.println(calendar1.get(Calendar.DATE));
    }

    @Test
    public void f03() {
        Calendar calendar1 = Calendar.getInstance(); // 当前时间点
        calendar1.setTimeInMillis(0);
        System.out.println(calendar1.get(Calendar.YEAR));
        System.out.println(calendar1.get(Calendar.MONDAY));
        System.out.println(calendar1.get(Calendar.DATE));
        System.out.println(calendar1.get(Calendar.HOUR));
        System.out.println(calendar1.get(Calendar.MINUTE));
        System.out.println(calendar1.get(Calendar.SECOND));
    }

    @Test
    public void f04() {
        Calendar calendar1 = Calendar.getInstance(); // 当前时间点
        calendar1.set(Calendar.YEAR, 1999);
        calendar1.set(Calendar.MONDAY, 9);
        calendar1.set(Calendar.DATE, 1);
        calendar1.set(Calendar.HOUR, 8);
        calendar1.set(Calendar.MINUTE, 10);
        calendar1.set(Calendar.SECOND, 30);

        System.out.println(calendar1.get(Calendar.YEAR));
        System.out.println(calendar1.get(Calendar.MONDAY));
        System.out.println(calendar1.get(Calendar.DATE));
        System.out.println(calendar1.get(Calendar.HOUR));
        System.out.println(calendar1.get(Calendar.MINUTE));
        System.out.println(calendar1.get(Calendar.SECOND));
    }

    @Test
    public void f05() {
        Calendar calendar1 = Calendar.getInstance(); // 当前时间点
        // Calendar 转 Date
        Date date1 = calendar1.getTime();
        System.out.println(date1);
        // Date 转 Calendar
        Calendar calendar2 = Calendar.getInstance();
        date1.setTime(0);
        calendar2.setTime(date1);
        System.out.println(calendar2.get(Calendar.YEAR));
    }

}
