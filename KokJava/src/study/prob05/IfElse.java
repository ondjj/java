package study.prob05;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է� -> ");
		int num = scanner.nextInt();
		
		if((num % 2 == 0) && (num % 5 == 0)) {
			System.out.println("2�� 5�� ����Դϴ�.");
		}else {
			System.out.println("2�� 5�� ����� �ƴմϴ�.");
		}

	}

}
