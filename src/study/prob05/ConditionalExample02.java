package study.prob05;

import java.util.Scanner;

public class ConditionalExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 :");
		int a = scanner.nextInt();
		
		System.out.print("수학 :");
		int b = scanner.nextInt();
		
		System.out.print("영어 :");
		int c = scanner.nextInt();
		
		
		if(((a >= 7) && (b >= 7) && (c >= 7))) {
			System.out.println("합격입니다!");
		}else {
			System.out.println("불합격입니다!"); 
		}

	}

}
