package CharArray;

import java.util.Scanner;

class Main{
	
		public int CountChar_Solution(String str, char t) {
			int answer=0;
			
			str=str.toUpperCase();
			t = Character.toUpperCase(t);
			
			for(char x : str.toCharArray()) {
				if(x==t) answer++;
			}
			
		/*
		 * 일반 for문으로 풀이
		 * for(int i=0; i<str.length();i++) { if(str.charAt(i)==t) answer++; }
		 */
			
			return answer;
		
		}
		public static void main(String[] args) {
			
			Main T = new Main();
			
			Scanner in = new Scanner(System.in);
			
			String str=in.next();
			
			char c = in.next().charAt(0);
			
			System.out.print(T.CountChar_Solution(str, c));
			
		
	}
}
