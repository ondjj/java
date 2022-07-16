package CharArray;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseChar {

	public static void main(String[] args) {
		/*
		 * 4. 단어 뒤집기 설명
		 * 
		 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
		 * 
		 * 입력 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
		 * 
		 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
		 * 
		 * 출력 N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
		 */

		Scanner in = new Scanner(System.in);
		ArrayList<String> answer = new ArrayList<>();
		int n = in.nextInt();
		String[] word = new String[n];

		for (int i = 0; i < n; i++) {
			word[i] = in.next();
		}

		for (String x : word) {
			char[] s = x.toCharArray();
			int lt = 0;
			int rt = x.length() - 1;
			char tmp = 0;
			while (lt < rt) {

				tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp1 = String.valueOf(s);
			answer.add(tmp1);
		}

		for (String x : answer) {
			System.out.println(x);

		}

	}

}
