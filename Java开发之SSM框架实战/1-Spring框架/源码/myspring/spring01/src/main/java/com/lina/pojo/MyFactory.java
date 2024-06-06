package com.lina.pojo;

public class MyFactory {
    /**
     * 实例方法
     * @return
     */
    public Team instanceFun(){
        System.out.println("MyFactory----------instanceFun");
        return new Team(1003,"湖人-实例","洛杉矶");
    }

    /**
     * 静态方法
     * @return
     */
    public static  Team staticFun(){
        System.out.println("MyFactory----------staticFun");
        return new Team(1004,"小牛-静态","达拉斯");
    }

    public static void main(String[] args) {
        Team team = MyFactory.staticFun();
    MyFactory factory=new MyFactory();
        Team team1 = factory.instanceFun();
    }
}
