package study.prob06;

import java.util.Scanner;

public class InputQuitProgramDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String str = " ";
		
		System.out.println("���Ḧ �Է��ϸ� ���α׷��� �����մϴ�.");
		
		while(!str.equals("����")) {
			
			str = scanner.nextLine();
			
			System.out.println(">> "+str);
			
		}System.out.println("���α׷��� �����մϴ�.");
		
		scanner.close();

	}

}
