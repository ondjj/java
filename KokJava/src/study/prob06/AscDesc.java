package study.prob06;

import java.util.Scanner;

public class AscDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 100 ������ �ٸ� ������ 2�� �Է� �޾� 'Ȧ��'��
		// ���� ���� �� ���� ū ������ ����ϴ� ���α׷��� �ۼ��غ��ÿ�

		Scanner scanner = new Scanner(System.in);

		System.out.print("���� �Է�1: ");
		int num1 = scanner.nextInt();

		System.out.print("���� �Է�2: ");
		int num2 = scanner.nextInt();

		if ((num1 > 100) || (num2 > 100) || (num1 == num2)) {
			System.out.println("100������ ���� �ٸ� ������ �Է����ּ���.");
		} else {
			System.out.println("������������ ����� �����մϴ�.");
			 int num3 = num1 < num2 ? num1 : num2;
			 int num4 = num1 > num2 ? num1 : num2;
			for (int i = num3; i <= num4; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}

		}

	}

}
