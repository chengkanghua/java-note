package cn.qq.xiangmu.test;

import cn.qq.xiangmu.entity.Dog;
import cn.qq.xiangmu.entity.Penguin;

public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog("ÍúÍú", 60, 40, "ÄÁÑòÈ®"); // ctrl+p
        dog.print();
        System.out.println(dog.toString()); // cn.qq.xiangmu.entity.Dog@1b6d3586

        Penguin penguin = new Penguin("ÃÀÃÀ", 70, 30, Penguin.SEX_FEMALE);
        penguin.print();
        System.out.println(penguin.toString()); // cn.qq.xiangmu.entity.Penguin@4554617c
    }
}
