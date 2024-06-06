package cn.dfjy.demo;

import org.junit.Test;

import java.util.Random;

public class Demo02 {
    @Test
    public void f01() {
        System.out.println(Math.random()); // 该值大于等于 0.0 且小于 1.0。
        System.out.println((int)(Math.random()*3) + 1); // m总个数，n起始值
    }

    @Test
    public void f02() {
        Random random = new Random(); // 不要自己种种子进去，默认底层使用时钟作为种子
        System.out.println(random.nextDouble()); // 返回一个从 0.0d（包括）到 1.0d（不包括）范围
        // 返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
        System.out.println(random.nextInt(3) + 1);
    }
}
