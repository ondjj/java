package study.prob07;

import java.util.Scanner;

public class Main_7 {

	public static void main(String[] args) {
		/*
		 * 문제 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
		 * 
		 * 입력 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		 * 
		 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
		 * 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 * 
		 * 출력 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다. 5 5 50 50 70 80 100
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
