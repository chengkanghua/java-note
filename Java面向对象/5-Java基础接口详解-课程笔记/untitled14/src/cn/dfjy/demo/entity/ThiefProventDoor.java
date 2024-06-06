package cn.dfjy.demo.entity;

// 它本质上，类同于C++的多继承
public class ThiefProventDoor extends Door implements Locker, Photograph {
    @Override
    public void open() {
        System.out.println("开门");
    }

    @Override
    public void close() {
        System.out.println("关门");
    }

    @Override
    public void lock() {
        System.out.println("左转三圈，上锁");
    }

    @Override
    public void unlock() {
        System.out.println("右转三圈，解锁");
    }

    @Override
    public void take() {
        System.out.println("默默地拍照一张");
    }
}
