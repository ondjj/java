package primenumber;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

	boolean Prime(int n) {
		if (n == 1)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public ArrayList<Integer> Solution(int n, int[] arr) {

		ArrayList<Integer> answer = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			int temp = arr[i];

			int res = 0;

			while (temp > 0) {

				int t = temp % 10;
				res = res * 10 + t;
				temp = temp / 10;

			}

			if (Prime(res)) {
				answer.add(res);
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

		for (int i : T.Solution(n, arr)) {
			System.out.print(i + " ");
		}

	}

}
