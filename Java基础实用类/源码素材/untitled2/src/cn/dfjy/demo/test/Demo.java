package cn.dfjy.demo.test;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        student.sex = Sex.FEMAIL;
        System.out.println(student.sex);
        student.sex = Sex.MAIL;
        System.out.println(student.sex);
    }
}
