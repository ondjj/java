package array;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
//		����
//		N���� ������ �Է¹޾�, �ڽ��� �ٷ� �� ������ ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//		(ù ��° ���� ������ ����Ѵ�)
//
//		�Է�
//		ù �ٿ� �ڿ��� N(1<=N<=100)�� �־�����, �� ���� �ٿ� N���� ������ �Էµȴ�.
//
//		���
//		�ڽ��� �ٷ� �� ������ ū ���� �� �ٷ� ����Ѵ�.
//
//		���� �Է�
//		6

//		7 3 9 5 6 12

//		���� ��� 

//		7 9 6 12 

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] arr = new int[n];
		
//		int[] temp = new int[n];
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		answer.add(arr[0]);
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[i-1]) {
//				temp[i] = arr[i];
				answer.add(arr[i]);
			}
		}
		
		/*
		 * for (int i : temp) { System.out.print(i+" "); }
		 * 
		 * System.out.println();
		 */
		
		for (Integer i : answer) {
			System.out.print(i+" ");
		}

	}

}
