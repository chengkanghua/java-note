public class Demo01 {
    public static void main(String[] args) { // java Demo01 zs ls ww
        // 声明一个数组，指明了里面只能存放 整数
        int arr[];
        // 赋值
        arr = new int[5];
        // 给数组里面的5个成员，都分别给个成绩
        // arr[0] arr[1] arr[2] arr[3] arr[4]
        arr[0] = 60;
        arr[1] = 61;
        arr[2] = 62;
        arr[3] = 63;
        arr[4] = 64;
        // 使用
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
}
