package kukja.homework;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int select = 0;
		String[] id = new String[3];
		String[] pw = new String[3];
		int idcnt = 0;
		int pwcnt = 0;
		boolean run = true;

		System.out.print("[1]ȸ������    " + "[2]�α���    " + "[3]����   >> ");
		while (run) {

			switch (select = in.nextInt()) {
			case 1:
				if (idcnt == 3) {
					
					System.out.println("ȸ���� ���� á���ϴ�.");
					
				} else {

					System.out.println("\" ==== ȸ������ ==== \"");
					
					System.out.print("���̵� �Է� : ");
					
					id[idcnt++] = in.next();
					
					System.out.print("��й�ȣ �Է� : ");
					
					pw[pwcnt++] = in.next();
					

				}
				System.out.print("[1]ȸ������    " + "[2]�α���    " + "[3]����   >> ");
				run = true;

				break;
				
			case 2:
				System.out.println("<< �α��� >>");
				
				System.out.print("�α��� ���̵� �Է� : ");
				String logid = in.next();
				
				
				System.out.print("�α��� ��й�ȣ �Է� : ");
				String logpw = in.next();
				
				for(int i = 0; i<2; i++) {
					
					if((logid.equals(id[i])) && (logpw.equals(pw[i]))) {
						System.out.println("�α��� ���� !");
						break;
						
					}else {

						System.out.println("�α��� ����.");
						System.out.println("���̵�/��й�ȣ�� Ȯ���ϼ���.");
						break;
					}
				}
				System.out.print("[1]ȸ������    " + "[2]�α���    " + "[3]����   >> ");
				run = true;
				break;
				

			case 3:
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				run = false;
				break;

			default:
				System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
				System.out.print("[1]ȸ������    " + "[2]�α���    " + "[3]����   >> ");
				run = true;
				break;
			}
		}

	}

}
