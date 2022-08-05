package study.prob06;

import java.util.Scanner;

public class Main_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		
		for(int i=1;i<=N;i++) {
			
			for(int j=1; j<=N-i;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}