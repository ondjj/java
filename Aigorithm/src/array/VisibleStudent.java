package array;

import java.util.Scanner;

public class VisibleStudent {

	public static void main(String[] args) {
//		2. ���̴� �л�
//		����
//		�������� N���� �л��� �Ϸķ� �������ϴ�. �Ϸķ� �� �ִ� �л��� Ű�� �տ������� ������� �־��� ��, �� �տ� �� �ִ�
//		�������� �� �� �ִ� �л��� ���� ���ϴ� ���α׷��� �ۼ��ϼ���. (�տ� �� �ִ� ����麸�� ũ�� ���̰�, �۰ų� ������ ������ �ʽ��ϴ�.)
		
//		�Է�
//		ù �ٿ� ���� N(5<=N<=100,000)�� �Էµȴ�. �� �����ٿ� N���� �л��� Ű�� �տ������� ������� �־�����.
//		���
//		�������� �� �� �ִ� �ִ��л����� ����Ѵ�.
//		���� �Է� 1 
//		8
//		130 135 148 140 145 150 150 153
//		���� ��� 1
//		5
		
		Scanner in = new Scanner(System.in);
	
		int n = in.nextInt();
		
		int[] arr = new int[n];
		
		int answer = 1;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				answer ++; 
				max=arr[i];
			}
		}
		
		System.out.print(answer);
	

	}

}
