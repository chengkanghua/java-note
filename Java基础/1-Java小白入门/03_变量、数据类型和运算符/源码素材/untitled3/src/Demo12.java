public class Demo12 {
    public static void main(String[] args) {
        // 八個基本數據類型
        /* 整數
              1個字節 byte     -128 -> +127
              2個字節 short    -32768 -> +32767
              *4個字節 int      -21億 -> +21億 大約
              8個字節 long     -21....億 -> +21....億
         */
        byte b1 = Byte.MAX_VALUE;
        System.out.println(b1);
        short s1 = Short.MAX_VALUE;
        System.out.println(s1);
        int i1 = Integer.MAX_VALUE;
        System.out.println(i1);
        long l1 = Long.MAX_VALUE;
        System.out.println(l1);
        /* 小數，本質是一個近似值
              4個字節 float -3.4028235E38 -> 3.4028235E38 大約3後面有38個零
              *8個字節 double -1.7976931348623157E308 -> 1.7976931348623157E308 大約1後面有308個零
         */
        float f = Float.MAX_VALUE;
        System.out.println(f);
        double d = Double.MAX_VALUE;
        System.out.println(d);
        /* 字符
              2個字節 char 0-65535 唯一沒有負數概念的
         */
        char c1 = Character.MIN_VALUE;
        char c2 = Character.MAX_VALUE;
        System.out.println((int)c1);
        System.out.println((int)c2);
        /* 布爾
              1個字節 boolean 不是數值概念，而是一個真假 0000 000-
         */
        boolean bool1 = Boolean.FALSE;
        boolean bool2 = Boolean.TRUE;
        System.out.println(bool1);
        System.out.println(bool2);
    }
}
