package study.prob06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * ���� 0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. ���� �־��� ���� 10���� �۴ٸ� �տ�
		 * 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�. �� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������
		 * �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�. ���� ���� ����.
		 * 
		 * 26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12�̴�. ���ο�
		 * ���� 42�̴�. 4+2 = 6�̴�. ���ο� ���� 26�̴�.
		 * 
		 * ���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
		 * 
		 * N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� ù° �ٿ� N�� �־�����. N�� 0���� ũ�ų� ����, 99���� �۰ų� ���� �����̴�.
		 * 
		 * ��� ù° �ٿ� N�� ����Ŭ ���̸� ����Ѵ�.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int temp = 0;
		int count = 0;
		int num = 0;
		int result = N;

		for (;;) {

			temp = (N / 10) + (N % 10);
			
			if(temp>=10) {
				temp = temp%10;
			}
			//System.out.println(">>>"+(N / 10)+">>>"+(N % 10));

			num = (N % 10) * 10;
			//System.out.println(">>>>>"+num);

			N = num + temp;

			++count;

			//System.out.println(">>>>>>>>"+N);
			
			if(N == result) {
				break;
			}

		}
		System.out.println(count);

	}

}
