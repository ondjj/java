package study.prob05;

import java.util.Scanner;

public class SumFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("정수 입력: ");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
			
		}
		System.out.println(sum);
		

	}

}
