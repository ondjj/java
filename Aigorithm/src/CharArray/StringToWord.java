package CharArray;

import java.util.Scanner;

class Main {

	public String StringToWord(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		
		
		
		String[] s = str.split(" ");
		
		
		// indexOf() : 인자 값으로 들어온 값을 구분자로 해당 인자값의 위치를 리턴해준다
		// 아래의 경우 띄어쓰기를 발견하지 못 하면 -1을 리턴하고 발견하면 해당 위치의 인덱스 번호를 리턴한다.
		while((pos=str.indexOf(' ')) != -1){
			
			//substring(시작값, 끝 값 -1) : 문자열을 잘라 낼 때 사용하는 메소드
			//문자열의 시작 인덱스 0부터 띄어쓰기 pos전까지 잘라내 tmp에 저장한다.
			String tmp = str.substring(0, pos);
			
			// tmp길이를 반환
			int len = tmp.length();
			
			// 최소값 구하는 알고리즘 적용
			if(len>m) {
				m=len;
				// tmp엔 잘라낸 문자열이 들어가있다.
				answer=tmp;
			}
			// 이미 비교한 문자열을 제거 하기 위 해 str.substring() 사용 
			// 공백 위치 + 1부터 끝까지 str에 갱신한다.
			str =str.substring(pos+1);
			
		}
		// 마지막 문자열은 공백이 없기 때문에 비교 할 수 없기 때문에
		// 마지막 문자열 길이와 max 값을 비교해 남은 문자열이 더 크다면 값을 변경해준다.
		if(str.length()>m) answer=str;
		/*최소값 구하는 알고리즘 응용 풀이
		 * for(String x : s) { int len = x.length(); if(len>m) { m=len; answer=x; }
		 */
		return answer;
		
	}

	public static void main(String[] args) {
			Main T = new Main();
			Scanner kbScanner = new Scanner(System.in);
			String str = kbScanner.nextLine();
			System.out.println(T.StringToWord(str));

		}

}

