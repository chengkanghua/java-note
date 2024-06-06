public class Demo03 {
    public static void main(String[] args) {
        System.out.println(args.length); // 0
        // java的数组，天然有一个只读属性，它的名字叫length
        int[] arr = {81,82,83,84,85,86,87,88};
        System.out.println(arr.length);
        System.out.println("数组里面的信息：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
