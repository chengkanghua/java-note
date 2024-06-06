package cn.learn.day19;

public class FindTest {

	// �Զ����Ա����ʵ�����Բ����㷨
	// �Ӳ���ָ���������в��Ҳ���ָ��Ԫ�����ڵ��±겢���س���
	public static int find(int[] arr, int num) {
		for(int i = 0; i < arr.length; i++) {
			if(num == arr[i]) {
				return i; // ��ʾ���ҳɹ�
			}
		}
		return -1; // ��ʾ����ʧ��
	}
	
	// �Զ����Ա����ʵ�ֶ��ֲ����㷨
	public static int findBinary(int[] arr, int left, int right, int num) {
		// ����������������1��Ԫ��ʱ���в��ҵı�Ҫ��
		if(left <= right) {
			// 1.�����м�������±꣬�ҵ��м�Ԫ��
			int p = (left + right)/2;
			// 2.ʹ��Ŀ��Ԫ�����м�Ԫ�رȽ��Ƿ���ȣ��������ֱ�ӷ����±�
			if(num == arr[p]) {
				return p;
			}
			// 3.��Ŀ��Ԫ��С���м�Ԫ�أ���ȥ�м�Ԫ�ص���߲��ң�ʹ�õݹ��˼��
			if(num < arr[p]) {
				return findBinary(arr, left, p-1, num);
			}
			// 4.��Ŀ��Ԫ�ش����м�Ԫ�أ���ȥ�м�Ԫ�ص��ұ߲��ң�ʹ�õݹ��˼��
			return findBinary(arr, p+1, right, num);
		}
		return -1; //��ʾ����ʧ��
	}
	
	public static void main(String[] args) {
		
		int[] brr = {10, 20, 30, 40, 50};
		int num = 25;
		//int res = FindTest.find(brr, num);
		int res = FindTest.findBinary(brr, 0, 4, num);
		if(-1 == res) {
			System.out.println(num + "����ʧ�ܣ�");
		} else {
			System.out.println(num + "�������е��±��ǣ�" + res);
		}
	}

}
