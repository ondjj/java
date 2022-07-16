package CharArray;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseChar {

	public static void main(String[] args) {
		/*
		 * 4. �ܾ� ������ ����
		 * 
		 * N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * 
		 * �Է� ù �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.
		 * 
		 * �� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־����ϴ�. �ܾ�� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
		 * 
		 * ��� N���� �ܾ �Էµ� ������� �� �ٿ� �ϳ��� ����� ����մϴ�.
		 */

		Scanner in = new Scanner(System.in);
		ArrayList<String> answer = new ArrayList<>();
		int n = in.nextInt();
		String[] word = new String[n];

		for (int i = 0; i < n; i++) {
			word[i] = in.next();
		}

		for (String x : word) {
			char[] s = x.toCharArray();
			int lt = 0;
			int rt = x.length() - 1;
			char tmp = 0;
			while (lt < rt) {

				tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp1 = String.valueOf(s);
			answer.add(tmp1);
		}

		for (String x : answer) {
			System.out.println(x);

		}

	}

}
