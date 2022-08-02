package study.prob05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int H = scanner.nextInt();
		int M = scanner.nextInt();

		if (H == 0) {
			if ((M - 45) < 0) {
				H += 23;
				M = 60 + (M - 45);
				System.out.printf("%d %d",H,M);
			} else {
				M = M - 45;
				System.out.printf("%d %d",H,M);
			}
		} else if (H > 0) {
			if ((M - 45) < 0) {
				H -= 1;
				M = 60 + (M - 45);
				System.out.printf("%d %d",H,M);
			} else {
				M = M - 45;
				
				System.out.printf("%d %d",H,M);
			}

		}
	}

}
