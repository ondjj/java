package array;

import java.util.Scanner;

class Main {
	
//	����
//
//	�ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
//	���� 20�� �ԷµǸ� 1���� 20������ �Ҽ��� 2, 3, 5, 7, 11, 13, 17, 19�� �� 8���Դϴ�.
//	�Է�
//	ù �ٿ� �ڿ����� ���� N(2<=N<=200,000)�� �־����ϴ�.
//	���
//	ù �ٿ� �Ҽ��� ������ ����մϴ�.
//	���� �Է� 1 
//	20
//	���� ��� 1
//	8
	public int PrimeNumber(int n) {
		int answer = 0;
		
		for (int i = 2; i < n; i++) {
			if((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0))
				answer ++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(T.PrimeNumber(n));

	}

}