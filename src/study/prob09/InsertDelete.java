package study.prob09;

import java.util.Scanner;

public class InsertDelete {

	public static void main(String[] args) {
		/*
		 * �� ������ �迭 50���� �����ϰ� 20���� 1~100������ ������ �Է� �۾�����(1: ����, 2: ����) : ������ ��ġ : ������ �� :
		 * ������ �Ŀ� ������ ��� ���� �۾��� ���������� �۾�
		 */

		Scanner in = new Scanner(System.in);

		int[] arr = new int[20];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (100 - 1) + 1) + 1;
		}

		System.out.print("���� �� : ");
		for (int i : arr) {
			System.out.print(i + " ");

		}

		System.out.println();

		System.out.print("�۾�����(1: ����, 2: ����) : ");

		int select = in.nextInt();

		System.out.println();

		switch (select) {
		case 1: {

			System.out.print("���� ��ġ : ");

			int insert = in.nextInt();

			System.out.println();

			for (int i = 0; i < arr.length; i++) {
				if (i == insert) {
					for (int j = arr.length - 1; j > i; j--) {
						arr[j] = arr[j - 1];
					}

					System.out.print("���� �� �� : ");
					arr[insert] = in.nextInt();
				}
			}

			System.out.print("��ȯ �� : ");
			for (int i : arr) {
				System.out.print(i + " ");
			}

			break;
		}

		case 2: {

			System.out.print("���� ��ġ : ");

			int delete = in.nextInt();

			System.out.println();
			int temp = 0;

			for (int i = 0; i < arr.length; i++) {
				if (i == delete) {
					// �迭 ũ��� �����Ǿ� �ֱ� ������ ũ�⸦ ���� �� ������ ���� �� �� ����.
					// ���� ��� arr.length -> 20�̰� 19���� ���� �ݺ������� 19+1��°�� �迭�� ���� �� �� ���� ������
					// arr.length�� -1�� �� �� 18���� ���� �ݺ����� ����� �Ʒ� �ڵ忡���� 18+1���� ���� �� ������ ���� �ʴ´�.
					for (int j = i; j < arr.length-1; j++) {
						arr[j] = arr[j + 1];

					}
					arr[arr.length - 1] = temp;

				}
			}
			System.out.println();

			System.out.print("��ȯ �� : ");
			for (int i : arr) {
				System.out.print(i + " ");
			}

			break;
		}

		default:
			System.out.print("�߸��� �Է��Դϴ�.");
			break;
		}
	}

}
