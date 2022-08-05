package score;

import java.util.Scanner;

public class Main {

	int score(int n, int[] arr) {
		int answer = 0;
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {

				temp++;
				answer += temp;

			} else {
				temp = 0;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();

		}

		System.out.print(T.score(n, arr));

	}

}
