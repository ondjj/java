package CharArray;

import java.util.Scanner;

public class StringToWordLength {

	public static void main(String[] args) {
		/*
		 * ����
		 * 
		 * �� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * 
		 * ������� �� �ܾ�� �������� ���е˴ϴ�.
		 * 
		 * 
		 * �Է� ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
		 * 
		 * 
		 * ��� ù �ٿ� ���� �� �ܾ ����Ѵ�. ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ��
		 * 
		 * �ܾ ������ �մϴ�.
		 */

		Scanner kb = new Scanner(System.in);

		String answer = "";
		String str = kb.nextLine();
		int m = Integer.MIN_VALUE, pos;

		String[] s = str.split(" ");

		for (String x : s) {
			if (x.length() > m) {
				m = x.length();
				answer = x;
			}
//			System.out.println(x);
		}

//		 indexOf / substring ���
		while ((pos = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);

			int len = tmp.length();

			if (len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos + 1);
		}

		if (str.length() > m)
			answer = star;

		System.out.println(answer);

	}

}
