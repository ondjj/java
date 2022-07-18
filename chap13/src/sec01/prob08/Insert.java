package sec01.prob08;

import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				if( i == insert) {
					for (int j = arr.length-1; j > i; j--) {
						arr[j] = arr[j-1];
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
					temp = arr[arr.length-1];
					for (int j = arr.length-1; j > i; i--) {
						arr[j] = arr[j-1];
					}
					arr[arr.length-1] = temp;
					
				}
			}
			
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
