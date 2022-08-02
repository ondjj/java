package study.prob05;

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 
//	    정수로 빈칸을 사이에 두고 순서대로 주어진다. 
//		두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다. 
//		# C 가 1000분까지 가능하다 #
		
// 		# 검증 1. 출력 시간 = 시간 + (분 + 조리 시간) / 60
//		# 검증 2. 출력 분 = (분 + 조리 시간) % 60
//		# 검증 3. 24시는 0으로 표현한다.
		
		
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
