package study.prob06;

import java.util.Scanner;

public class InputQuitProgramDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String str = " ";
		
		System.out.println("종료를 입력하면 프로그램을 종료합니다.");
		
		while(!str.equals("종료")) {
			
			str = scanner.nextLine();
			
			System.out.println(">> "+str);
			
		}System.out.println("프로그램을 종료합니다.");
		
		scanner.close();

	}

}
