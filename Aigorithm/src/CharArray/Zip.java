package CharArray;

import java.util.Scanner;

public class Zip {

	public static void main(String[] args) {
		/*
		 * 11. ���ڿ� ���� ����
		 * 
		 * ���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ��� �ݺ��Ǵ�
		 * 
		 * ���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �� �ݺ�Ƚ���� 1�� ��� �����մϴ�.
		 * 
		 * �Է� ù �ٿ� ���ڿ��� �־�����. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
		 * 
		 * ��� ù �ٿ� ����� ���ڿ��� ����Ѵ�.
		 * 
		 * ���� �Է� 1 KKHSSSSSSSE ���� ��� 1 K2HS7E
		 * 
		 * ���� �Է� 2 KSTTTSEEKFKKKDJJGG ���� ��� 2 KST3SE2KFK3DJ2G2
		 */

		Scanner in = new Scanner(System.in);
		char[] strCh = in.next().toUpperCase().toCharArray();
		String answer = "";
		int cnt = 1;

		for (int i = 0; i < strCh.length; i++) {

			if (i != strCh.length-1) {
				if (strCh[i] == strCh[i + 1]) {
					cnt++;
				} else {
					answer += strCh[i];
					if (cnt > 1) {
						answer += cnt;
					}
					cnt = 1;
				}
			}else {
				if(strCh[strCh.length-1] == strCh[i]) {
					answer += strCh[i];
					if(cnt >1) {
						answer += cnt;
					}
				}
			}
		}
		System.out.println(answer);

	}

}
