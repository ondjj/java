package study.prob06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i=1; i<=9; i++) {
			
		System.out.printf("%d %s %d %s %d \n",N,"*",i,"=",N*i );
//			System.out.println(i);
		}

	}

}
