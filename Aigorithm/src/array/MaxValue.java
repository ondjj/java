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

		int[] num = new int[n];

		String result = "0";

		for (int i = 0; i < n; i++) {

			num[i] = in.nextInt();
		}

		
		for (int i = 1; i < n-1; i++) {
			result = num[0]+"";
			if (num[i] > num[i + 1]) {
				result = num[i]+"";
			}
			System.out.print(result + " ");
		}

	}

}
