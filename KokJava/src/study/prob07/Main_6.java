package study.prob07;

import java.util.Scanner;

public class Main_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ���� "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� ��
		 * ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�.
		 * 
		 * ���� ���, 10�� ������ ������ 3�� �ȴ�.
		 * 
		 * "OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
		 * 
		 * OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ���
		 * �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.
		 * 
		 * ��� �� �׽�Ʈ ���̽����� ������ ����Ѵ�.
		 */
		Scanner in = new Scanner(System.in);
		
		String arr[] = new String[in.nextInt()];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = in.next();
		}
		in.close();


		for (int i = 0; i < arr.length; i++) {

			int count = 0;
			int sum = 0;

			for (int j = 0; j < arr[i].length(); j++) {

				if (arr[i].charAt(j) == 'O') {
					count++;
					
				} else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}

	}

}
