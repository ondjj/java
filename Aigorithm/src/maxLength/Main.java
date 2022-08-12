package maxLength;

import java.util.Scanner;

public class Main {
	int solution(int n, int k, int[] arr) {
		int answer = 0;
		int cnt = 0;
		int lt = 0;

		for (int rt = 0; rt < arr.length; rt++) {
			if (arr[rt] == 0) {
				cnt++;
			}
			while (cnt > k) {
				if (arr[lt] == 0) {
					cnt--;
				}
				lt++;
			}
			answer = Math.max(answer, rt - lt + 1);
		}
		return answer;
	}

	public static void main(String[] args) {
		Main t = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		System.out.print(t.solution(n, k, arr));

	}

}