package study.prob09;

public class MinMax {

	public static void main(String[] args) {
		// �� ������ �迭 10���� 5 ~ 200 ������ ������ �Է��ϰ�
		//  �ִ밪�� �ּҰ� ���
		
		int[] arr = new int[10];
		int max = 0;
		int min = 201;
		
		
		for(int i=0; i<arr.length; i ++) {
			arr[i] = (int)(Math.random()*(200-5)+6);
			System.out.print(arr[i]+" ");
			
			if(arr[i]>max) {
				max = arr[i];
			}
			
			if(arr[i]<min) {
				min = arr[i];
			}
			
		}
		System.out.println();
		System.out.println("�ִ� �� : "+max);
		System.out.println("�ּ� �� : "+min);

	}

}
