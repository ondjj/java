package CharArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * ����
		 * 
		 * �� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
		 * 
		 * ��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
		 * 
		 * 
		 * �Է� ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.
		 * 
		 * ���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
		 * 
		 * 
		 * ��� ù �ٿ� �ش� ������ ������ ����Ѵ�.
		 * 
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Scanner in = new Scanner(System.in);

		String str = in.nextLine();
		String ch = in.nextLine();
		char search = ch.charAt(0);
		int count = 0;
		
		String upString = str.toUpperCase();
		char upCh = Character.toUpperCase(search);
		

		for (int i = 0; i < str.length(); i++) {
			if (upString.charAt(i)== upCh) {
				++count;
			}
		}
		
		System.out.println(count);

	}

}
