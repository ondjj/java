package rank;

import java.util.Scanner;

public class Main {

	int[] rank(int n, int[] arr) {
		int[] answer = new int[n];
		int rank = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					rank++;
				} 
			}
			answer[i] = rank;
			rank = 1;
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

		for (int i : T.rank(n, arr)) {
			System.out.print(i + " ");
		}

	}

}
