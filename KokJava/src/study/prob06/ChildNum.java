package study.prob06;

import java.util.Scanner;

public class ChildNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count = 1;

		if ((num != 2) && (num != 3) && (num != 5)) {
			if ((num % 2 == 0) || (num % 3 == 0) || (num % 5) == 0) {

				System.out.println(num + "�� �ڼ��� �ƴմϴ�.");
			} else {
				System.out.println(num + "�� �ڼ��Դϴ�.");
			}
		} else {
			System.out.println(num + "�� �ڼ��Դϴ�.");
		}
		System.out.println("=======================================");
		for (int i = 2; i <= 100; i++) {
			if ((i != 2 && i != 3 && i != 5) && ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0))) {
				System.out.printf("%d�� �ڼ��� �ƴմϴ�. \n", i);
			} else {
				System.out.printf("%d�� �ڼ��Դϴ�. \n", i);
				++count;
			}
		}System.out.println("1 - 100������ �� �� �ڼ��� �� : " + count);

		
		System.out.println("=======================================");
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("�ڼ� �ƴ�");
				System.exit(0); // ���� ����
			} else {
				continue;
			}
		}
		System.out.println("�ڼ�");

	}

}
