package study.prob07;

import java.util.Scanner;

public class Main_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����
		 * �� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ�
		 * ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * ���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427 = 17037300 ��
		 * �ǰ�, ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
		 * 
		 * �Է� 
		 * 
		 * ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. A, B, C�� ��� 100���� ũ�ų� ����, 1,000���� ����
		 * �ڿ����̴�.
		 * 
		 * ��� 
		 * ù° �ٿ��� A �� B �� C�� ����� 0 �� �� �� �������� ����Ѵ�. ���������� ��° �ٺ��� �� ��° �ٱ��� A �� B �� C��
		 * ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.
		 */
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		String result = ("")+(A*B*C);
		
		int[] num = {0,1,2,3,4,5,6,7,8,9};
		int[] temp = {0,0,0,0,0,0,0,0,0,0};
		
		int[] arr = new int[result.length()];
		
		for(int i=0; i<result.length();i++) {
			arr[i] = result.charAt(i)-'0';

		}
		
		for(int j=0; j<num.length; j++) {
			for(int i=0;i<arr.length;i++) {
				if(num[j] == arr[i]) {
					temp[j]++;
				}
				
			}
		}
		
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
	}

}
