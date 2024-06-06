public class Demo11 {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 8, 4, 5, 2, -1, 56, 33, 1},
                {110, 18, 14, 15, 12, -11, 156, 133, 11},
                {1110, 118, 114, 115, 112, -111, 1156, 1133, 113}
        };
        // 二重循环
        // 外层循环 行数
        for (int i=0; i<arr.length; i++) { // arr.length是3
            // 内存循环 行内数据
            for (int j=0; j<arr[i].length; j++) { // arr[0]第一行数组 arr[1]第二行数组 arr[2]第三行数组
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); // 换行
        }
    }
}
