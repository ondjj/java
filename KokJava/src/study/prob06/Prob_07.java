package study.prob06;

import java.util.Scanner;

public class Prob_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �ݺ��� ��Ʈ���� ���� �Ҹ��� Ÿ�� run ���� ����
		boolean run = true;
		
		// ����� �Է¿� ���� ��,��� �� �б⹮ ����
		Scanner scanner = new Scanner(System.in);
		
		// �ݾ� ������ ���� int Ÿ�� ���� ����
		int balance = 0;

		// �ݺ��� ����
		while (run) {
			
			// ����� ����
			System.out.println("---------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------");
			System.out.print("����> ");
			
			// ����� ���� ��ȣ ����
			int select = Integer.parseInt(scanner.nextLine());

			// ����ġ���� ����� ����� �Է¿� ���� ���� �и�
			switch (select) {
			case 1:
				System.out.print("���ݾ�> ");
				
				// balance ������ ���ݾ� �߰�
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				
				// balance ������ ��ݾ� ����
				System.out.print("��ݾ�> ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
				
			case 3:
				
				// balance ������ ��ϵ� �ܰ� Ȯ��
				System.out.print("�ܰ�> ");
				System.out.println(balance);
				break;
				
			
			case 4:
				
				// run ������ false�� �ٲٰ� �ݺ��� ����
				System.out.println("����");
				run = false;
				break;
			}

			System.out.println();
		}
		System.out.println("���α׷� ����");

	}

}
