package study.prob06;

import java.util.Scanner;

public class ChildNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count = 1;

		if ((num != 2) && (num != 3) && (num != 5)) {
			if ((num % 2 == 0) || (num % 3 == 0) || (num % 5) == 0) {

				System.out.println(num + "는 솟수가 아닙니다.");
			} else {
				System.out.println(num + "는 솟수입니다.");
			}
		} else {
			System.out.println(num + "는 솟수입니다.");
		}
		System.out.println("=======================================");
		for (int i = 2; i <= 100; i++) {
			if ((i != 2 && i != 3 && i != 5) && ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0))) {
				System.out.printf("%d는 솟수가 아닙니다. \n", i);
			} else {
				System.out.printf("%d는 솟수입니다. \n", i);
				++count;
			}
		}System.out.println("1 - 100까지의 수 중 솟수의 수 : " + count);

		
		System.out.println("=======================================");
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("솟수 아님");
				System.exit(0); // 강제 종료
			} else {
				continue;
			}
		}
		System.out.println("솟수");

	}

}
