package CharArray;

import java.util.Scanner;

public class SelectWordAndReverse {

	public static void main(String[] args) {
		/*
		 * 5. 특정 문자 뒤집기 설명
		 * 
		 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
		 * 
		 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
		 * 
		 * 입력 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
		 * 
		 * 출력 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
		 * 
		 * 예시 입력 1
		 * a#b!GE*T@S 
		 * 예시 출력 1
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
