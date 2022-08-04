package study.prob07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * ���� N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����.
		 * ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
		 * 
		 * ��� ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
		 * 
		 * ���� �Է� 1 5 20 10 35 30 7 ���� ��� 1 7 35
		 */

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * int N = scanner.nextInt();
		 * 
		 * int[] arr = new int[N];
		 * 
		 * for (int i = 0; i < N; i++) { arr[i] = scanner.nextInt();
		 * 
		 * }
		 * 
		 * scanner.close(); Arrays.sort(arr); System.out.print(arr[0] + " " + arr[N -
		 * 1]);
		 */

	

		// inputStreamReader -> ����Ʈ Ÿ������ �Է� ���� -> BufferedReader -> ���ۿ� ��� �� ���� ó��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// br.readLine() -> ���ڿ� Ÿ������ �� �پ� �о� �� --> Integer.parseInt --> ������ ��ȯ
		int N = Integer.parseInt(br.readLine());

		// .readLine() -> ���ڿ� Ÿ������ �� �پ� �о� �� --> StringTokenizer ���ڿ��� ���� �������� ��ūȭ
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int index = 0;
		int[] arr = new int[N];

		// st.hasMoreTokens() -> while�� �������� ��ū�� �����ϴµ��� ����
		while (st.hasMoreTokens()) {
			// �о�� ��ū�� ������ ��ȯ �� �迭�� ����
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		// �迭�� ���� �������� ����
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);

	}

}
