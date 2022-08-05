package study.prob05;

import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int temp = 0;

		if ((a == b) && (b == c) && (a == c)) {

			System.out.println(10000 + (a * 1000));

		} else if ((a == b) || (a == c)) {
			System.out.println(1000 + (a * 100));

		} else if (b == c) {
			System.out.println(1000 + (b * 100));
		} else {
			temp = Math.max(a, Math.max(b, c)) * 100 ;
			System.out.println(temp);
		}

	}

}
