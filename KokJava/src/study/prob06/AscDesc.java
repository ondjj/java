package study.prob06;

import java.util.Scanner;

public class AscDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 100 이하의 다른 정수를 2개 입력 받아 '홀수'인
		// 수를 작은 수 부터 큰 수까지 출력하는 프로그램을 작성해보시오

		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 입력1: ");
		int num1 = scanner.nextInt();

		System.out.print("정수 입력2: ");
		int num2 = scanner.nextInt();

		if ((num1 > 100) || (num2 > 100) || (num1 == num2)) {
			System.out.println("100이하의 서로 다른 정수를 입력해주세요.");
		} else {
			System.out.println("오름차순으로 출력을 시작합니다.");
			 int num3 = num1 < num2 ? num1 : num2;
			 int num4 = num1 > num2 ? num1 : num2;
			for (int i = num3; i <= num4; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}

		}

	}

}
