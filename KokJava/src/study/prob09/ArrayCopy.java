package study.prob09;

public class ArrayCopy {

	public static void main(String[] args) {
		//������ �迭 10���� 1~31 ���� ������ �Է��ϰ� �� �ٸ� �迭�� �ڿ��� ���� �����ؼ� �����迭�� ������ �迭 ���
		
		int[] arr = new int[10];
		
		System.out.print("���� �迭 : ");
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*(31-1)+1)+1;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("���� �迭 : ");
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
