import java.util.Arrays;

/*
boolean equals(array1,array2)	比较array1和array2两个数组是否相等
void fill(array,val)	        把数组array所有元素都赋值为val
copyOf(array,length)	        把数组array复制成一个长度为length的新数组，返回类型与复制的数组一致
int binarySearch(array, val)	查询元素值val在数组array中的下标（要求数组中元素已经按升序排列）
 */
public class Demo07 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{8, 4, 2, 1, 23, 344, 12};
        int[] arr2 = new int[]{8, 4, 2, 1, 23, 344, 12};
        System.out.println(Arrays.equals(arr1, arr2));
        Arrays.fill(arr1, 11);
        System.out.println(Arrays.toString(arr1));
        int[] arr3 = Arrays.copyOf(arr2, 8);
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr2); // [1, 2, 4, 8, 12, 23, 344]
        System.out.println(Arrays.toString(arr2));
        int pos = Arrays.binarySearch(arr2, 0); // 没有找到，返回插入点的下标取负数再-1
        System.out.println("pos: " + pos);
    }
}
