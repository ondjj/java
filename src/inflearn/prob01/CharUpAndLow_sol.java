package inflearn.prob01;

import java.util.Scanner;

class Main {

	public char CharUpAndLow_sol(char[] ch) {
		
		for(int i = 0; i<ch.length; i++) {
			if(Character.isLowerCase(i)){
				ch[i] = Character.toUpperCase(ch[i]);
			}else {
				ch[i] = Character.toLowerCase(ch[i]);
			}
		}
		
		
		return ch;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main C = new Main();
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		char[] strCh = str.toCharArray();
		
		System.out.print(C.CharUpAndLow_sol(strCh));
		
		
		
	}

}