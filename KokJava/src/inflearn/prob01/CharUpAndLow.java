package inflearn.prob01;

import java.util.Scanner;

public class CharUpAndLow {

	public static void main(String[] args) {
		/*
		 * 2. ��ҹ��� ��ȯ ���� �빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷���
		 * �ۼ��ϼ���. �Է� ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�. ���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�. ���
		 * ù �ٿ� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�� ���ڿ��� ����մϴ�.
		 * 
		 * ���� StuDY ��� sTUdy
		 */

		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		char[] strCh = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
//			System.out.println(strCh[i]);
			if (Character.isLowerCase(strCh[i])) {
				strCh[i] = Character.toUpperCase(strCh[i]);
			} else {
				strCh[i] = Character.toLowerCase(strCh[i]);
			}
			System.out.print(strCh[i]);

		}

	}

}
