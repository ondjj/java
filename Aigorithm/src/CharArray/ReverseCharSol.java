package CharArray;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

	public ArrayList<String> ReverseCharSol(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		// reverse 荤侩
		for (String x : str) {
			String tmp=new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		// 流立 第笼绰 规过
		for (String x : str) {
			char[] s = x.toCharArray();
			int lt=0, rt=x.length()-1;
			while (lt<rt) {
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--; 
				
			}
			String tmp=String.valueOf(s);
			answer.add(tmp);
		}

		return answer;
	}

	public static void main(String[] args) {
		
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		
		String[] str = new String[n];
		
		for (int i = 0; i < n; i++) {
			str[i] = kb.next();
		}

		for (String x : T.ReverseCharSol(n, str)) {
			System.out.println(x);
		}
	}

}
