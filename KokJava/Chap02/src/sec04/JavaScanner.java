package sec04;

import java.util.Scanner;

public class JavaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner Ŭ���� �����ϴ� ���
		// Ŭ����Ÿ�� ������ = new Ŭ����Ÿ��(System.in);
		
		
		Scanner scanner = new Scanner(System.in);
	
		
//		String sc = scanner.next();
//		System.out.println(sc);
		
		String inputData = scanner.nextLine();
		
		System.out.println(inputData);
		
		// �������� Ÿ������ �Է� ����
		// �Է��ϰ��� �ϴ� Ÿ�� -> next.Ÿ��();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[�ʼ� ���� �Է�]");
		
		System.out.print("1.�̸�: ");
		String str = sc.nextLine();
		
		System.out.print("2.�ֹ̹�ȣ �� 6�ڸ�: ");
		String pnum = sc.nextLine();
		
		System.out.print("3.��ȭ��ȣ: ");
		String cellnum = sc.nextLine();
		
		System.out.println("[�Է��� ����]");
		System.out.println(str);
		System.out.println(pnum);
		System.out.println(cellnum);
	
	}

}
