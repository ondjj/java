package study.quiz01;

import java.util.Scanner;

public class Star_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int even = 1;

		for (int i = 0; i < n; i++) {
			
			for (int y = n-1; y > i; y --) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < even; j++) {
				
				System.out.print("*");

			}
			even = even+2;
			System.out.println();
		}
		in.close();


	}

}
