package cn.dfjy.demo.entity;

// 锁（has a）
public interface Locker {
    // 可推导，可省略。没有写public abstract，也有。
    void lock();
    void unlock();
}
