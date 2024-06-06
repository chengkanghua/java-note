package cn.dfjy.demo;

public class Test10 {
    public static void main(String[] args) {
        try {
            f01("公");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("正常结束");
    }

    public static void f01(String sex) throws MyException {
        if (!"男".equals(sex) && !"女".equals(sex)) throw new MyException("性别必须是男或女");
        System.out.println("性别正确");
    }

}
