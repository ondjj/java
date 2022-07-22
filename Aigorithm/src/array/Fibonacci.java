package array;

import java.util.Scanner;

class Main {
	public int[] Fibonacci(int n) {

//		// 배열 사용
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;

		for (int i = 2; i < n; i++) {
			answer[i] = answer[i - 2] + answer[i - 1];
		}
//		// 리턴 없는 손코딩
//		int a = 1, b = 1, c;
//		System.out.print(a + " " + b + " ");
//		for (int i = 0; i < n; i++) {
//			c = a + b;
//			System.out.print(c + " ");
//			a = b;
//			b = c;
//		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int x : T.Fibonacci(n))
			System.out.print(x + " ");
//		T.Fibonacci(n);
	}
}