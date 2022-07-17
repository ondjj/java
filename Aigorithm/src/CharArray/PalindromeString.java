package CharArray;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		/*
		 * 7. 회문 문자열 설명
		 * 
		 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
		 * 
		 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
		 * 
		 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
		 * 
		 * 입력 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
		 * 
		 * 출력 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
		 * 
		 * 예시 입력 1 gooG 예시 출력 1 YES
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
