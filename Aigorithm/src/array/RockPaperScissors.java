package array;

import java.util.Scanner;

class Main {

	public String RockPaperScissors(int[] a, int[] b, int n) {
		String answer = "";

		for (int i = 0; i < n; i++) {
			if (a[i] == b[i])
				answer += "D";
			else if (a[i] == 1 && b[i] == 3)
				answer += "A";
			else if (a[i] == 2 && b[i] == 1)
				answer += "A";
			else if (a[i] == 3 && b[i] == 2)
				answer += "A";
			else
				answer += "B";

		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];

		for (int i = 0; i < A.length; i++) {
			A[i] = in.nextInt();
		}
		for (int i = 0; i < B.length; i++) {
			B[i] = in.nextInt();
		}

		for (char x : T.RockPaperScissors(A, B, N).toCharArray())
			System.out.println(x);
	}
}