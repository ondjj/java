package primenumber;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrime_Sol {

	public boolean isPrime(int num) {

		if (num == 1)
			return false;

		for (int i = 2; i < num; i++) {

			if (num % i == 0)

				return false;
		}

		return true;

	}

	public ArrayList<Integer> solution(int n, int[] arr) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		// 0���� n��ŭ �ݺ� arr�� ���̴� n�̱� ������ arr.length�� ����
		for (int i = 0; i < n; i++) {
			
			// ���� ���� ��Ű�� ���� �۾�
			// ù ��° - �ӽ� ���� tmp�� �迭 0~n-1 ���� ��´�.
			int tmp = arr[i];
			
			// res�� ������ ���� ��� ���
			// ���� 62�� �������� ���� ���Ѻ���
			int res = 0;
			
			while (tmp > 0) {
				
				int t = tmp % 10; // --> ������ 10�� �������� ���ϸ� 1�� �ڸ� ���� �������� 2��° �ݺ� 6 % 10 = 6
				
				res = res * 10 + t; // 1��° �ݺ� 0*10+2 = 2, 2��° �ݺ� 2*10 + 6 --> 26���� ���� �Ϸ�
				
				tmp = tmp / 10; // ������ 10�� �ڸ� 6�� ����, 6 / 10 --> 0 �ݺ��� ����
				
			}
			// ������ ���� �Ҽ����� �Ǻ��ϱ� ���� �ٸ� �޼���� �̵� (26)
			if (isPrime(res))
				
				answer.add(res);
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����� ���� Ŭ���� ����
		ReversePrime_Sol rs = new ReversePrime_Sol();
		
		// ��ĳ�� Ŭ���� ����
		Scanner kb = new Scanner(System.in);
		
		// �� �� �Է� ������ ���� �����ϰ� n������ �Է� ����
		int n = kb.nextInt();
		
		// n��ŭ�� ���̸� ���� �迭 ����
		int[] arr = new int[n];

		// �迭 �� �ޱ�
		for (int i = 0; i < arr.length; i++) {
			arr[i] = kb.nextInt();
		}

		// ����� ���� Ŭ������ �ż��� ��� return ���� �ް� ��� �� ����
		for (int i : rs.solution(n, arr)) {
			System.out.print(i + " ");
		}

	}
}	