package CharArray;

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
		 * ���� �Է� 1
		 * teachermode	te ac hermo de
		 * 10 1210 12210
		 * ���� ��� 1
		 * 1 0 1 2 1 0 1 2 2 1 0
		 * 
		 * ���� 1 .
		 * ���� cnt�� ������ cnt �� �� �� ���� ���� ���̷� ���
		 */
		
		Scanner in = new Scanner(System.in);
		
		
		char[] strCh = in.next().toCharArray();
		char[] ch = in.next().toCharArray();
		
		int[] awswer = {strCh.length};
		int taget = 1000;
		
		for (int i = 0; i < awswer.length; i++) {
			if(strCh[i] != ch[i]) {
				awswer[i] = taget;
				taget ++ ;
			}else {
				taget = 0;
				awswer[i] = taget;
				taget ++ ;
			}
			System.out.print(awswer[i]);
		}
		
		for (int i = awswer.length-1 ; i >= 0; i--) {
			if(strCh[i] != ch[i]) {
				awswer[i] = taget;
				taget ++ ;
			}else {
				taget = 0;
				awswer[i] = taget;
				taget ++ ;
			}
		}
		for (int i : awswer) {
			System.out.println(i+" ");
		}

	}

}
