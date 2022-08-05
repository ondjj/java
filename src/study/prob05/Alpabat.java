package study.prob05;

import java.util.Scanner;

public class Alpabat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String grade = scanner.nextLine();


		switch (grade) {
		
		case "A", "a" :
			System.out.println("A등급");
			System.out.println("우수 회원입니다.");
			break;
			
		case "B","b" :
			System.out.println("B등급");
			System.out.println("일반 회원입니다.");
			break;
		
		default:
			System.out.println("그 외");
			System.out.println("손님입니다.");
			
			
		

		}

	}

}
