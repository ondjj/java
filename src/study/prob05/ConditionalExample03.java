package study.prob05;

import java.util.Scanner;

public class ConditionalExample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int A = scanner.nextInt();

		if (A >= 91) {
			System.out.println("점수가 91~100입니다.");
			System.out.println("등급은 A입니다.");
		} else if (A >= 81) {
			System.out.println("점수가 81~90입니다.");
			System.out.println("등급은 B입니다.");
		} else if (A >= 71) {
			System.out.println("점수가 71~80입니다.");
			System.out.println("등급은 C입니다.");
		}else {
			System.out.println("점수가 70이하입니다.");
			System.out.println("등급은 D입니다.");
		}
	}

}
