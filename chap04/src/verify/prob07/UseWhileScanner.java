package verify.prob07;

import java.util.Scanner;

public class UseWhileScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int balance = 0;
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------");
			System.out.print("����> ");
			
			int select = Integer.parseInt(scanner.nextLine());
			
			switch (select) {
			case 1:
				System.out.print("���ݾ�> ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("��ݾ�> ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.print("�ܰ�> ");
				System.out.println(balance);
				break;
			case 4:
				System.out.println("����");
				run = false;
				break;
			}
			
		System.out.println();
		}
	System.out.println("���α׷� ����");
	}
}
