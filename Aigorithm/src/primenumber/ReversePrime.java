package primenumber;
//6. ������ �Ҽ�

import java.util.Scanner;

//����
//N���� �ڿ����� �ԷµǸ� �� �ڿ����� ������ �� �� ������ ���� �Ҽ��̸� �� �Ҽ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
//���� ��� 32�� �������� 23�̰�, 23�� �Ҽ��̴�. �׷��� 23�� ����Ѵ�. �� 910�� �������� 19�� ����ȭ �ؾ� �Ѵ�.
//ù �ڸ������� ���ӵ� 0�� �����Ѵ�.
//
//�Է�
//ù �ٿ� �ڿ����� ���� N(3<=N<=100)�� �־�����, �� ���� �ٿ� N���� �ڿ����� �־�����.
//�� �ڿ����� ũ��� 100,000�� ���� �ʴ´�.
//���
//ù �ٿ� ������ �Ҽ��� ����մϴ�. ��¼����� �Էµ� ������� ����մϴ�.
//
//���� �Է� 1 
//9
//32 55 62 20 250 370 200 30 100
//���� ��� 1
//23 2 73 2 3

class ReversePrime {
	public String sosu(int[] arr) {

		String answer = "";

		String[] temp = new String[arr.length];

		int[] num = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 100) {
				temp[i] = "" + (arr[i] % 10) % 10 + (arr[i] % 100) / 10 + (arr[i] / 100);
			} else {
				temp[i] = "" + (arr[i] % 10) + (arr[i] / 10);
			}

			num[i] = Integer.valueOf(temp[i]);

			System.out.print(num[i] + " ");

			for (int j = 1; j < num[i]; j++) {

				if (num[i] % j == 0) {
					break;
				}
				else {
				answer += num[i]+" ";
				}
			}

		}
		System.out.println();
		return answer;
	}

	public static void main(String[] args) {
		ReversePrime rp = new ReversePrime();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(rp.sosu(arr));

	}

}
