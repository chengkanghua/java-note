package cn.qq.xiangmu.priviage;

public class Father {
    /*
    ˽�еģ������ڲ����ܷ���
    ������ģ�ͬ������������Ҳ�ܷ���
    �����ģ�ͬ������������Ҳ�ܷ��ʣ�����Ҳ�ܷ���
    ���еģ��κ�����Ҳ�ܷ���
     */
    private int a1 = 1; // ˽�е�
    int a2 = 2; // �������
    protected int  a3 = 3; // ������
    public int a4 = 4; // ���е�

    private void f1() {
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
