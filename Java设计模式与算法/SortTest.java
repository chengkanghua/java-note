package cn.learn.day19;

public class SortTest {

	// �Զ����Ա����ʵ��ð�������㷨
	public static void bubble(int[] arr) {
		// 1.ʹ�����forѭ�����ڿ��ƱȽϵ�����
		for(int i = 1; i < arr.length; i++) {
			// ����boolean���͵ı�����Ϊ��־λ
			boolean flag = true;
			// 2.ʹ���ڲ�forѭ�����ڿ��Ƶ�ǰ���бȽϵĴ�����
			// Ҳ����Ԫ�ص��±귶Χ
			for(int j = 0; j < arr.length-i; j++) {
				// 3.����һ��Ԫ�رȵڶ���Ԫ�ش��򽻻�����Ԫ�ص�λ��
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = false;
				}
			}
			// ������ѭ��ִ����Ϻ�flag����ֵ����true�����Զ϶����ֱȽϵ�
			// ������û�з����κεĽ���
			if(flag) {
				break; //�������forѭ����ʡ�Ժ������ֵıȽ�
			}
		}
	}
	
	public static void main(String[] args) {
	
		int[] brr = {20, 10, 25, 8, 15, 20, 5, 30, 12};
		// ����ð�������㷨�ķ�����������
		SortTest.bubble(brr);
		// ��ӡ�����Ľ��
		System.out.print("�����Ľ���ǣ�");
		for(int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");
		}
		System.out.println();
	}

}
