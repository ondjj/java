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
		char[] ch = str.toCharArray();
		String answer="";
		
		for(int i=0;i<ch.length;i++) {
			for (int j = 1; j < i+1; j++) {
				if(ch[i]==ch[j]) {
					System.out.print(ch[i]+" ");
					
					System.out.print(ch[j]+" ");
					continue;
				}else ch[i] = ch[i];
			}
		}
		answer =String.valueOf(ch);
		System.out.println(answer);
	}

}
