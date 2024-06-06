package cn.learn.day19;

public class SortTest {

	// 自定义成员方法实现冒泡排序算法
	public static void bubble(int[] arr) {
		// 1.使用外层for循环用于控制比较的轮数
		for(int i = 1; i < arr.length; i++) {
			// 声明boolean类型的变量作为标志位
			boolean flag = true;
			// 2.使用内层for循环用于控制当前轮中比较的次数，
			// 也就是元素的下标范围
			for(int j = 0; j < arr.length-i; j++) {
				// 3.若第一个元素比第二个元素大，则交换两个元素的位置
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = false;
				}
			}
			// 当上述循环执行完毕后flag的数值还是true，可以断定本轮比较的
			// 过程中没有发生任何的交换
			if(flag) {
				break; //跳出外层for循环，省略后续几轮的比较
			}
		}
	}
	
	public static void main(String[] args) {
	
		int[] brr = {20, 10, 25, 8, 15, 20, 5, 30, 12};
		// 调用冒泡排序算法的方法进行排序
		SortTest.bubble(brr);
		// 打印排序后的结果
		System.out.print("排序后的结果是：");
		for(int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");
		}
		System.out.println();
	}

}
