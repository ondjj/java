package study.prob05;

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ù° �ٿ��� ���� �ð��� ���´�. ���� �ð��� �� A (0 �� A �� 23) �� �� B (0 �� B �� 59)�� 
//	    ������ ��ĭ�� ���̿� �ΰ� ������� �־�����. 
//		�� ��° �ٿ��� �丮�ϴ� �� �ʿ��� �ð� C (0 �� C �� 1,000)�� �� ������ �־�����. 
//		# C �� 1000�б��� �����ϴ� #
		
// 		# ���� 1. ��� �ð� = �ð� + (�� + ���� �ð�) / 60
//		# ���� 2. ��� �� = (�� + ���� �ð�) % 60
//		# ���� 3. 24�ô� 0���� ǥ���Ѵ�.
		
		
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		A = A + (B+C)/60;
		B = (B+C)%60;
		
		if(A >= 24) {
			A -= 24;
		}
		
		System.out.printf("%d %d",A,B);
		
	


	}

}
