package study.prob06;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("1.���� || 2.���� || 3.��");
		System.out.print(">>> ���� : ");

		String uc;
		boolean run = true;
		
		int win = 0;
		int count = 0;

		do {
			int rps = scanner.nextInt();;
			if((rps != 1) && (rps != 2) && (rps != 3)) {
				 System.out.println("���� �����ּ���!");
				 System.out.println("1.���� || 2.���� || 3.��");
				 System.out.print(">>> ���� : ");
				 rps = scanner.nextInt();
			}
			
			int mcRps = (int) (Math.random() * 3) + 1;

			if (rps == mcRps) {
				System.out.println("���º��Դϴ�.");
			} else if ((rps == 1) && (mcRps == 2)) {
				System.out.println(">>> ���� -> '����' ��ǻ�� -> '����' ��ǻ�Ͱ� �̰���ϴ�.");
			} else if ((rps == 3) && (mcRps == 1)) {
				System.out.println(">>> ���� -> '��' ��ǻ�� -> '����' ��ǻ�Ͱ� �̰���ϴ�.");
			} else if ((rps == 2) && (mcRps == 3)) {
				System.out.println(">>> ���� -> '����' ��ǻ�� -> '��' ��ǻ�Ͱ� �̰���ϴ�.");
			} else if ((rps == 2) && (mcRps == 1)) {
				System.out.println(">>> ���� -> '����' ��ǻ�� -> '����' ������ �̰���ϴ�.");
				++win;
			} else if ((rps == 1) && (mcRps == 3)) {
				System.out.println(">>> ���� -> '����' ��ǻ�� -> '��' ������ �̰���ϴ�.");
				++win;
			} else if ((rps == 3) && (mcRps == 2)) {
				System.out.println(">>> ���� -> '��' ��ǻ�� -> '����' ������ �̰���ϴ�.");
				++win;

			} else if ((rps != 1) && (rps != 2) && (rps != 3)) {

				System.out.println("������ ����Ͻðڽ��ϱ�? (Y/N)");
				uc = scanner.next();
				char ch = uc.charAt(0);

				if ((ch == 'n' || ch == 'N')) {
					System.out.println("������ �����մϴ�.");
					run = false;
				} else {
					System.out.println("=== ������ �ٽ� �����մϴ�. ===");
					System.out.println("1.���� || 2.���� || 3.��");
					System.out.print(">>> ���� : ");
					rps = scanner.nextInt();
				}
			} else {
				System.out.println("���� �����ּ���!");
				System.out.println("=== ������ �ٽ� �����մϴ�. ===");
				rps = scanner.nextInt();
				if((rps != 1) && (rps != 2) && (rps != 3)) {
					System.out.println("1.���� || 2.���� || 3.��");
					System.out.print(">>> ���� : ");
					 rps = scanner.nextInt();
				}
			}
			++count;
			System.out.println(count);
			System.out.println(win);
		} while (run);
		System.out.printf("���� �·� : %3.1f%s \n", (((double)win/count)*1000)/(double)10,"%");
	}
}
