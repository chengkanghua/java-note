package cn.qq.xiangmu.entity;

public class Yyy {
    int a1;
    public static int a2;

    public Yyy() {
        a1 = 10;
    }

    {
        // ����� ������n�ζ���ǰ��Ĭ�Ͼͻ��Զ�����n��
        a1++;
    }

    static {
        // ��̬����� �����з��ʾ�Ψһ����һ��
        a2++;
    }

    public void f1() {
        System.out.println(a1);
    }
}
