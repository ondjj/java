package sec04;

import java.util.Scanner;

public class SubstitutionOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է� :");
		int insc = scanner.nextInt();
		
		System.out.println((insc > 0 ? "����Դϴ�." : (insc < 0 ? "�����Դϴ�." : "0�Դϴ�.")));
		
		

	}

}
