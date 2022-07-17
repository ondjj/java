package CharArray;

import java.util.Scanner;

class Main {
	public String PalindromeString_02_Sol(String s) {
		
		String answer = "No";
		
		s=s.toUpperCase().replaceAll("[^A-Z]", "");
		
		String tmp = new StringBuilder(s).reverse().toString();
		
		if(s.equals(tmp)) answer = "YES";
		
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.nextLine();
		
		System.out.println(T.PalindromeString_02_Sol(str));
	
	}

}
