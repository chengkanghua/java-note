public class Demo14 {
    public static void main(String[] args) {
        /*
        關係運算符：> >= < <= == !=
           經歷了運算之後，結果的數據類型是 布爾
         */
        int a = 10;
        int b = 10;
        boolean r1 = a > b;
        boolean r2 = a >= b;
        boolean r3 = a < b;
        boolean r4 = a <= b;
        boolean r5 = a == b;
        boolean r6 = a != b;
        System.out.println(r1); // false
        System.out.println(r2); // true
        System.out.println(r3); // false
        System.out.println(r4); // true
        System.out.println(r5); // true
        System.out.println(r6); // false
    }
}
