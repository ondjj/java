package study.prob05;

import java.util.Scanner;

public class Alpabat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String grade = scanner.nextLine();


		switch (grade) {
		
		case "A", "a" :
			System.out.println("A���");
			System.out.println("��� ȸ���Դϴ�.");
			break;
			
		case "B","b" :
			System.out.println("B���");
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		
		default:
			System.out.println("�� ��");
			System.out.println("�մ��Դϴ�.");
			
			
		

		}

	}

}
