package sec04;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int score = scanner.nextInt();
		
		if ( score >= 90) {
			System.out.println("점수가 90이상입니다.");
			System.out.println("A등급입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("B등급입니다.");
		}

	}

}
