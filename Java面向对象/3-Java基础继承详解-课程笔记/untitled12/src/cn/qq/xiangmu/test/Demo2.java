package cn.qq.xiangmu.test;

import cn.qq.xiangmu.entity.Dog;

public class Demo2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("����", 61, 41, "����Ȯ");
        Dog dog2 = new Dog("����", 60, 40, "����Ȯ");
        System.out.println(dog1 == dog2); // �ж����ñ����ĵ�ַ�Ƿ���ͬ���ǲ���һ������
        System.out.println(Integer.toHexString(dog1.hashCode())); // 1b6d3586
        System.out.println(Integer.toHexString(dog2.hashCode())); // 4554617c
        // ���һ�£���ȵĸ�������Ƿ���ȣ��綨Ϊ���
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.getClass().toString());
    }
}
