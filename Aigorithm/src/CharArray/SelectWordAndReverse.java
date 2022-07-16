package CharArray;

import java.util.Scanner;

public class SelectWordAndReverse {

	public static void main(String[] args) {
		/*
		 * 5. Ư�� ���� ������ ����
		 * 
		 * ���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������,
		 * 
		 * Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * 
		 * �Է� ù �ٿ� ���̰� 100�� ���� �ʴ� ���ڿ��� �־����ϴ�.
		 * 
		 * ��� ù �ٿ� ���ĺ��� ������ ���ڿ��� ����մϴ�.
		 * 
		 * ���� �Է� 1
		 * a#b!GE*T@S 
		 * ���� ��� 1
		 * S#T!EG*b@a
		 * a ~ z : 97 ~ 122
		 * A ~ Z : 65 ~ 90
		 */
		String answer ="";
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		
		for(int i = 0; i<str.length();i++) {
			char[] s = str.toCharArray();
			int lt=0, rt=s.length-1;
			
			while(lt<rt) {
				if((s[lt] >= 65 && s[lt] <= 122) && (s[rt] >= 65 && s[rt] <= 122)) {
					
					char tmp=s[lt];
					s[lt] = s[rt];
					s[rt] = tmp;
					lt++;
					rt--;
				}else if((s[rt] < 65 || s[rt] > 122)){
					rt--;
				}else if((s[lt] < 65 || s[lt] > 122)) {
					lt++;
				}
			}
			String tmp = String.valueOf(s);
			answer=tmp;
		}
		System.out.println(answer);
		
	}

}
