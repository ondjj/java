package PrintExl;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int num = scanner.nextInt();
		
		boolean b;
		
		if(num % 5 == 0) {
			System.out.println("num ��(��) 5�� ����Դϴ�.");
			
		}else {
			System.out.println("num ��(��) 5�� ����� �ƴմϴ�.");
		}

	}

}
