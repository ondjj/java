package CharArray;

import java.util.Scanner;

public class DuplicatedWord {

	public static void main(String[] args) {
		/*
		 * 6. �ߺ��������� ����
		 * 
		 * �ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * 
		 * �ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.
		 * 
		 * �Է� ù �ٿ� ���ڿ��� �Էµ˴ϴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
		 * 
		 * ��� ù �ٿ� �ߺ����ڰ� ���ŵ� ���ڿ��� ����մϴ�.
		 *
		 * ���� �Է� 1
		 * ksekkset 
		 * ���� ��� 1
		 * kset
		 */
		
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char[] chstr = str.toCharArray();
		String answer = " ";
		
		for(int i = 0; i<chstr.length;i++) {
			for(int j = i+1; j<chstr.length;j++) {
				if(chstr[i] == chstr[j]) chstr[j] = ' ';
			}
//			System.out.println(chstr[i]);
		}
		answer = String.valueOf(chstr).replaceAll("\\s", "");
		System.out.println(answer);

	}

}
