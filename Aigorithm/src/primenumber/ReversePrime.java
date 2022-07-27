package primenumber;
//6. ������ �Ҽ�

import java.util.ArrayList;
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
	
	public boolean isPrime(int[] num) {
		
		for (int i : num) {
			if(i == 1) return false;
		}
		
		for (int i = 2; i < num.length; i++) {
			if(num % i == 0) return false;
		}
		
	}
	
	
	public ArrayList<Integer> sosu(int[] arr) {

		ArrayList<Integer> answer = new ArrayList<>();

		String[] temp = new String[arr.length];

		int[] num = new int[arr.length];
		
		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 100) {
				temp[i] = "" + (arr[i] % 10) % 10 + (arr[i] % 100) / 10 + (arr[i] / 100);
			} else {
				temp[i] = "" + (arr[i] % 10) + (arr[i] / 10);
			}

			num[i] = Integer.valueOf(temp[i]);

			System.out.print(num[i] + " ");
			if(isPrime(num[i]))
				answer.add(num[i]);
		}
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
