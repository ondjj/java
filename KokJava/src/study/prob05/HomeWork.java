package study.prob05;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("java ���� �Է� : ");
		int java = scanner.nextInt();
		
		System.out.print("python ���� �Է� :");
		int python = scanner.nextInt();
		
		System.out.print("database ���� �Է� :");
		int database = scanner.nextInt();
		
		if((java <= 40) || (python <= 40) || (database <= 40)) {
			System.out.println("�հ� : " + (java + python + database));
			System.out.println("��� : " + (double)(java + python + database)/3);
			System.out.println("������� ������");
		} else {
			System.out.println("�հ� : " + (java + python + database));
			System.out.println("��� : " + (double)(java + python + database)/3);
		}

	}

}
