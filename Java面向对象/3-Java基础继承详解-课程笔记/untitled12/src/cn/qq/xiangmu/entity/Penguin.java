package cn.qq.xiangmu.entity;

public class Penguin extends Pet {
    public static final String SEX_MALE = "Q��";
    public static final String SEX_FEMALE = "Q��";
    private String sex;

    public Penguin() {
        super(); // ����ʡ�ԣ��ײ������Զ�����һ���޲ι��캯��
    }

    public Penguin(String name, int health, int love, String sex) {
        super(name, health, love);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("���Ա���"+sex);
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "sex='" + sex + '\'' +
                "} " + super.toString();
    }

    @Override
    public void f1() {

    }
}
