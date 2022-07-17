package CharArray;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		/*
		 * 7. ȸ�� ���ڿ� ����
		 * 
		 * �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.
		 * 
		 * ���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * 
		 * �� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.
		 * 
		 * �Է� ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
		 * 
		 * ��� ù ��° �ٿ� ȸ�� ���ڿ������� ����� YES �Ǵ� NO�� ����մϴ�.
		 * 
		 * ���� �Է� 1 gooG ���� ��� 1 YES
		 */

		Scanner in = new Scanner(System.in);
		String str = in.next().toLowerCase();
		char[] chStr = str.toCharArray();
		char[] backCh = new char[chStr.length];
		int cnt = 0;
		boolean flag = false;

		for (int i = chStr.length - 1; i >= 0; i--) {
			backCh[cnt] = chStr[i];
			cnt++;
		}

		for (int i = 0; i < backCh.length; i++) {
			
			if(chStr[i] != backCh[i]) {
				System.out.println("NO");
				flag = false;
				break;
			}else {
				flag = true;
			}
		}
		if(flag != false) System.out.println("YES");
	}

}
