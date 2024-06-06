package cn.dfjy.demo.test;

import org.junit.Test;


public class Demo04 {
    @Test
    public void test01() {
        int a = 0;
        Integer i = new Integer(a); // 手动完成装箱
        a = i.intValue(); // 手动完成卸箱
    }

    @Test
    public void test02() {
        int a = 0;
        Integer i = a; // 自动完成装箱（JDK5开始支持）
        a = i; // 自动完成卸箱（JDK5开始支持）
    }

    void test03() {
        Byte byteValue = new Byte("21");
        //Character charValue1 = Character.valueOf("x");
        Character charValue2 = Character.valueOf('x');
        Integer intValue = Integer.valueOf("21");

        int i = Integer.parseInt("25");
        String s1 = Integer.toString(i);
        Integer iObj = new Integer(25);
        //String s2 = iObj.intValue();
        String s3 = 25+"";
        //char sex = Character.parseChar("男");
    }

}
