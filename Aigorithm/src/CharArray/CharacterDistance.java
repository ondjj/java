package CharArray;

import java.util.Iterator;
import java.util.Scanner;

public class CharacterDistance {

	public static void main(String[] args) {
		/*
		 * 10. ���� ª�� ���ڰŸ� ����
		 * 
		 * �� ���� ���ڿ� s�� ���� t�� �־����� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �ּҰŸ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * 
		 * �Է� ù ��° �ٿ� ���ڿ� s�� ���� t�� �־�����. ���ڿ��� ���ڴ� �ҹ��ڷθ� �־����ϴ�.
		 * 
		 * ���ڿ��� ���̴� 100�� ���� �ʴ´�.
		 * 
		 * ��� ù ��° �ٿ� �� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �Ÿ��� ������� ����Ѵ�.
		 * 
		 * ���� �Է� 1 teachermode 10123012340 ���� ��� 1 1 0 1 2 1 0 1 2 2 1 0
		 * 
		 * ���� 1 . ���� cnt�� ������ cnt �� �� �� ���� ���� ���̷� ���
		 */

		Scanner in = new Scanner(System.in);

		String s = in.next();

		char t = in.next().charAt(0);

		int[] answer = new int[s.length()];
		int p = 1000;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}

		}
		p = 1000;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == t)
				p = 0;
			else {
				p++;
//				answer[i] = Math.min(answer[i], p);
				if(answer[i]>p) {
					answer[i] = p;
				} 
			}
		}

		for (int i : answer) {
			System.out.print(i + " ");
		}

	}

}
