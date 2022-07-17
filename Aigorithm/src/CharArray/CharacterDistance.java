package CharArray;

import java.util.Scanner;

public class CharacterDistance {

	public static void main(String[] args) {
		/*
		 * 10. 가장 짧은 문자거리 설명
		 * 
		 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
		 * 
		 * 입력 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
		 * 
		 * 문자열의 길이는 100을 넘지 않는다.
		 * 
		 * 출력 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
		 * 
		 * 예시 입력 1
		 * teachermode	te ac hermo de
		 * 10 1210 12210
		 * 예시 출력 1
		 * 1 0 1 2 1 0 1 2 2 1 0
		 * 
		 * 검증 1 .
		 * 왼쪽 cnt와 오른쪽 cnt 비교 후 더 작은 값을 길이로 출력
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
