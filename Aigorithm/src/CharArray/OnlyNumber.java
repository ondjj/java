package CharArray;

import java.util.Scanner;

public class OnlyNumber {

	public static void main(String[] args) {
		/*
		 * 9. ���ڸ� ���� ����
		 * 
		 * ���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.
		 * 
		 * ���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.
		 * 
		 * �����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.
		 * 
		 * �Է� ù �ٿ� ���ڰ� ���� ���ڿ��� �־����ϴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
		 * 
		 * ��� ù �ٿ� �ڿ����� ����մϴ�.
		 * 
		 * ���� �Է� 1
		 * g0en2T0s8eSoft 
		 * ���� ��� 1
		 * 208
		 */
		Scanner in = new Scanner(System.in);
		String str = in.next().replaceAll("[^0-9]", "");
		int num = Integer.parseInt(str);
		System.out.print(num);
		

	}

}
