package study.prob07;

import java.util.Scanner;

public class Main_7 {

	public static void main(String[] args) {
		/*
		 * ���� ���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
		 * 
		 * �Է� ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
		 * 
		 * ��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����.
		 * ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
		 * 
		 * ��� �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�. 5 5 50 50 70 80 100
		 * 40.000% 7 100 95 90 80 70 60 50 57.143% 3 70 90 80 33.333% 3 70 90 81 66.667%
		 * 9 100 99 98 97 96 95 94 93 91 55.556%
		 * 
		 */

		Scanner in = new Scanner(System.in);

		int C = in.nextInt();
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		double sAvg = 0;

//		System.out.println("c: "+ C);

		for (int i = 0; i < C; i++) {

			int[] N = new int[in.nextInt()];
//			System.out.println("N : "+ N.length);

			for (int j = 0; j < N.length; j++) {
				N[j] = in.nextInt();
				sum += N[j];
				System.out.println("N " + j + ": " + N[j]);
			}
			avg = (double) sum / N.length;
			sum = 0;
//			System.out.println(avg);

			for (int y = 0; y < N.length; y++) {
				if (N[y] > avg) {
					cnt++;
				}
			}
			sAvg =  ((double)cnt / N.length) * (double) 100;
			System.out.printf("%3.3f%% \n", sAvg);
			cnt = 0;
		}
		in.close();
	}
}
