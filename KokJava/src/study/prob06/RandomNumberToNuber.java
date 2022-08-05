package study.prob06;

import java.util.Scanner;

public class RandomNumberToNuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int big = num1>num2 ? num1 : num2;
		int small = num1<num2 ? num1 : num2;
		
		for(int i=1; i <=10; i++) {
			
			int result = (int)(Math.random()*(big-small)) + small + 1;
			
			System.out.println(result);
		}
	}

}
