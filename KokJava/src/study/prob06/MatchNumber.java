package study.prob06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MatchNumber {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int min = 10;
		int max = 500;

		int random = (int) (Math.random() * (max - min)) + 1;
		int input = 0;
		int count = 0;
		int limit = 10;

		do {

			System.out.println("���� ���� Ƚ �� : " + (limit - count));
			count++;
			System.out.print(min + "����" + max + "������ ���� �Է��ϼ��� : \n");
			input = scanner.nextInt();

			if (count >= 10) {
				System.out.println(limit + "�� ��� Ʋ�Ƚ��ϴ�. �ٽ� �����ϼ���.");
				break;
			}

			if (input < 10 || input > 500) {
				System.out.print(">>>" + min + "����" + max + "������ ���� �Է��ϼ��� :");
				System.out.println();
			} else {

				if (random > input) {
					System.out.println("�� ū ���� �Է��ϼ���.");

				} else if (random < input) {
					System.out.println("�� ���� ���� �Է��ϼ���.");

				} else {
					System.out.println("���� ������ " + random + " �����Դϴ�!!");

					System.out.println("�õ� Ƚ���� " + count + "���Դϴ�.");
					break;
				}

			}

		} while (true);
	}
}