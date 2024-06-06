package cn.learn.day19;

public class FindTest {

	// 自定义成员方法实现线性查找算法
	// 从参数指定的数组中查找参数指定元素所在的下标并返回出来
	public static int find(int[] arr, int num) {
		for(int i = 0; i < arr.length; i++) {
			if(num == arr[i]) {
				return i; // 表示查找成功
			}
		}
		return -1; // 表示查找失败
	}
	
	// 自定义成员方法实现二分查找算法
	public static int findBinary(int[] arr, int left, int right, int num) {
		// 样本数列中至少有1个元素时才有查找的必要性
		if(left <= right) {
			// 1.计算中间运算的下标，找到中间元素
			int p = (left + right)/2;
			// 2.使用目标元素与中间元素比较是否相等，若相等则直接返回下标
			if(num == arr[p]) {
				return p;
			}
			// 3.若目标元素小于中间元素，则去中间元素的左边查找，使用递归的思想
			if(num < arr[p]) {
				return findBinary(arr, left, p-1, num);
			}
			// 4.若目标元素大于中间元素，则去中间元素的右边查找，使用递归的思想
			return findBinary(arr, p+1, right, num);
		}
		return -1; //表示查找失败
	}
	
	public static void main(String[] args) {
		
		int[] brr = {10, 20, 30, 40, 50};
		int num = 25;
		//int res = FindTest.find(brr, num);
		int res = FindTest.findBinary(brr, 0, 4, num);
		if(-1 == res) {
			System.out.println(num + "查找失败！");
		} else {
			System.out.println(num + "在数组中的下标是：" + res);
		}
	}

}
