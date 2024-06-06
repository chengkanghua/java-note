package cn.dfjy.demo.test;

import cn.dfjy.demo.entity.ThiefProventDoor;

public class Demo01 {
    public static void main(String[] args) {
        ThiefProventDoor thiefProventDoor = new ThiefProventDoor();
        System.out.println("上班");
        thiefProventDoor.open();
        thiefProventDoor.close();
        thiefProventDoor.lock();
        System.out.println("下班回家");
        thiefProventDoor.unlock();
        thiefProventDoor.take();
        thiefProventDoor.open();
        thiefProventDoor.close();
    }
}
