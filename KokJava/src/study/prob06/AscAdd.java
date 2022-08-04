package study.prob06;

import java.util.Scanner;

public class AscAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		int sum = 0;

		if (num1 > 30 || num2 > 30 || num1 == num2) {
			System.out.println("30이하의 서로 다른 정수를 입력하세요.");
		} else {
			int num3 = num1 > num2 ? num1 : num2;
			int num4 = num1 < num2 ? num1 : num2;

			for (int i = num4; i <= num3; i++) {
				sum = sum + i;

				System.out.printf("%d ", i);
				if (i == num3)
					break;

				System.out.print("+ ");

			}
			System.out.println("= " + sum);

		}

	}

}
