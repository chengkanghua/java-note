public class Demo07 {
    public static void main(String[] args) {
        // 赋值运算符
        int age = 18; // =
        age += 2; // += 等價于 age = age + 2;
        age++; // += 等價于 age = age + 1; 簡化為 age++
        /*
        += ++
        -= --
        *=
        /=
        %=  取模 特別留意，除不乾淨，余下來的那個數
         */
        int year = 2022;
        int result = year % 10; // 余數
        System.out.println("餘數：" + result);
        year %= 100; // year = year % 100;
        System.out.println("餘數：" + year);
    }
}
