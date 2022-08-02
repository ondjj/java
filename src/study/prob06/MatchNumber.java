package study.prob06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MatchNumber {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int min = 10;
		int max = 500;

		int random = (int) (Math.random() * (max - min)) + 1;
		int input = 0;
		int count = 0;
		int limit = 10;

		do {

			System.out.println("도전 가능 횟 수 : " + (limit - count));
			count++;
			System.out.print(min + "부터" + max + "사이의 값을 입력하세요 : \n");
			input = scanner.nextInt();

			if (count >= 10) {
				System.out.println(limit + "번 모두 틀렸습니다. 다시 도전하세요.");
				break;
			}

			if (input < 10 || input > 500) {
				System.out.print(">>>" + min + "부터" + max + "사이의 값을 입력하세요 :");
				System.out.println();
			} else {

				if (random > input) {
					System.out.println("더 큰 수를 입력하세요.");

				} else if (random < input) {
					System.out.println("더 작은 수를 입력하세요.");

				} else {
					System.out.println("랜덤 정수는 " + random + " 정답입니다!!");

					System.out.println("시도 횟수는 " + count + "번입니다.");
					break;
				}

			}

		} while (true);
	}
}