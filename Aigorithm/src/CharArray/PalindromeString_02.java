package CharArray;

import java.time.LocalTime;
import java.util.Scanner;

public class PalindromeString_02 {

	public static void main(String[] args) {
		/*
		 * 8. ��ȿ�� �Ӹ���� ����
		 * 
		 * �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.
		 * 
		 * ���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * 
		 * �� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.
		 * 
		 * ���ĺ� �̿��� ���ڵ��� �����մϴ�.
		 * 
		 * �Է� ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
		 * 
		 * ��� ù ��° �ٿ� �Ӹ���������� ����� YES �Ǵ� NO�� ����մϴ�.
		 * 
		 * ���� �Է� 1 found7, time: study; Yduts; emit, 7Dnuof ���� ��� 1 YES a - z : 97 ~ 122
		 * A - Z : 65 ~ 90
		 */
		Scanner in = new Scanner(System.in);
		String str = in.nextLine().toLowerCase().replaceAll("[^a-z]", "");
		char[] chStr = str.toCharArray();
		boolean flag = true;
		

		
		int lt = 0;
		int rt = chStr.length-1;
		
		for (int i = 0; i < chStr.length; i++) {
			if(chStr[lt] == chStr[rt] ) {
				lt ++;
				rt--;
				flag = true;
			}else {
				System.out.println("NO");
				flag = false;
				break;
			}
			
		}
		if(flag == true) {
			System.out.println("YES");
		}
	}

}
