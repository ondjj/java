package study.quiz01;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		
		for (int i = 0; i < n; i++) {
			for (int y = n-1; y > i; y --) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println(); 
		
		for (int i = 0; i < n; i++) {
			
			for (int y = 0; y<i; y++) {
				System.out.print(" ");
			}
			
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}